/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import retotecnicosofka.Pregunta;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class PreguntaDAO {

    private Connection conn;
    private PreparedStatement statement;

    public ArrayList<Pregunta> cargarPregunta(int idPregunta, int idCategoria) {

        ArrayList<Pregunta> preguntaArray = new ArrayList<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = " SELECT idPreguntas, Texto, Valida FROM preguntas"
                        + " WHERE idPreguntas = '" + idPregunta + "' AND Categorias_idCategorias ='" + idCategoria + "';";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    Pregunta pregunta = new Pregunta(result.getInt(1), result.getString(2), result.getInt(3));
                    preguntaArray.add(pregunta);
                }

                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return preguntaArray;
    }

}
