-- Créer la base
DROP DATABASE IF EXISTS FormationApp;
CREATE DATABASE FormationApp;
USE FormationApp;

-- Créer les 3 Tables
CREATE TABLE Formation(
   idFormation 		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   titre 			VARCHAR(55) NOT NULL,
   prix CURRENCY 	FLOAT(8) NOT NULL,
   description 		VARCHAR(250) NOT NULL,
   lieu 			VARCHAR(50) NOT NULL
);

CREATE TABLE Utilisateur(
   idUser 		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   nom 			VARCHAR(50) NOT NULL,
   email 		VARCHAR(50) NOT NULL
);

CREATE TABLE Commande(
   idCommande 	INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   dateCommande DATE NOT NULL,
   prixTotal 	FLOAT(8) NOT NULL,
   idFormation 	INT UNSIGNED NOT NULL,
   idUser 		INT UNSIGNED NOT NULL,
   PRIMARY KEY(idCommande),
   FOREIGN KEY(idFormation) REFERENCES Formation(idFormation),
   FOREIGN KEY(idUser) REFERENCES Utilisateur(idUser)
);

-- Ajouter des formations dans la base
INSERT INTO Formation (titre, prix, description, lieu) VALUES
	("Designer graphique", 2783.90, "Apprenner a maitriser les outils graphiques...", "Présentiel 2jours par semaines, distanciel le reste: Adresse Champs élyséees Paris" ),
	("Sketchup", 2775.85, "Apprennez a maitriser l'outil Google Sketchup", "Distanciel à 100%"),
	("Manutensionnaire", 753.21, "Vous apprends a porter des lourdes charges de façon sécurisée, et a manipuler les machines de façon sécurisée", "Présentiel: FMS Saint-geours-de-Maren"),
	("Ingénieur informatique", 32863.32, "Formation en alternance 6semaines entreprise 2 semaines en présentiel, donnant accès a un titre profesionnel", "Alternance en entreprise et présentiel: Centre de réadaptation de Mulhouse, à Mulhouse")
;

SELECT * FORM Formation;