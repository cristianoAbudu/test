DROP SCHEMA IF EXISTS FIVEWARE_TEST;

CREATE SCHEMA FIVEWARE_TEST;

DROP TABLE IF exists FIVEWARE_TEST.TASK;

CREATE TABLE FIVEWARE_TEST.TASK(
	codigo MEDIUMINT NOT NULL AUTO_INCREMENT primary key,
	descricao VARCHAR(500),
	realizada boolean,
	status smallint,
	avaliacao smallint
);

SELECT 
	codigo,
	descricao, 
    realizada, 
    status, 
    avaliacao
FROM 
	FIVEWARE_TEST.TASK;