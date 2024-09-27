-- Pregunta 1
INSERT INTO questions(id, paragraph) VALUES (1, 'Que es la fotosintesis?');
INSERT INTO answers(id, paragraph, verify) VALUES (1, 'Es el proceso mediante el cual las plantas convierten la luz solar en energia, utilizando dioxido de carbono y agua.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (2, 'Es el proceso mediante el cual las plantas absorben nutrientes del suelo y los convierten en energia a traves de la respiracion.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (3, 'Es el proceso por el cual las plantas producen oxigeno mediante la absorcion de nitrogeno del aire.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (4, 'Es un proceso por el cual las plantas crecen mas rapido debido a la energia electrica.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (1, 1);
INSERT INTO answer_question(answer_id, question_id) VALUES (2, 1);
INSERT INTO answer_question(answer_id, question_id) VALUES (3, 1);
INSERT INTO answer_question(answer_id, question_id) VALUES (4, 1);

-- Pregunta 2
INSERT INTO questions(id, paragraph) VALUES (2, 'Cuantos planetas hay en el sistema solar?');
INSERT INTO answers(id, paragraph, verify) VALUES (5, 'Hay cinco planetas: Mercurio, Venus, Tierra, Marte y Jupiter.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (6, 'Hay 15 planetas en el sistema solar: Algunos de ellos son Mercurio, Venus, Tierra, Marte, Jupiter, Saturno, Urano, Neptuno, Pluton, Eris, Haumea, Makemake.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (7, 'Hay ocho planetas reconocidos: Mercurio, Venus, Tierra, Marte, Jupiter, Saturno, Urano y Neptuno.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (8, 'Hay nueve planetas, incluyendo Pluton como un planeta completo.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (5, 2);
INSERT INTO answer_question(answer_id, question_id) VALUES (6, 2);
INSERT INTO answer_question(answer_id, question_id) VALUES (7, 2);
INSERT INTO answer_question(answer_id, question_id) VALUES (8, 2);

-- Pregunta 3
INSERT INTO questions(id, paragraph) VALUES (3, 'Cual es la capital de Francia?');
INSERT INTO answers(id, paragraph, verify) VALUES (9, 'Londres.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (10, 'Roma.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (11, 'Paris.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (12, 'Berlin.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (9, 3);
INSERT INTO answer_question(answer_id, question_id) VALUES (10, 3);
INSERT INTO answer_question(answer_id, question_id) VALUES (11, 3);
INSERT INTO answer_question(answer_id, question_id) VALUES (12, 3);

-- Pregunta 4
INSERT INTO questions(id, paragraph) VALUES (4, 'Cual es el animal terrestre mas rapido?');
INSERT INTO answers(id, paragraph, verify) VALUES (13, 'El leon.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (14, 'El leopardo.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (15, 'El avestruz.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (16, 'El caballo.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (13, 4);
INSERT INTO answer_question(answer_id, question_id) VALUES (14, 4);
INSERT INTO answer_question(answer_id, question_id) VALUES (15, 4);
INSERT INTO answer_question(answer_id, question_id) VALUES (16, 4);

-- Pregunta 5
INSERT INTO questions(id, paragraph) VALUES (5, 'Quien escribio "Don Quijote de la Mancha"?');
INSERT INTO answers(id, paragraph, verify) VALUES (17, 'Gabriel Garcia Marquez.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (18, 'Miguel de Cervantes.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (19, 'Federico Garcia Lorca.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (20, 'Jorge Luis Borges.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (17, 5);
INSERT INTO answer_question(answer_id, question_id) VALUES (18, 5);
INSERT INTO answer_question(answer_id, question_id) VALUES (19, 5);
INSERT INTO answer_question(answer_id, question_id) VALUES (20, 5);

-- Pregunta 6
INSERT INTO questions(id, paragraph) VALUES (6, 'Cual es el oceano mas grande del mundo?');
INSERT INTO answers(id, paragraph, verify) VALUES (21, 'Oceano Atlantico.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (22, 'Oceano Indico.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (23, 'Oceano Pacifico.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (24, 'Oceano Artico.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (21, 6);
INSERT INTO answer_question(answer_id, question_id) VALUES (22, 6);
INSERT INTO answer_question(answer_id, question_id) VALUES (23, 6);
INSERT INTO answer_question(answer_id, question_id) VALUES (24, 6);

-- Pregunta 7
INSERT INTO questions(id, paragraph) VALUES (7, 'En que continente se encuentra Egipto?');
INSERT INTO answers(id, paragraph, verify) VALUES (25, 'America.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (26, 'Europa.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (27, 'Africa.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (28, 'Asia.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (25, 7);
INSERT INTO answer_question(answer_id, question_id) VALUES (26, 7);
INSERT INTO answer_question(answer_id, question_id) VALUES (27, 7);
INSERT INTO answer_question(answer_id, question_id) VALUES (28, 7);

-- Pregunta 8
INSERT INTO questions(id, paragraph) VALUES (8, 'Cual es el metal más abundante en la Tierra?');
INSERT INTO answers(id, paragraph, verify) VALUES (29, 'Plata.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (30, 'Aluminio.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (31, 'Oro.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (32, 'Hierro.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (29, 8);
INSERT INTO answer_question(answer_id, question_id) VALUES (30, 8);
INSERT INTO answer_question(answer_id, question_id) VALUES (31, 8);
INSERT INTO answer_question(answer_id, question_id) VALUES (32, 8);

-- Pregunta 9
INSERT INTO questions(id, paragraph) VALUES (9, 'Cual es el pais mas grande del mundo?');
INSERT INTO answers(id, paragraph, verify) VALUES (33, 'Estados Unidos.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (34, 'China.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (35, 'Rusia.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (36, 'Canada.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (33, 9);
INSERT INTO answer_question(answer_id, question_id) VALUES (34, 9);
INSERT INTO answer_question(answer_id, question_id) VALUES (35, 9);
INSERT INTO answer_question(answer_id, question_id) VALUES (36, 9);

-- Pregunta 10
INSERT INTO questions(id, paragraph) VALUES (10, 'Cual es el pais mas poblado del mundo?');
INSERT INTO answers(id, paragraph, verify) VALUES (37, 'India.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (38, 'China.', true);
INSERT INTO answers(id, paragraph, verify) VALUES (39, 'Estados Unidos.', false);
INSERT INTO answers(id, paragraph, verify) VALUES (40, 'Indonesia.', false);

INSERT INTO answer_question(answer_id, question_id) VALUES (37, 10);
INSERT INTO answer_question(answer_id, question_id) VALUES (38, 10);
INSERT INTO answer_question(answer_id, question_id) VALUES (39, 10);
INSERT INTO answer_question(answer_id, question_id) VALUES (40, 10);
