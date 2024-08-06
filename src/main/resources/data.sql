 
INSERT INTO department(department_name) VALUES ('Financeiro');
INSERT INTO department(department_name) VALUES ('Informática');
INSERT INTO department(department_name) VALUES ('RH');
INSERT INTO department(department_name) VALUES ('Faturamento');


INSERT INTO perfil(perfil_name) VALUES ('Auxiliar');
INSERT INTO perfil(perfil_name) VALUES ('Diretor');
INSERT INTO perfil(perfil_name) VALUES ('Gerente');
INSERT INTO perfil(perfil_name) VALUES ('Estagiario');


INSERT INTO licenca (`ativo`, `bairro`, `cep`, `cidade`, `cnpj`, `data_ativacao`, `endereco`, `nome`, `uf`) VALUES
(true,'CENTRO', '78850000', 'PRIMAVERA DO LESTE', '40387145000101', '2024-06-25', 'RUA A', 'ABNER MACIEL', 'MT');


INSERT INTO paciente (id_licenca, nome, cpf, data_nascimento, profissao, altura, peso, telefone) VALUES
(1, 'Mariana Silva', '32165498700', '1992-03-15', 'Nutricionista', '1.68', '58', '(21) 9123-4567'),
(1, 'João Pedro', '65498732112', '1980-06-30', 'Fisioterapeuta', '1.80', '75', '(31) 9345-6789'),
(1, 'Fernanda Oliveira', '78912345634', '1995-09-21', 'Farmacêutica', '1.72', '62', '(41) 9567-8901'),
(1, 'Rafael Souza', '45612378956', '1988-04-10', 'Psicólogo', '1.78', '68', '(51) 9678-0123'),
(1, 'Bruna Lima', '98732165400', '1993-11-05', 'Dentista', '1.66', '60', '(61) 9789-1234'),
(1, 'Carlos Eduardo', '12378945678', '1985-07-18', 'Médico', '1.85', '80', '(71) 9890-2345'),
(1, 'Tatiane Ribeiro', '23456789123', '1991-02-14', 'Fonoaudióloga', '1.63', '55', '(81) 9901-3456'),
(1, 'Roberto Martins', '34567891234', '1978-12-22', 'Fisioterapeuta', '1.75', '70', '(91) 9012-4567'),
(1, 'Juliana Costa', '45678912345', '1987-05-09', 'Psicóloga', '1.70', '64', '(31) 9123-5678'),
(1, 'Renato Alves', '56789123456', '1990-08-30', 'Enfermeiro', '1.80', '75', '(41) 9234-6789'),
(1, 'Patrícia Mendes', '67891234567', '1994-10-11', 'Nutricionista', '1.65', '59', '(51) 9345-7890'),
(1, 'Thiago Fernandes', '78912345678', '1989-06-16', 'Dentista', '1.82', '77', '(61) 9456-8901'),
(1, 'Gabriela Almeida', '89123456789', '1991-01-24', 'Médica', '1.68', '60', '(71) 9567-9012'),
(1, 'Vinícius Rocha', '91234567890', '1984-11-30', 'Fisioterapeuta', '1.79', '72', '(81) 9678-0123'),
(1, 'Larissa Moreira', '12345678012', '1992-03-07', 'Psicóloga', '1.67', '58', '(91) 9789-1234');


INSERT INTO procedimento (codigo_tuss, descricao, porte, porte_anestesico, grupo, subgrupo, cirurgia) VALUES
('123456', 'Revascularização do Miocárdio', '4', 4, 'Cirurgias', 'cardíacas', true),
('654321', 'Troca de Válvula Aórtica', '4', 4, 'Cirurgias', 'cardíacas', true),
('789012', 'Implante de Marcapasso', '3', 3, 'Cirurgias', 'cardíacas', true),
('345678', 'Cateterismo Cardíaco', '2', 2, 'Cirurgias', 'cardíacas', true),
('901234', 'Correção de Aneurisma de Aorta', '4', 4, 'Cirurgias', 'cardíacas', true),
('567890', 'Ablação de Arritmia', '3', 3, 'Cirurgias', 'cardíacas', true),
('234567', 'Reparo de Valva Mitral', '4', 4, 'Cirurgias', 'cardíacas', true),
('890123', 'Reparo de Defeito Septal', '3', 3, 'Cirurgias', 'cardíacas', true),
('456789', 'Bypass Gástrico', '4', 4, 'Cirurgias', 'bariátricas', true),
('123789', 'Colecistectomia', '3', 3, 'Cirurgias', 'gastrointestinais', true),
('789456', 'Herniorrafia', '2', 2, 'Cirurgias', 'gastrointestinais', true),
('012345', 'Hemicolectomia', '4', 4, 'Cirurgias', 'gastrointestinais', true),
('678901', 'Gastrectomia', '4', 4, 'Cirurgias', 'gastrointestinais', true),
('345012', 'Histerectomia', '3', 3, 'Cirurgias', 'ginecológicas', true),
('901678', 'Ooforectomia', '3', 3, 'Cirurgias', 'ginecológicas', true);


INSERT INTO risco (nome, descricao) VALUES
('BAIXO RISCO', 'Mama, dentária, endócrina, oftalmológica, ginecológica, reconstrutiva, ortopédica de pequeno porte, urológica de pequeno porte'),
('RISCO INTERMEDIARIO', 'Abdominal, carótidas, ATC periférica, reparo aneurisma endovascular, cabeça e pescoço, neurológica, ortopédica grande, transplantes renais e pulmonares e hepáticos e urológica extensa.'),
('ALTO RISCO', 'Aorta e grande vasos; Vascular periférica');


INSERT INTO preditores (descricao) VALUES
('SD CORONARIANAS INSTÁVEIS'),
('ARRITMIAS SIGNIFICATIVAS'),
('DISFUNÇÃO VENTRICULAR ESQUERDA'),
('DIABETES MELLITUS'),
('HIPERTENSÃO ARTERIAL'),
('OBESIDADE'),
('IDADE AVANÇADA'),
('DOENÇA RENAL CRÔNICA');

INSERT INTO USUARIO (User_name, User_login, User_email, User_senha) VALUES 
('Unirio Mello Junior', 'junior', 'unirio.mello@gmail.com', 'junior');

INSERT INTO classificacao (descricao, ponto) VALUES 
('IAM < 6 MESES', 10),
('IAM > 6 MESES', 5),
('Angina de peito Classe CCS III', 10),
('Angina de peito Classe CCS IV', 20),
('Edema Agudo de Pulmão < 1 semana', 10),
('Edema Agudo de Pulmão > 1 semana', 5),
('Estenose Aórtica grave', 20),
('Ritmo não sinusal ou Extra-sístoles supraventriculares', 5),
('Mais de 5 extra-sístoles ventriculares em qualquer ECG', 5),
('PO2 < 60mmHg, PCO2 > 50mmHg, K+ < 3,0mEq/L, Uréia > 100mg/dL, Creatinina > 3mg/dL, paciente acamado', 10),
('Idade > 70 anos', 5),
('Cirurgia de emergência', 10);








