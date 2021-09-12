/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  nabet
 * Created: 10/09/2021
 */
CREATE TABLE categorias(
	idCategorias int(11) AUTO_INCREMENT PRIMARY KEY,
        nombre varchar(50)
);
INSERT INTO categorias VALUES(1, 'Cultura Pop');
INSERT INTO categorias VALUES(2, 'Geografia');
INSERT INTO categorias VALUES(3, 'Deporte');
INSERT INTO categorias VALUES(4, 'Historia');
INSERT INTO categorias VALUES(5, 'Ciencia');