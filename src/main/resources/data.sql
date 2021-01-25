insert into quadrinho(id,titulo,descricao,data) values(1,'Quadrinho #1 THOR','Essa é a descrição do quadrinho 1','2020-03-11');
insert into quadrinho(id,titulo,descricao,data) values(2,'Quadrinho #2 HULK','Essa é a descrição do quadrinho 2','1995-08-04');
insert into quadrinho(id,titulo,descricao,data) values(3,'Quadrinho #3 HOMEM DE FERRO','Essa é a descrição do quadrinho 3','1987-04-25');
insert into quadrinho(id,titulo,descricao,data) values(4,'Quadrinho #4 CAPITÃO AMÉRICA','Essa é a descrição do quadrinho 4','1914-03-01');
insert into quadrinho(id,titulo,descricao,data) values(5,'Quadrinho #5 OS VINGADORES','Essa é a descrição do quadrinho 5','2020-02-07');

insert into serie(id,titulo,descricao) values(1,'Série #1 THOR','Essa é a descrição da série 1');
insert into serie(id,titulo,descricao) values(2,'Série #2 HULK','Essa é a descrição da série 2');
insert into serie(id,titulo,descricao) values(3,'Série #3 HOMEM DE FERRO','Essa é a descrição da série 3');
insert into serie(id,titulo,descricao) values(4,'Série #4 CAPITÃO AMÉRICA','Essa é a descrição da série 4');
insert into serie(id,titulo,descricao) values(5,'Série #5 OS VINGADORES','Essa é a descrição da série 5');

insert into evento(id,titulo,descricao) values(1,'Evento #1 THOR','Essa é a descrição do evento 1');
insert into evento(id,titulo,descricao) values(2,'Evento #2 HULK','Essa é a descrição do evento 2');
insert into evento(id,titulo,descricao) values(3,'Evento #3 HOMEM DE FERRO','Essa é a descrição do evento 3');
insert into evento(id,titulo,descricao) values(4,'Evento #4 CAPITÃO AMÉRICA','Essa é a descrição do evento 4');
insert into evento(id,titulo,descricao) values(5,'Evento #5 OS VINGADORES','Essa é a descrição do evento 5');

insert into historia(id,titulo,descricao) values(1,'Hitória #1 THOR','Essa é a descrição da história 1');
insert into historia(id,titulo,descricao) values(2,'Hitória #2 HULK','Essa é a descrição da história 2');
insert into historia(id,titulo,descricao) values(3,'Hitória #3 HOMEM DE FERRO','Essa é a descrição da história 3');
insert into historia(id,titulo,descricao) values(4,'Hitória #4 CAPITÃO AMÉRICA','Essa é a descrição da história 4');
insert into historia(id,titulo,descricao) values(5,'Hitória #5 OS VINGADORES','Essa é a descrição da história 5');


insert into miniatura(id,path,extensao) values(1,'https://kanto.legiaodosherois.com.br/w760-h398-gnw-cfill-q80/wp-content/uploads/2020/07/legiao_Fa7c_yT0JxZz.jpg.jpeg', 'jpeg');
insert into miniatura(id,path,extensao) values(2,'https://kanto.legiaodosherois.com.br/w760-h398-gnw-cfill-q80/wp-content/uploads/2020/05/legiao__mOauNs4nAf8.jpg.jpeg', 'jpeg');
insert into miniatura(id,path,extensao) values(3,'https://kanto.legiaodosherois.com.br/w760-h398-gnw-cfill-q80/wp-content/uploads/2020/09/legiao_NHWEp3eQLAxd.jpg.jpeg', 'jpeg');
insert into miniatura(id,path,extensao) values(4,'https://kanto.legiaodosherois.com.br/w760-h398-cfill/wp-content/uploads/2021/01/legiao_LJbKln4u8ZTC.png.jpeg', 'jpeg');


insert into personagem(id,nome,descricao,alteracao,recursoURI,miniatura,quadrinhosURI,seriesURI,eventosURI,historiasURI) 
values(
	1
	,'Thor'
	,'Como o deus nórdico do trovão e do relâmpago, Thor empunha uma das maiores armas já feitas, o martelo encantado Mjolnir. Enquanto outros descreveram Thor como um imbecil muito musculoso e estúpido, ele é bastante inteligente e compassivo.'
	,'2020-03-11 10:18:57'
	,'http://localhost:8080/v1/public/personagens/1'
	,1
	,'http://localhost:8080/v1/public/personagens/1/quadrinhos'
	,'http://localhost:8080/v1/public/personagens/1/series'
	,'http://localhost:8080/v1/public/personagens/1/eventos'
	,'http://localhost:8080/v1/public/personagens/1/historias'
);

insert into personagem(id,nome,descricao,alteracao,recursoURI,miniatura,quadrinhosURI,seriesURI,eventosURI,historiasURI) 
values(
	2
	,'Hulk'
	,'Pego em uma explosão de bomba gama enquanto tentava salvar a vida de um adolescente, o Dr. Bruce Banner foi transformado na criatura incrivelmente poderosa chamada Hulk.'
	,'1995-08-04 10:02:08'
	,'http://localhost:8080/v1/public/personagens/2'
	,2
	,'http://localhost:8080/v1/public/personagens/2/quadrinhos'
	,'http://localhost:8080/v1/public/personagens/2/series'
	,'http://localhost:8080/v1/public/personagens/2/eventos'
	,'http://localhost:8080/v1/public/personagens/2/historias'
);

insert into personagem(id,nome,descricao,alteracao,recursoURI,miniatura,quadrinhosURI,seriesURI,eventosURI,historiasURI) 
values(
	3
	,'Homem de ferro'
	,'Ferido, capturado e forçado a construir uma arma por seus inimigos, o industrial bilionário Tony Stark criou uma armadura avançada para salvar sua vida e escapar do cativeiro.'
	,'1987-04-25 22:18:57'
	,'http://localhost:8080/v1/public/personagens/3'
	,3
	,'http://localhost:8080/v1/public/personagens/3/quadrinhos'
	,'http://localhost:8080/v1/public/personagens/3/series'
	,'http://localhost:8080/v1/public/personagens/3/eventos'
	,'http://localhost:8080/v1/public/personagens/3/historias'
);

insert into personagem(id,nome,descricao,alteracao,recursoURI,miniatura,quadrinhosURI,seriesURI,eventosURI,historiasURI) 
values(
	4
	,'Capitão América'
	,'Prometendo servir seu país de qualquer maneira que pudesse, o jovem Steve Rogers tomou o soro do super soldado para se tornar o exército de um homem só da América.'
	,'1914-03-01 05:25:45'
	,'http://localhost:8080/v1/public/personagens/4'
	,4
	,'http://localhost:8080/v1/public/personagens/4/quadrinhos'
	,'http://localhost:8080/v1/public/personagens/4/series'
	,'http://localhost:8080/v1/public/personagens/4/eventos'
	,'http://localhost:8080/v1/public/personagens/4/historias'
);

insert into personagem_quadrinho(id_quadrinho, id_personagem) values(1,1);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(2,2);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(3,3);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(4,4);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(5,1);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(5,2);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(5,3);
insert into personagem_quadrinho(id_quadrinho, id_personagem) values(5,4);

insert into personagem_serie(id_serie, id_personagem) values(1,1);
insert into personagem_serie(id_serie, id_personagem) values(2,2);
insert into personagem_serie(id_serie, id_personagem) values(3,3);
insert into personagem_serie(id_serie, id_personagem) values(4,4);
insert into personagem_serie(id_serie, id_personagem) values(5,1);
insert into personagem_serie(id_serie, id_personagem) values(5,2);
insert into personagem_serie(id_serie, id_personagem) values(5,3);
insert into personagem_serie(id_serie, id_personagem) values(5,4);

insert into personagem_evento(id_evento, id_personagem) values(1,1);
insert into personagem_evento(id_evento, id_personagem) values(2,2);
insert into personagem_evento(id_evento, id_personagem) values(3,3);
insert into personagem_evento(id_evento, id_personagem) values(4,4);
insert into personagem_evento(id_evento, id_personagem) values(5,1);
insert into personagem_evento(id_evento, id_personagem) values(5,2);
insert into personagem_evento(id_evento, id_personagem) values(5,3);
insert into personagem_evento(id_evento, id_personagem) values(5,4);

insert into personagem_historia(id_historia, id_personagem) values(1,1);
insert into personagem_historia(id_historia, id_personagem) values(2,2);
insert into personagem_historia(id_historia, id_personagem) values(3,3);
insert into personagem_historia(id_historia, id_personagem) values(4,4);
insert into personagem_historia(id_historia, id_personagem) values(5,1);
insert into personagem_historia(id_historia, id_personagem) values(5,2);
insert into personagem_historia(id_historia, id_personagem) values(5,3);
insert into personagem_historia(id_historia, id_personagem) values(5,4);
