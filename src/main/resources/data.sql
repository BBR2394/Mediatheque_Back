INSERT INTO document (id, titre, auteur, date_Publication) VALUES (1,'Brice de nice', 'James Huth', '2006-04-06');
INSERT INTO document (id, titre, auteur, date_Publication) VALUES (2,'Bienvenue chez les ch tis', 'Dany Boon', '2008-02-20');
INSERT INTO document (id, titre, auteur, date_Publication) VALUES (3,'Cyrano de Bergenrac', 'Jean-Paul Rappeneau', '1990-03-28');
INSERT INTO document (id, titre, auteur, date_Publication) VALUES (4,'Les 3 frères', 'Didier Bourdon & Bernard Campan', '1995-12-13');

INSERT INTO Film (id, format, genre) VALUES (1, 'HD','COMEDIE');
INSERT INTO Film (id, format, genre) VALUES (2, 'DVD','COMEDIE');
INSERT INTO Film (id, format, genre) VALUES (3, 'VHS','AVENTURE');
INSERT INTO Film (id, format, genre) VALUES (4, 'HD' ,'COMEDIE');

INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (1, 'Jean', 'Dujardin',1);
INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (2, 'Gerard', 'Depardieu',3);
INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (3, 'Didier', 'Bourdon',4);
INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (4, 'Dany', 'Boon',2);

INSERT INTO document (id, titre, auteur, date_Publication) VALUES (5,'It was a good day', 'Ice Cube', '1992-01-01');
INSERT INTO document (id, titre, auteur, date_Publication) VALUES (6,'Amstrong', 'Claude Nougaro', '1967-01-01');

INSERT INTO Musique (id, duree, support, genre, album) VALUES (5, 312,'VINYL','RAP', 'Predator');
INSERT INTO Musique (id, duree, support, genre, album) VALUES (6, 323,'CD','JAZZ', 'Bidonville');

INSERT INTO document (id, titre, auteur, date_Publication) VALUES (7,'Le petit prince', 'Antoine de Saint Exupéry', '1943-01-01');
INSERT INTO document (id, titre, auteur, date_Publication) VALUES (8,'Fahrenheit 451', 'Ray Bradbury', '1953-10-09');

INSERT INTO Livre (id, type, format, genre) VALUES (7, 'ROMAN','POCHE', 'FANTASY');
INSERT INTO Livre (id, type, format, genre) VALUES (8, 'ROMAN','POCHE', 'SF');

INSERT INTO Personne (id, nom, prenom, date_Naissance, adresse) values (1,'Muset', 'Claude','1950-11-02','45 avenue du général De Gaulle');

INSERT INTO Employee (id, poste, date_embauche) VALUES (1,'cadre', '2018-05-05');

INSERT INTO Personne (id, nom, prenom, date_Naissance, adresse) values (2,'Lasalle', 'Jean','1955-11-02','45 avenue du général De Gaulle');
INSERT INTO Personne (id, nom, prenom, date_Naissance, adresse) values (3,'Duflot', 'Cecile','1982-11-12','1222 boulevard de Metz');
INSERT INTO Personne (id, nom, prenom, date_Naissance, adresse) values (4,'Delavillardière', 'Bernard','1965-11-12','25 rue du piedmontin');

INSERT INTO Utilisateur (id, date_Adhesion, actif) VALUES (2,'2018-05-05',true);
INSERT INTO Utilisateur (id, date_Adhesion, actif) VALUES (3,'2017-05-05',false);
INSERT INTO Utilisateur (id, date_Adhesion, actif) VALUES (4,'2018-05-11',true);
