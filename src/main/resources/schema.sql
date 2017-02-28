DROP TABLE Type;
DROP TABLE RelationType;
DROP TABLE Pokemon;

CREATE TABLE Type (
	id_type INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	nom_type VARCHAR(50) NOT NULL,
	ordre_type INT
	);
	
CREATE TABLE RelationType(
	id_relation_type INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	id_type_attaque INT NOT NULL,
	valeur FLOAT NOT NULL,
	id_type_subi INT NOT NULL
	);
	
CREATE TABLE Pokemon (
	id_pokemon INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
	nom_pokemon VARCHAR(50),
	id_type_premier INT,
	id_type_second INT
	);
	
COMMIT;