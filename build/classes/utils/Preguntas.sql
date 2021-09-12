/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  nabet
 * Created: 10/09/2021
 */
CREATE TABLE preguntas(
    idPreguntas int(11) AUTO_INCREMENT PRIMARY KEY,
    Texto varchar(240),
    Valida int(11),
    Categorias_idCategorias int(11),
    FOREIGN KEY (Categorias_idCategorias) REFERENCES categorias(idCategorias)
);
INSERT INTO preguntas VALUES(101, '¿Cuál es el nombre del villano principal en Avengers End Game:', 401, 1);
INSERT INTO preguntas VALUES(102, '¿De que país es Billie Eilish?', 406, 1);
INSERT INTO preguntas VALUES(103, '¿Cuántos hijos tiene Angelina Jolie?', 412, 1);
INSERT INTO preguntas VALUES(104, '¿Cuántos libros de Harry Potter hay?', 416, 1);
INSERT INTO preguntas VALUES(105, '¿Qué Avenger, además del Capitán América, pudo recoger el Mjolnir de Thor en las películas de Marvel?', 417, 1);
INSERT INTO preguntas VALUES(106, '¿Qué país tiene la mayor cantidad de islas en el mundo?', 423, 2);
INSERT INTO preguntas VALUES(107, '¿Cuál es la capital de Canadá?', 427, 2);
INSERT INTO preguntas VALUES(108, '¿Cuál es el río más largo del mundo?', 429, 2);
INSERT INTO preguntas VALUES(109, '¿Cuál es el país más pequeño del mundo?', 433, 2);
INSERT INTO preguntas VALUES(110, '¿Cuál es la cordillera más larga (no más alta) del mundo?', 438, 2);
INSERT INTO preguntas VALUES(111, '¿Dónde se celebrarón los primeros Juegos Olímpicos modernos?', 444, 3);
INSERT INTO preguntas VALUES(112, '¿Qué conductor de la Formula 1 ha ganado más campeonatos?', 445, 3);
INSERT INTO preguntas VALUES(113, '¿Quién es la tercera tenista mujer de todos los tiempos en del Grand Slam?', 451, 3);
INSERT INTO preguntas VALUES(114, '¿Originalmente cómo se llamaba la marca Nike?', 456, 3);
INSERT INTO preguntas VALUES(115, '¿Qué equipo de fútbol se le conoce como ‘The Red Devils’?', 458, 3);
INSERT INTO preguntas VALUES(116, '¿Quién inventó la World Wide Web, y cuándo?', 461, 4);
INSERT INTO preguntas VALUES(117, '¿Cuándo se inauguró el metro de Londres?', 467, 4);
INSERT INTO preguntas VALUES(118, '¿Qué ocurrió el 20 de Julio de 1969?', 470, 4);
INSERT INTO preguntas VALUES(119, '¿Cuándo acabó la II Guerra Mundial?', 474,4);
INSERT INTO preguntas VALUES(120, '¿De qué nacionalidad era Juana de Arco?', 479,4);
INSERT INTO preguntas VALUES(121, 'Los cromosomas están formados por: ', 484, 5);
INSERT INTO preguntas VALUES(122, 'Para los botánicos, el tomate es una:', 485, 5);
INSERT INTO preguntas VALUES(123, '¿Cómo se llama la teoría que considera que todos los organismos descendemos del mismo ancestro?', 491, 5);
INSERT INTO preguntas VALUES(124, 'La columna más a la derecha de la tabla periódica esta compuesta por:', 496, 5);
INSERT INTO preguntas VALUES(125, 'La velocidad a la que viaja la luz es: ', 500, 5);
