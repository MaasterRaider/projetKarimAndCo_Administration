/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.bdd;

/**
 *
 * @author c.nadal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe d'accès aux données contenant des membres statiques afin de manipuler
 * la BDD ON implémente ici le Design Pattern Singleton
 *
 * @author nc
 */
public class DaoSIO {

    /**
     * Membres static (de classe)
     *
     */
    private static String nomServeur = "www.cnadal.fr";
    private static String port = "3306";
    private static String nomBdd = "sio2_cv";
    private static String nomUtilisateur = "sio2_cv";
    private static String motDePasse = "formation2020";

    private static String chaineConnexion;

    //propriété non statique
    private Connection connexion;

    private static DaoSIO monDao = null;

    /**
     * Constructeur privé ! pour construire un objet, il faut utiliser la
     * méthode publique statique getDaoSIO
     */
    private DaoSIO() {
        try {
            //Définition de l'emplacement de la BDD
            DaoSIO.chaineConnexion = "jdbc:mysql://" + DaoSIO.nomServeur + "/" + DaoSIO.nomBdd;

            //Création de la connexion à la BDD
            this.connexion = (Connection) DriverManager.getConnection(DaoSIO.chaineConnexion, DaoSIO.nomUtilisateur, DaoSIO.motDePasse);

        } catch (SQLException ex) {
            Logger.getLogger(DaoSIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Permet d'obtenir l'objet instancié
     *
     * @return un Objet DaoSIO avec connexion active ... pour une certaine durée
     */
    public static DaoSIO getInstance() {
        if (DaoSIO.monDao == null) {
            DaoSIO.monDao = new DaoSIO();
        } else {
            if (!DaoSIO.monDao.connexionActive()) {
                DaoSIO.monDao = new DaoSIO();
            }
        }
        return DaoSIO.monDao;
    }

    /**
     * Cette méthode vérifie si il y a déjà une connexion active
     *
     * @return Boolean true or false
     */
    public Boolean connexionActive() {
        Boolean connexionActive = true;

        try {
            if (this.connexion.isClosed()) {
                connexionActive = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoSIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connexionActive;
    }

    /**
     * Cette méthode permet d'exécuter une requête SQL de type SELECT
     *
     * @param sql, comportera un ordre selec
     * @return ResultSet résultat de la requête SQL
     */
    public ResultSet requeteSelection(String sql) {
        try {
            Statement requete = new DaoSIO().connexion.createStatement();
            return requete.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DaoSIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Cette méthode permet d'exécuter une requête SQL de type INSERT, UPDATE,
     * DELETE, ...
     *
     * @param sql, comportera un ordre insert, update, select, alter, etc.
     * @return Integer le nombre de lignes impactées par la requête action
     */
    public Integer requeteAction(String sql) {
        try {
            Statement requete = new DaoSIO().connexion.createStatement();
            return requete.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DaoSIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public String[][] requeteSelectAllAdmin(String sql) {
        String[][] resultat = null;

        if (this.connexion != null) {
            Boolean error_connexion = false;
            while (error_connexion == false) {
                try {

                    int nbr_ligne = 0;
                    ResultSet res = DaoSIO.getInstance().requeteSelection("SELECT COUNT(*) FROM utilisateurs");
                    while (res.next()) {
                        nbr_ligne = res.getInt(1);
                    }

                    ResultSet lesTuples = DaoSIO.getInstance().requeteSelection(sql);
                    int nbr_colonne = lesTuples.getMetaData().getColumnCount() + 1;
                    int compteur_ligne = 0;

                    resultat = new String[nbr_ligne][nbr_colonne];

                    while (lesTuples.next()) {
                        for (int i = 1; i < nbr_colonne; i++) {
                            String col_name = lesTuples.getMetaData().getColumnName(i);

                            resultat[compteur_ligne][i] = lesTuples.getString(col_name);
                        }
                        compteur_ligne++;
                    }
                    error_connexion = true;
                } catch (SQLException ex) {
                    if (ex.toString().contains("com.mysql.jdbc.exceptions.jdbc4.CommunicationsException: Communications link failure")) {
                        error_connexion = false;
                        this.connexion = null;
                        this.connexionActive();
                    } else {
                        Logger.getLogger(DaoSIO.class.getName()).log(Level.SEVERE, null, ex);
                        error_connexion = true;
                    }
                }
            }
        }
        return resultat;
    }
    
    public String[] requeteSelectAllUpdateAdmin(String sql) {
        String[] resultat = new String[10];

        if (this.connexion != null) {
            Boolean error_connexion = false;

            while (error_connexion == false) {
                try {
                    ResultSet lesTuples_bis = DaoSIO.getInstance().requeteSelection(sql);

                    // on attend au max 1 Tuple !!!!!
                    if (lesTuples_bis.next()) {
                        ResultSet lesTuples = DaoSIO.getInstance().requeteSelection("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'utilisateurs'");

                        Integer i = 0;

                        while (lesTuples.next()) {
                            resultat[i] = lesTuples_bis.getString(lesTuples.getString("COLUMN_NAME"));
                            i++;
                        }
                    }
                    error_connexion = true;
                } catch (SQLException ex) {
                    if (ex.toString().contains("com.mysql.jdbc.exceptions.jdbc4.CommunicationsException: Communications link failure")) {
                        error_connexion = false;
                        this.connexion = null;
                        this.connexionActive();
                    } else {
                        Logger.getLogger(DaoSIO.class.getName()).log(Level.SEVERE, null, ex);
                        error_connexion = true;
                    }
                }
            }
        }
        return resultat;
    }
}
