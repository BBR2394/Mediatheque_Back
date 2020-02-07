INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (1, 'Jean', 'Dujardin',1);
INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (2, 'Gerard', 'Depardieu',3);
INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (3, 'Didier', 'Bourdon',4);
INSERT INTO Acteur (id,prenom,nom,id_film) VALUES (4, 'Dany', 'Boon',2);

INSERT INTO Film (id,titre,id_film, format, genre) VALUES (1,'Brice de nice', 'James Huth', 'HD','COMEDIE');
INSERT INTO Film (id,titre,id_film, format, genre) VALUES (2,'Bienvenue chez les ch tis', 'Dany Boon', 'DVD','COMEDIE');
INSERT INTO Film (id,titre,id_film, format, genre) VALUES (3,'Cyrano de Bergenrac', 'Jean-Paul Rappeneau', 'VHS','AVENTURE');
INSERT INTO Film (id,titre,id_film, format, genre) VALUES (4,'Les 3 frères', 'Didier Bourdon & Bernard Campan', 'HD' ,'COMEDIE');

INSERT INTO Musique (id,titre,date, duree, support, genre, album) VALUES (1, 'It was a good day', 'Ice Cube', '01/01/1992',312,'VINYL','RAP', 'Predator');
INSERT INTO Musique (id,titre,date, duree, support, genre, album) VALUES (2, 'Amstrong', 'Claude Nougaro', '01/01/1967',323,'CD','JAZZ', 'Bidonville');

INSERT INTO Livre (id,titre,date, type, format, genre) VALUES (1, 'Le petit prince', 'Antoine de Saint Exupéry', '01/01/1943','POCHE', 'FANTASY');
INSERT INTO Livre (id,titre,date, type, format, genre) VALUES (2, 'Fahrenheit 451', 'Ray Bradbury', '09/10/1953','POCHE', 'SF');

INSERT INTO Utilisateur (id, nom, prenom, age, dateNaissance, adresse, dateAdhesion, actif) VALUES (1,'Lasalle', 'Jean', '65','12/11/1955','12 rue du moulin','05/05/2018',1);
INSERT INTO Utilisateur (id, nom, prenom, age, dateNaissance, adresse, dateAdhesion, actif) VALUES (2,'Duflot', 'Cecile', '38','12/11/1982','1222 boulevard de Metz','05/05/2017',0);
INSERT INTO Utilisateur (id, nom, prenom, age, dateNaissance, adresse, dateAdhesion, actif) VALUES (1,'Delavillardière', 'Bernard', '55','12/11/1965','25 rue du piedmontin','05/11/2018',1);

INSERT INTO Employee (id, nom, prenom, age, dateNaissance, adresse, dateAdhesion, actif) VALUES (1,'Muset', 'Claude', '70','02/11/1950','45 avenue du général De Gaulle','cadre', '05/05/2018');

