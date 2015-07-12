USE OFTALDB;

INSERT INTO oftaldb.estado_civil (`DESCRICAO`) 
	VALUES ('CASADO');
INSERT INTO oftaldb.estado_civil (`DESCRICAO`) 
	VALUES ('SOLTEIRO');

INSERT INTO oftaldb.cor (`DESCRICAO`) 
	VALUES ('BRANCO');
INSERT INTO oftaldb.cor (`DESCRICAO`) 
	VALUES ('NEGRO');

INSERT INTO oftaldb.convenio (`DESCRICAO`) 
	VALUES ('SUS');
INSERT INTO oftaldb.convenio (`DESCRICAO`) 
	VALUES ('UNIMED');

INSERT INTO oftaldb.profissao (`DESCRICAO`) 
	VALUES ('LAVRADOR');
INSERT INTO oftaldb.profissao (`DESCRICAO`) 
	VALUES ('PEDREIRO');

INSERT INTO oftaldb.uf (`SIGLA`) 
	VALUES ('MG');
INSERT INTO oftaldb.uf (`SIGLA`) 
	VALUES ('SP');

INSERT INTO oftaldb.cidade (`DESCRICAO`, `CODESTADO`) 
	VALUES ('PATOS DE MINAS', 1);
INSERT INTO oftaldb.cidade (`DESCRICAO`, `CODESTADO`) 
	VALUES ('ZONA NORTE', 2);

INSERT INTO oftaldb.tipo_telefone (`DESCRICAO`) 
	VALUES ('CELULAR');
INSERT INTO oftaldb.tipo_telefone (`DESCRICAO`) 
	VALUES ('COMERCIAL');
INSERT INTO oftaldb.tipo_telefone (`DESCRICAO`) 
	VALUES ('RESIDENCIAL');


