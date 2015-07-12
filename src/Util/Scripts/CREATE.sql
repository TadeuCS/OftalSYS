CREATE DATABASE IF NOT EXISTS OFTALDB;
USE OFTALDB;
CREATE TABLE STATUS_ATENDIMENTO (CODSTATUS_ATENDIMENTO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODSTATUS_ATENDIMENTO));
CREATE TABLE TIPO_GRAU (CODTIPO_GRAU int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(100) NOT NULL UNIQUE, CODLADO int(10) NOT NULL, PRIMARY KEY (CODTIPO_GRAU));
CREATE TABLE ESPECIFICACAO (CODESPECIFICACAO int(10) NOT NULL AUTO_INCREMENT, CODRECEITA_OCULOS int(10) NOT NULL, CODGRAU int(10) NOT NULL, CODTIPO_GRAU int(10) NOT NULL, PRIMARY KEY (CODESPECIFICACAO));
CREATE TABLE LADO (CODLADO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(100) NOT NULL UNIQUE, CODDISTANCIA int(10) NOT NULL, PRIMARY KEY (CODLADO));
CREATE TABLE GRAU (CODGRAU int(10) NOT NULL AUTO_INCREMENT, PORCENTAGEM float NOT NULL UNIQUE, SIMBOLO char(1) NOT NULL, PRIMARY KEY (CODGRAU));
CREATE TABLE DISTANCIA (CODDISTANCIA int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(20) NOT NULL UNIQUE, PRIMARY KEY (CODDISTANCIA));
CREATE TABLE RECEITA_OCULOS (CODRECEITA_OCULOS int(10) NOT NULL AUTO_INCREMENT, OBSERVACAO varchar(255), PRIMARY KEY (CODRECEITA_OCULOS));
CREATE TABLE RECEITA_MEDICAMENTO (CODRECEITA_MEDICAMENTO int(10) NOT NULL AUTO_INCREMENT, CODATENDIMENTO int(10) NOT NULL, CODMEDICAMENTO int(10) NOT NULL, PRESCRICAO varchar(255), QUANTIDADE int(10) NOT NULL, PRIMARY KEY (CODRECEITA_MEDICAMENTO));
CREATE TABLE FORNECEDOR (CODFORNECEDOR int(10) NOT NULL AUTO_INCREMENT, NOME varchar(255) NOT NULL, CPF_CNPJ varchar(16), PRIMARY KEY (CODFORNECEDOR));
CREATE TABLE PAGAR (CODPAGAR int(10) NOT NULL AUTO_INCREMENT, VALOR numeric(19, 2) NOT NULL, DESCONTO numeric(19, 2) NOT NULL, DT_EMISSAO date NOT NULL, DT_VENCIMENTO date NOT NULL, DT_PAGAMENTO date, CODFORNECEDOR int(10) NOT NULL, CODSTATUS int(10) NOT NULL, PRIMARY KEY (CODPAGAR));
CREATE TABLE LANCAMENTO_BANCO (CODLANCAMENTO int(10) NOT NULL, DESCRICAO varchar(255) NOT NULL, DT_LANCAMENTO datetime NOT NULL, VALOR numeric(19, 2) NOT NULL, CONCILIADO char(1) NOT NULL, CODTIPO_LANCAMENTO int(10) NOT NULL, CODCONTA int(10) NOT NULL, CODRECEBER int(10), CODPAGAR int(10) NOT NULL, PRIMARY KEY (CODLANCAMENTO, CODPAGAR));
CREATE TABLE CONTA (CODCONTA int(10) NOT NULL AUTO_INCREMENT, NUM_CONTA int(10) NOT NULL UNIQUE, CODAGENCIA int(10) NOT NULL, PRIMARY KEY (CODCONTA));
CREATE TABLE AGENCIA (CODAGENCIA int(10) NOT NULL AUTO_INCREMENT, NUM_AGENCIA int(10) NOT NULL UNIQUE, CODBANCO int(10) NOT NULL, PRIMARY KEY (CODAGENCIA));
CREATE TABLE BANCO (CODBANCO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODBANCO));
CREATE TABLE CARTAO (CODCARTAO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL, TAXA_RETENCAO float NOT NULL, PRIMARY KEY (CODCARTAO));
CREATE TABLE TIPO_LANCAMENTO (CODTIPO_LANCAMENTO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(20) NOT NULL UNIQUE, PRIMARY KEY (CODTIPO_LANCAMENTO));
CREATE TABLE LANCAMENTO_CAIXA (CODLANCAMENTO_CAIXA int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL, DT_LANCAMENTO datetime NOT NULL, VALOR numeric(19, 2) NOT NULL, CODTIPO_LANCAMENTO int(10) NOT NULL, CODRECEBER int(10), CODPAGAR int(10), PRIMARY KEY (CODLANCAMENTO_CAIXA));
CREATE TABLE STATUS_MOVIMENTACAO (CODSTATUS int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODSTATUS));
CREATE TABLE TIPO_USUARIO (CODTIPO_USUARIO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODTIPO_USUARIO));
CREATE TABLE STATUS_USUARIO (CODSTATUS_USUARIO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(20) NOT NULL UNIQUE, PRIMARY KEY (CODSTATUS_USUARIO));
CREATE TABLE USUARIO (CODUSUARIO int(10) NOT NULL AUTO_INCREMENT, USUARIO varchar(15) NOT NULL UNIQUE, SENHA varchar(100) NOT NULL, CODSTATUS_USUARIO int(10) NOT NULL, CODTIPO_USUARIO int(10) NOT NULL, PRIMARY KEY (CODUSUARIO));
CREATE TABLE RECEBER (CODRECEBER int(10) NOT NULL AUTO_INCREMENT, PARCELA int(10) NOT NULL, VALOR numeric(19, 2) NOT NULL, DESCONTO numeric(19, 2) NOT NULL, DT_EMISSAO date NOT NULL, DT_VENCIMENTO date NOT NULL, DT_PAGAMENTO date, CODUSUARIO int(10) NOT NULL, CODSTATUS int(10) NOT NULL, CODATENDIMENTO int(10) NOT NULL, CODCARTAO int(10), PRIMARY KEY (CODRECEBER));
CREATE TABLE MEDICAMENTO (CODMEDICAMENTO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODMEDICAMENTO));
CREATE TABLE TIPO_ATENDIMENTO (CODTIPO_ATENDIMENTO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(100) NOT NULL UNIQUE, PRIMARY KEY (CODTIPO_ATENDIMENTO));
CREATE TABLE ATENDIMENTO (CODATENDIMENTO int(10) NOT NULL AUTO_INCREMENT, DT_ATENDIMENTO datetime NOT NULL UNIQUE, DT_RETORNO date, QUEIXA varchar(255), CODPACIENTE int(10) NOT NULL, CODTIPO_ATENDIMENTO int(10) NOT NULL, CODMEDICO int(10) NOT NULL, CODSTATUS_ATENDIMENTO int(10) NOT NULL, CODRECEITA_OCULOS int(10), PRIMARY KEY (CODATENDIMENTO));
CREATE TABLE CONVENIO (CODCONVENIO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODCONVENIO));
CREATE TABLE TIPO_TELEFONE (CODTIPO_TELEFONE int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(40) NOT NULL UNIQUE, PRIMARY KEY (CODTIPO_TELEFONE));
CREATE TABLE TELEFONE (CODTELEFONE int(10) NOT NULL AUTO_INCREMENT, NUMERO varchar(15) NOT NULL, CODTIPO_TELEFONE int(10) NOT NULL, CODCLIENTE int(10), CODFORNECEDOR int(10), PRIMARY KEY (CODTELEFONE));
CREATE TABLE UF (CODESTADO int(10) NOT NULL AUTO_INCREMENT, SIGLA char(2) NOT NULL UNIQUE, PRIMARY KEY (CODESTADO));
CREATE TABLE CIDADE (CODCIDADE int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, CODESTADO int(10) NOT NULL, PRIMARY KEY (CODCIDADE));
CREATE TABLE CEP (CODCEP int(10) NOT NULL AUTO_INCREMENT, CEP varchar(9) NOT NULL, RUA varchar(255) NOT NULL, BAIRRO varchar(255) NOT NULL, CODCIDADE int(10) NOT NULL, PRIMARY KEY (CODCEP));
CREATE TABLE ENDERECO (CODENDERECO int(10) NOT NULL AUTO_INCREMENT, NUMERO int(10) NOT NULL, COMPLEMENTO varchar(160), CODCEP int(10) NOT NULL, CODCLIENTE int(10), CODFORNECEDOR int(10), PRIMARY KEY (CODENDERECO));
CREATE TABLE ESTADO_CIVIL (CODESTADO_CIVIL int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODESTADO_CIVIL));
CREATE TABLE COR (CODCOR int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODCOR));
CREATE TABLE PROFISSAO (CODPROFISSAO int(10) NOT NULL AUTO_INCREMENT, DESCRICAO varchar(255) NOT NULL UNIQUE, PRIMARY KEY (CODPROFISSAO));
CREATE TABLE PACIENTE (CODPACIENTE int(10) NOT NULL AUTO_INCREMENT, NOME varchar(255) NOT NULL, DT_NASCIMENTO date NOT NULL, CPF varchar(14) NOT NULL UNIQUE, RG varchar(20) NOT NULL UNIQUE, SEXO char(1) NOT NULL, EMAIL varchar(255), NATURALIDADE varchar(255), PLANO varchar(100), NUM_CARTEIRA int(10), CODPROFISSAO int(10) NOT NULL, CODCOR int(10) NOT NULL, CODESTADO_CIVIL int(10) NOT NULL, CODCONVENIO int(10), PRIMARY KEY (CODPACIENTE));
ALTER TABLE RECEITA_MEDICAMENTO ADD INDEX FKRECEITA_ME214705 (CODMEDICAMENTO), ADD CONSTRAINT FKRECEITA_ME214705 FOREIGN KEY (CODMEDICAMENTO) REFERENCES MEDICAMENTO (CODMEDICAMENTO);
ALTER TABLE RECEITA_MEDICAMENTO ADD INDEX FKRECEITA_ME622104 (CODATENDIMENTO), ADD CONSTRAINT FKRECEITA_ME622104 FOREIGN KEY (CODATENDIMENTO) REFERENCES ATENDIMENTO (CODATENDIMENTO);
ALTER TABLE PAGAR ADD INDEX FKPAGAR704320 (CODSTATUS), ADD CONSTRAINT FKPAGAR704320 FOREIGN KEY (CODSTATUS) REFERENCES STATUS_MOVIMENTACAO (CODSTATUS);
ALTER TABLE PAGAR ADD INDEX FKPAGAR224331 (CODFORNECEDOR), ADD CONSTRAINT FKPAGAR224331 FOREIGN KEY (CODFORNECEDOR) REFERENCES FORNECEDOR (CODFORNECEDOR);
ALTER TABLE TELEFONE ADD INDEX FKTELEFONE986581 (CODFORNECEDOR), ADD CONSTRAINT FKTELEFONE986581 FOREIGN KEY (CODFORNECEDOR) REFERENCES FORNECEDOR (CODFORNECEDOR);
ALTER TABLE ENDERECO ADD INDEX FKENDERECO426154 (CODFORNECEDOR), ADD CONSTRAINT FKENDERECO426154 FOREIGN KEY (CODFORNECEDOR) REFERENCES FORNECEDOR (CODFORNECEDOR);
ALTER TABLE LANCAMENTO_BANCO ADD INDEX FKLANCAMENTO684843 (CODPAGAR), ADD CONSTRAINT FKLANCAMENTO684843 FOREIGN KEY (CODPAGAR) REFERENCES PAGAR (CODPAGAR);
ALTER TABLE LANCAMENTO_CAIXA ADD INDEX FKLANCAMENTO765489 (CODPAGAR), ADD CONSTRAINT FKLANCAMENTO765489 FOREIGN KEY (CODPAGAR) REFERENCES PAGAR (CODPAGAR);
ALTER TABLE LANCAMENTO_BANCO ADD INDEX FKLANCAMENTO93225 (CODRECEBER), ADD CONSTRAINT FKLANCAMENTO93225 FOREIGN KEY (CODRECEBER) REFERENCES RECEBER (CODRECEBER);
ALTER TABLE LANCAMENTO_BANCO ADD INDEX FKLANCAMENTO429078 (CODCONTA), ADD CONSTRAINT FKLANCAMENTO429078 FOREIGN KEY (CODCONTA) REFERENCES CONTA (CODCONTA);
ALTER TABLE LANCAMENTO_BANCO ADD INDEX FKLANCAMENTO920159 (CODTIPO_LANCAMENTO), ADD CONSTRAINT FKLANCAMENTO920159 FOREIGN KEY (CODTIPO_LANCAMENTO) REFERENCES TIPO_LANCAMENTO (CODTIPO_LANCAMENTO);
ALTER TABLE CONTA ADD INDEX FKCONTA251155 (CODAGENCIA), ADD CONSTRAINT FKCONTA251155 FOREIGN KEY (CODAGENCIA) REFERENCES AGENCIA (CODAGENCIA);
ALTER TABLE AGENCIA ADD INDEX FKAGENCIA513530 (CODBANCO), ADD CONSTRAINT FKAGENCIA513530 FOREIGN KEY (CODBANCO) REFERENCES BANCO (CODBANCO);
ALTER TABLE RECEBER ADD INDEX FKRECEBER733996 (CODCARTAO), ADD CONSTRAINT FKRECEBER733996 FOREIGN KEY (CODCARTAO) REFERENCES CARTAO (CODCARTAO);
ALTER TABLE RECEBER ADD INDEX FKRECEBER787940 (CODATENDIMENTO), ADD CONSTRAINT FKRECEBER787940 FOREIGN KEY (CODATENDIMENTO) REFERENCES ATENDIMENTO (CODATENDIMENTO);
ALTER TABLE LANCAMENTO_CAIXA ADD INDEX FKLANCAMENTO173871 (CODRECEBER), ADD CONSTRAINT FKLANCAMENTO173871 FOREIGN KEY (CODRECEBER) REFERENCES RECEBER (CODRECEBER);
ALTER TABLE LANCAMENTO_CAIXA ADD INDEX FKLANCAMENTO806 (CODTIPO_LANCAMENTO), ADD CONSTRAINT FKLANCAMENTO806 FOREIGN KEY (CODTIPO_LANCAMENTO) REFERENCES TIPO_LANCAMENTO (CODTIPO_LANCAMENTO);
ALTER TABLE RECEBER ADD INDEX FKRECEBER675342 (CODSTATUS), ADD CONSTRAINT FKRECEBER675342 FOREIGN KEY (CODSTATUS) REFERENCES STATUS_MOVIMENTACAO (CODSTATUS);
ALTER TABLE ATENDIMENTO ADD INDEX FKATENDIMENT322479 (CODMEDICO), ADD CONSTRAINT FKATENDIMENT322479 FOREIGN KEY (CODMEDICO) REFERENCES USUARIO (CODUSUARIO);
ALTER TABLE RECEBER ADD INDEX FKRECEBER716613 (CODUSUARIO), ADD CONSTRAINT FKRECEBER716613 FOREIGN KEY (CODUSUARIO) REFERENCES USUARIO (CODUSUARIO);
ALTER TABLE USUARIO ADD INDEX FKUSUARIO14843 (CODTIPO_USUARIO), ADD CONSTRAINT FKUSUARIO14843 FOREIGN KEY (CODTIPO_USUARIO) REFERENCES TIPO_USUARIO (CODTIPO_USUARIO);
ALTER TABLE USUARIO ADD INDEX FKUSUARIO183626 (CODSTATUS_USUARIO), ADD CONSTRAINT FKUSUARIO183626 FOREIGN KEY (CODSTATUS_USUARIO) REFERENCES STATUS_USUARIO (CODSTATUS_USUARIO);
ALTER TABLE ATENDIMENTO ADD INDEX FKATENDIMENT750411 (CODTIPO_ATENDIMENTO), ADD CONSTRAINT FKATENDIMENT750411 FOREIGN KEY (CODTIPO_ATENDIMENTO) REFERENCES TIPO_ATENDIMENTO (CODTIPO_ATENDIMENTO);
ALTER TABLE ATENDIMENTO ADD INDEX FKATENDIMENT154372 (CODPACIENTE), ADD CONSTRAINT FKATENDIMENT154372 FOREIGN KEY (CODPACIENTE) REFERENCES PACIENTE (CODPACIENTE);
ALTER TABLE TELEFONE ADD INDEX FKTELEFONE395439 (CODCLIENTE), ADD CONSTRAINT FKTELEFONE395439 FOREIGN KEY (CODCLIENTE) REFERENCES PACIENTE (CODPACIENTE);
ALTER TABLE TELEFONE ADD INDEX FKTELEFONE987805 (CODTIPO_TELEFONE), ADD CONSTRAINT FKTELEFONE987805 FOREIGN KEY (CODTIPO_TELEFONE) REFERENCES TIPO_TELEFONE (CODTIPO_TELEFONE);
ALTER TABLE ENDERECO ADD INDEX FKENDERECO835011 (CODCLIENTE), ADD CONSTRAINT FKENDERECO835011 FOREIGN KEY (CODCLIENTE) REFERENCES PACIENTE (CODPACIENTE);
ALTER TABLE ENDERECO ADD INDEX FKENDERECO806982 (CODCEP), ADD CONSTRAINT FKENDERECO806982 FOREIGN KEY (CODCEP) REFERENCES CEP (CODCEP);
ALTER TABLE CEP ADD INDEX FKCEP894812 (CODCIDADE), ADD CONSTRAINT FKCEP894812 FOREIGN KEY (CODCIDADE) REFERENCES CIDADE (CODCIDADE);
ALTER TABLE CIDADE ADD INDEX FKCIDADE771401 (CODESTADO), ADD CONSTRAINT FKCIDADE771401 FOREIGN KEY (CODESTADO) REFERENCES UF (CODESTADO);
ALTER TABLE PACIENTE ADD INDEX FKPACIENTE993165 (CODESTADO_CIVIL), ADD CONSTRAINT FKPACIENTE993165 FOREIGN KEY (CODESTADO_CIVIL) REFERENCES ESTADO_CIVIL (CODESTADO_CIVIL);
ALTER TABLE PACIENTE ADD INDEX FKPACIENTE282618 (CODCOR), ADD CONSTRAINT FKPACIENTE282618 FOREIGN KEY (CODCOR) REFERENCES COR (CODCOR);
ALTER TABLE PACIENTE ADD INDEX FKPACIENTE766694 (CODPROFISSAO), ADD CONSTRAINT FKPACIENTE766694 FOREIGN KEY (CODPROFISSAO) REFERENCES PROFISSAO (CODPROFISSAO);
ALTER TABLE ATENDIMENTO ADD INDEX FKATENDIMENT866040 (CODSTATUS_ATENDIMENTO), ADD CONSTRAINT FKATENDIMENT866040 FOREIGN KEY (CODSTATUS_ATENDIMENTO) REFERENCES STATUS_ATENDIMENTO (CODSTATUS_ATENDIMENTO);
ALTER TABLE TIPO_GRAU ADD INDEX FKTIPO_GRAU700495 (CODLADO), ADD CONSTRAINT FKTIPO_GRAU700495 FOREIGN KEY (CODLADO) REFERENCES LADO (CODLADO);
ALTER TABLE LADO ADD INDEX FKLADO157828 (CODDISTANCIA), ADD CONSTRAINT FKLADO157828 FOREIGN KEY (CODDISTANCIA) REFERENCES DISTANCIA (CODDISTANCIA);
ALTER TABLE ESPECIFICACAO ADD INDEX FKESPECIFICA80242 (CODTIPO_GRAU), ADD CONSTRAINT FKESPECIFICA80242 FOREIGN KEY (CODTIPO_GRAU) REFERENCES TIPO_GRAU (CODTIPO_GRAU);
ALTER TABLE ATENDIMENTO ADD INDEX FKATENDIMENT31287 (CODRECEITA_OCULOS), ADD CONSTRAINT FKATENDIMENT31287 FOREIGN KEY (CODRECEITA_OCULOS) REFERENCES RECEITA_OCULOS (CODRECEITA_OCULOS);
ALTER TABLE ESPECIFICACAO ADD INDEX FKESPECIFICA243393 (CODRECEITA_OCULOS), ADD CONSTRAINT FKESPECIFICA243393 FOREIGN KEY (CODRECEITA_OCULOS) REFERENCES RECEITA_OCULOS (CODRECEITA_OCULOS);
ALTER TABLE ESPECIFICACAO ADD INDEX FKESPECIFICA571309 (CODGRAU), ADD CONSTRAINT FKESPECIFICA571309 FOREIGN KEY (CODGRAU) REFERENCES GRAU (CODGRAU);
ALTER TABLE PACIENTE ADD INDEX FKPACIENTE118561 (CODCONVENIO), ADD CONSTRAINT FKPACIENTE118561 FOREIGN KEY (CODCONVENIO) REFERENCES CONVENIO (CODCONVENIO);

