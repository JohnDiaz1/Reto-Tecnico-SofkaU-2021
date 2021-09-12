/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  nabet
 * Created: 10/09/2021
 */
CREATE TABLE respuestas(
	idRespuestas int(11) AUTO_INCREMENT PRIMARY KEY,
    Respuesta varchar(60),
    Preguntas_idPreguntas int(11),
    FOREIGN KEY (Preguntas_idPreguntas) REFERENCES preguntas(idPreguntas)
);
INSERT INTO respuestas VALUES(401, 'Thanos', 101);
INSERT INTO respuestas VALUES(402, 'Spiderman', 101);
INSERT INTO respuestas VALUES(403, 'Thor', 101);
INSERT INTO respuestas VALUES(404, 'Red Skull', 101);
INSERT INTO respuestas VALUES(405, 'Nueva Zelanda', 102);
INSERT INTO respuestas VALUES(406, 'Estados Unidos', 102);
INSERT INTO respuestas VALUES(407, 'Rusia', 102);
INSERT INTO respuestas VALUES(408, 'China', 102);
INSERT INTO respuestas VALUES(409, '5', 103);
INSERT INTO respuestas VALUES(410, '4', 103);
INSERT INTO respuestas VALUES(411, '8', 103);
INSERT INTO respuestas VALUES(412, '6', 103);
INSERT INTO respuestas VALUES(413, '3', 104);
INSERT INTO respuestas VALUES(414, '5', 104);
INSERT INTO respuestas VALUES(415, '1', 104);
INSERT INTO respuestas VALUES(416, '7', 104);
INSERT INTO respuestas VALUES(417, 'Visión', 105);
INSERT INTO respuestas VALUES(418, 'Hawkey', 105);
INSERT INTO respuestas VALUES(419, 'Hulk', 105);
INSERT INTO respuestas VALUES(420, 'Iron Man', 105);
INSERT INTO respuestas VALUES(421, 'Rusia', 106);
INSERT INTO respuestas VALUES(422, 'Israel', 106);
INSERT INTO respuestas VALUES(423, 'Suecia', 106);
INSERT INTO respuestas VALUES(424, 'Australia', 106);
INSERT INTO respuestas VALUES(425, 'Oslo', 107);
INSERT INTO respuestas VALUES(426, 'Canadá', 107);
INSERT INTO respuestas VALUES(427, 'Otawwa', 107);
INSERT INTO respuestas VALUES(428, 'Okinawa', 107);
INSERT INTO respuestas VALUES(429, 'Amazonas', 108);
INSERT INTO respuestas VALUES(430, 'Nilo', 108);
INSERT INTO respuestas VALUES(431, 'Mississipi', 108);
INSERT INTO respuestas VALUES(432, 'Yangtsé', 108);
INSERT INTO respuestas VALUES(433, 'Vaticano', 109);
INSERT INTO respuestas VALUES(434, 'Italia', 109);
INSERT INTO respuestas VALUES(435, 'Serbia', 109);
INSERT INTO respuestas VALUES(436, 'Hawuai', 109);
INSERT INTO respuestas VALUES(437, 'Montañas Rocosas', 110);
INSERT INTO respuestas VALUES(438, 'Los Andes', 110);
INSERT INTO respuestas VALUES(439, 'Kunlun', 110);
INSERT INTO respuestas VALUES(440, 'Tien Shan', 110);
INSERT INTO respuestas VALUES(441, 'Grecia', 111);
INSERT INTO respuestas VALUES(442, 'Japón', 111);
INSERT INTO respuestas VALUES(443, 'Rusia', 111);
INSERT INTO respuestas VALUES(444, 'Atenas', 111);
INSERT INTO respuestas VALUES(445, 'Michael Schumacher', 112);
INSERT INTO respuestas VALUES(446, 'Juan Pablo Montoya', 112);
INSERT INTO respuestas VALUES(447, 'Fernando Alonso', 112);
INSERT INTO respuestas VALUES(448, 'Lewis Hamilton', 112);
INSERT INTO respuestas VALUES(449, 'Martina Navratilova', 113);
INSERT INTO respuestas VALUES(450, 'Chris Evert', 113);
INSERT INTO respuestas VALUES(451, 'Serena Williams', 113);
INSERT INTO respuestas VALUES(452, 'Virginia Wade', 113);
INSERT INTO respuestas VALUES(453, 'Just Do It', 114);
INSERT INTO respuestas VALUES(454, 'Nik', 114);
INSERT INTO respuestas VALUES(455, 'Kike', 114);
INSERT INTO respuestas VALUES(456, 'Blue Ribbon Sports', 114);
INSERT INTO respuestas VALUES(457, 'Juventus', 115);
INSERT INTO respuestas VALUES(458, 'Manchester United', 115);
INSERT INTO respuestas VALUES(459, 'Real Madrid', 115);
INSERT INTO respuestas VALUES(460, 'Atletico Nacional', 115);
INSERT INTO respuestas VALUES(461, 'Tim Berners-Lee', 116);
INSERT INTO respuestas VALUES(462, 'Steve Jobs', 116);
INSERT INTO respuestas VALUES(463, 'Bill Gates', 116);
INSERT INTO respuestas VALUES(464, 'Mark Zuckerberg', 116);
INSERT INTO respuestas VALUES(465, '1945', 117);
INSERT INTO respuestas VALUES(466, '1845', 117);
INSERT INTO respuestas VALUES(467, '1863', 117);
INSERT INTO respuestas VALUES(468, '1763', 117);
INSERT INTO respuestas VALUES(469, 'Atentado a las torres gemelas', 118);
INSERT INTO respuestas VALUES(470, 'El alunizaje del Apollo 11', 118);
INSERT INTO respuestas VALUES(471, 'Inicia la segunda guerra mundial', 118);
INSERT INTO respuestas VALUES(472, 'Loz Nazis ocupan Francia', 118);
INSERT INTO respuestas VALUES(473, '1940', 119);
INSERT INTO respuestas VALUES(474, '1945', 119);
INSERT INTO respuestas VALUES(475, '1950', 119);
INSERT INTO respuestas VALUES(476, '1942', 119);
INSERT INTO respuestas VALUES(477, 'Inglesa', 120);
INSERT INTO respuestas VALUES(478, 'Italiana', 120);
INSERT INTO respuestas VALUES(479, 'Francesa', 120);
INSERT INTO respuestas VALUES(480, 'Sueca', 120);
INSERT INTO respuestas VALUES(481, 'Proteinas', 121);
INSERT INTO respuestas VALUES(482, 'ARN', 121);
INSERT INTO respuestas VALUES(483, 'Atomos', 121);
INSERT INTO respuestas VALUES(484, 'ADN', 121);
INSERT INTO respuestas VALUES(485, 'Fruta', 122);
INSERT INTO respuestas VALUES(486, 'Verdura', 122);
INSERT INTO respuestas VALUES(487, 'Hortaliza', 122);
INSERT INTO respuestas VALUES(488, 'Baya', 122);
INSERT INTO respuestas VALUES(489, 'Gradualismo', 123);
INSERT INTO respuestas VALUES(490, 'Creacionismo', 123);
INSERT INTO respuestas VALUES(491, 'Darwinismo', 123);
INSERT INTO respuestas VALUES(492, 'Centralismo', 123);
INSERT INTO respuestas VALUES(493, 'Minerales', 124);
INSERT INTO respuestas VALUES(494, 'Haluros', 124);
INSERT INTO respuestas VALUES(495, 'Metales', 124);
INSERT INTO respuestas VALUES(496, 'Gases Nobles', 124);
INSERT INTO respuestas VALUES(497, '300,000 m/s', 125);
INSERT INTO respuestas VALUES(498, '30000 km/h', 125);
INSERT INTO respuestas VALUES(499, '300,000 km/h', 125);
INSERT INTO respuestas VALUES(500, '300,000 km/s', 125);