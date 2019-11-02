![enter image description here](https://www.freepngimg.com/thumb/java/1-2-java-free-png-image.png)
<br>
### ProjetKarimAndCo - composant 4 : Espace Administrateur 

----------


#### Introduction

Ce projet correspond à une application permettant de gérer le parcours professionnel des étudiants du BTS SIO. Le composant disponible ci dessus est l'espace administrateur de l'application.  


#### Fonctionnalités

Avec ce composant, on peut :

    -   Voir les différents utilisateurs créer
    -   Créer un utilisateur
    -   Supprimer un utilisateur 
    -   Supprimer tout les utilisateurs
    -   Supprimer Modifier les valeurs d'un utilisateur 



#### Documentation

Javadoc :  [cliquez-ici](F:\INFORMATIQUE\SIO\Programmation\Java\jajajajadoc\dist\javadoc\index.html)  
Document utilisateur :  [cliquez-ici](https://docs.google.com/document/d/1SoZUUYuQD3gA_-CL9Uf7U8R_goBUg8Na-MeSQCfs1do/edit?usp=sharing)



#### Dépendances utilisés

![](https://camo.githubusercontent.com/e71a535aee6717248ae0781c46eb8a29921e8503/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f636f6d6d6f6e732d2d6e65742d332e362d73756363657373)

![](https://camo.githubusercontent.com/282d36be0305dc452569a329684d267381146c1d/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6d7973716c2d2d636f6e6e6563746f722d2d6a6176612d352e312e34382d73756363657373)




#### Mise en marche du composant
1) Télécharger le composant en cliquant sur le bouton vert "Clone or Download" puis "Download ZIP".
2) Dézipper le projet puis l'ouvrir avec votre IDE 
3) Copier coller les trois packages "com.karimandco.admin", "com.karimandco.auth" et "com.karimandco.bdd dans votre nouveau projet 
4) Ajouter la librairie JCBD à votre projet
Sur NetBeans clic droit sur le projet, propriété, Libraries, add Library. Si la Library JCBD n'existe pas aller sur 
[https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)
5) Ajouter les deux dépendances "commons-net" puis "mysql-connector-java".
Sur NetBeans clic droit sur le projet, propriété, Libraries, add JAR/Folder.
Dépendances :  [cliquez-ici](https://drive.google.com/drive/folders/1dKuqR9ON-Xatcf9F6PNjLwxOV_AhOw_f?usp=sharing)  

Info importante :
    - Il se peut que le package "com.karimandco.auth" soit mise à jour assez régulièrement.Pour télécharger la dernière version  [cliquez-ici](https://github.com/pawel956/projetKarimAndCo_ConnexionInscription/)




#### Informations divers
Les actions de suppression sont protégées par un identifiant et un mot de passe administrateur.
<br>
Identifiant : Admin
<br>
Mot de passe : 123456
<br><br>
Le panneau qui contient l'espace administrateur : PanneauAdministration.java
La connexion a la base de donnée se fais avec la classe DaoSio
