/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.auth;

import com.karimandco.bdd.DaoSIO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author Damien F, Pawel R, Théo M
 */
public class PanneauFormInscription extends javax.swing.JPanel {

    javax.swing.JDialog panneauPereInscription = null;

    private Boolean nomOK = false;
    private Boolean prenomOK = false;
    private Boolean identifiantOK = false;
    private Boolean courrielOK = false;
    private Boolean numeroTelephoneOK = false;
    private Boolean dateNaissanceOK = false;
    private Boolean mdpOK = false;

    private Boolean inscriptionOK = false;

    /**
     * Ce constructeur permet d'initialiser le nom des labels et de générer les
     * KeyListener pour capturer les actions.
     */
    public PanneauFormInscription() {
        initComponents();

        panneauNom.setjLabelNomChamp("Nom");
        panneauPrenom.setjLabelNomChamp("Prénom");
        panneauIdentifiant.setjLabelNomChamp("Identifiant");
        panneauCourriel.setjLabelNomChamp("Courriel");
        panneauNumeroTelephone.setjLabelNomChamp("Numéro de téléphone");
        panneauDateNaissance.setjLabelNomChamp("Date de naissance (jj/mm/aaaa)");

        panneauMdp.setjLabelNomChampSecret("Mot de passe (6 à 12 chiffres)");
        panneauMdpConfirmation.setjLabelNomChampSecret("Confirmation du mot de passe");

        KeyListener(panneauNom, 0);
        KeyListener(panneauPrenom, 1);
        KeyListener(panneauIdentifiant, 2);
        KeyListener(panneauCourriel, 3);
        KeyListener(panneauNumeroTelephone, 4);
        KeyListener(panneauDateNaissance, 5);

        KeyListener(panneauMdp);
        KeyListener(panneauMdpConfirmation);
    }

    public void setNomOK(Boolean nomOK) {
        this.nomOK = nomOK;
    }

    public void setPrenomOK(Boolean prenomOK) {
        this.prenomOK = prenomOK;
    }

    public void setIdentifiantOK(Boolean identifiantOK) {
        this.identifiantOK = identifiantOK;
    }

    public void setCourrielOK(Boolean courrielOK) {
        this.courrielOK = courrielOK;
    }

    public void setNumeroTelephoneOK(Boolean numeroTelephoneOK) {
        this.numeroTelephoneOK = numeroTelephoneOK;
    }

    public void setDateNaissanceOK(Boolean dateNaissanceOK) {
        this.dateNaissanceOK = dateNaissanceOK;
    }

    public void setMdpOK(Boolean mdpOK) {
        this.mdpOK = mdpOK;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setFenParentInscription(javax.swing.JDialog i) {
        this.panneauPereInscription = i;
    }

    public Boolean getInscriptionOK() {
        return inscriptionOK;
    }

    public void setInscriptionOK(Boolean inscriptionOK) {
        this.inscriptionOK = inscriptionOK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panneauNom = new com.karimandco.auth.PanneauChamp();
        panneauPrenom = new com.karimandco.auth.PanneauChamp();
        panneauIdentifiant = new com.karimandco.auth.PanneauChamp();
        panneauCourriel = new com.karimandco.auth.PanneauChamp();
        panneauNumeroTelephone = new com.karimandco.auth.PanneauChamp();
        panneauDateNaissance = new com.karimandco.auth.PanneauChamp();
        jButton1 = new javax.swing.JButton();
        jLabelEtatInscription = new javax.swing.JLabel();
        panneauMdp = new com.karimandco.auth.PanneauChampSecret();
        panneauMdpConfirmation = new com.karimandco.auth.PanneauChampSecret();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inscription");

        jButton1.setText("S'inscrire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelEtatInscription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panneauNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panneauPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panneauIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panneauCourriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panneauNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panneauDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panneauMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panneauMdpConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEtatInscription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panneauPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauCourriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panneauMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panneauMdpConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEtatInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (nomOK && prenomOK && identifiantOK && courrielOK && numeroTelephoneOK && dateNaissanceOK && mdpOK) {
            String[] date_split = this.panneauDateNaissance.getChamp2().getText().split("/");
            String date_newFormat = date_split[2] + "-" + date_split[1] + "-" + date_split[0];

            String mdp_sha256 = Cryptage.sha256(Cryptage.sha256(String.valueOf(this.panneauMdp.getChampSecret1().getPassword())));

            if (DaoSIO.getInstance().requeteAction("INSERT INTO utilisateurs (nom, prenom, identifiant, courriel, num_telephone, date_de_naissance, mot_de_passe, photo) VALUES ('" + this.panneauNom.getChamp2().getText() + "', '" + this.panneauPrenom.getChamp2().getText() + "', '" + this.panneauIdentifiant.getChamp2().getText() + "', '" + this.panneauCourriel.getChamp2().getText() + "', '" + this.panneauNumeroTelephone.getChamp2().getText() + "', '" + date_newFormat + "', '" + mdp_sha256 + "', '')") > 0) {
                jLabelEtatInscription.setForeground(Color.blue);
                jLabelEtatInscription.setText("Inscription réussi");
                this.setInscriptionOK(true);
            } else {
                jLabelEtatInscription.setForeground(Color.red);
                jLabelEtatInscription.setText("Echec de l'inscription");
                this.setInscriptionOK(false);
            }
        } else {
            jLabelEtatInscription.setForeground(Color.red);
            jLabelEtatInscription.setText("Champ(s) manquant(s)");
            this.setInscriptionOK(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEtatInscription;
    private com.karimandco.auth.PanneauChamp panneauCourriel;
    private com.karimandco.auth.PanneauChamp panneauDateNaissance;
    private com.karimandco.auth.PanneauChamp panneauIdentifiant;
    private com.karimandco.auth.PanneauChampSecret panneauMdp;
    private com.karimandco.auth.PanneauChampSecret panneauMdpConfirmation;
    private com.karimandco.auth.PanneauChamp panneauNom;
    private com.karimandco.auth.PanneauChamp panneauNumeroTelephone;
    private com.karimandco.auth.PanneauChamp panneauPrenom;
    // End of variables declaration//GEN-END:variables

    /**
     * Cette méthode permet de générer un KeyListener pour les panneaux champ.
     *
     * @param champ PanneauChamp champ
     * @param numeroVerif Integer numéro du champ
     */
    private void KeyListener(PanneauChamp champ, Integer numeroVerif) {
        champ.getChamp2().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                updateJLabelEtat(champ, numeroVerif);
            }
        });
    }

    /**
     * Cette méthode permet de générer un KeyListener pour les panneaux champ
     * secret.
     *
     * @param champ PanneauChampSecret champ
     */
    private void KeyListener(PanneauChampSecret champ) {
        champ.getChampSecret1().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                updateJLabelEtat(champ);
            }
        });
    }

    /**
     * Cette méthode permet de mettre à jour les JLabelEtat des champs
     *
     * @param champ PanneauChamp champ
     * @param numeroVerif Integer numéro du champ à vérifier
     */
    public void updateJLabelEtat(PanneauChamp champ, Integer numeroVerif) {
        Boolean resultat = null;
        if (!champ.getChamp2().getText().equals("")) {
            if (numeroVerif == 0) {
                resultat = champ.getChamp2().verifNom();
                setNomOK(resultat);
            } else if (numeroVerif == 1) {
                resultat = champ.getChamp2().verifPrenom();
                setPrenomOK(resultat);
            } else if (numeroVerif == 2) {
                resultat = champ.getChamp2().verifIdentifiant();
                setIdentifiantOK(resultat);
            } else if (numeroVerif == 3) {
                resultat = champ.getChamp2().verifCourriel();
                setCourrielOK(resultat);
            } else if (numeroVerif == 4) {
                resultat = champ.getChamp2().verifNumeroTelephone();
                setNumeroTelephoneOK(resultat);
            } else if (numeroVerif == 5) {
                resultat = champ.getChamp2().verifDateNaissance();
                setDateNaissanceOK(resultat);
            }

            if (resultat == true) {
                champ.setjLabelEtatChamp(Color.blue);
                champ.setjLabelEtatChamp("Format ok");
            } else {
                champ.setjLabelEtatChamp(Color.red);
                champ.setjLabelEtatChamp("Format non ok");
            }
        } else {
            champ.setjLabelEtatChamp(Color.black);
            champ.setjLabelEtatChamp("");
        }
    }

    /**
     * Cette méthode permet de mettre à jour les JLabelEtat des champs secrets
     *
     * @param champ PanneauChampSecret champ
     */
    public void updateJLabelEtat(PanneauChampSecret champ) {
        if (!String.valueOf(champ.getChampSecret1().getPassword()).equals("")) {
            if (String.valueOf(panneauMdpConfirmation.getChampSecret1().getPassword()).equals(String.valueOf(panneauMdp.getChampSecret1().getPassword()))) {
                if (panneauMdpConfirmation.getChampSecret1().verifPassword() && panneauMdp.getChampSecret1().verifPassword()) {
                    setMdpOK(champ.getChampSecret1().verifPassword());
                    panneauMdpConfirmation.setjLabelEtatChampSecret(Color.blue);
                    panneauMdp.setjLabelEtatChampSecret(Color.blue);
                    panneauMdpConfirmation.setjLabelEtatChampSecret("Correspondance ok");
                    panneauMdp.setjLabelEtatChampSecret("Correspondance ok");
                } else {
                    panneauMdpConfirmation.setjLabelEtatChampSecret(Color.red);
                    panneauMdp.setjLabelEtatChampSecret(Color.red);
                    panneauMdpConfirmation.setjLabelEtatChampSecret("Format non ok");
                    panneauMdp.setjLabelEtatChampSecret("Format non ok");
                }
            } else {
                panneauMdpConfirmation.setjLabelEtatChampSecret(Color.red);
                panneauMdp.setjLabelEtatChampSecret(Color.red);
                panneauMdpConfirmation.setjLabelEtatChampSecret("Correspondance non ok");
                panneauMdp.setjLabelEtatChampSecret("Correspondance non ok");
            }
        } else {
            champ.setjLabelEtatChampSecret(Color.black);
            champ.setjLabelEtatChampSecret("");
        }
    }

}
