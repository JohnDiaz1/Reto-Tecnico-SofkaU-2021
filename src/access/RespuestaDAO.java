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
import retotecnicosofka.Respuesta;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class RespuestaDAO {

    private Connection conn;
    private PreparedStatement statement;

    public ArrayList<Respuesta> cargarRespuestas(int idPregunta) {

        ArrayList<Respuesta> respuestas = new ArrayList<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = " SELECT Respuesta FROM respuestas"
                        + " JOIN preguntas ON preguntas_idPreguntas = idPreguntas"
                        + " WHERE idPreguntas = '" + idPregunta + "';";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    Respuesta respuesta = new Respuesta(result.getString(1));
                    respuestas.add(respuesta);
                }

                statement.close();
                conn = null;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuestas;
    }

    public Respuesta obtenerRespuesta(int validar) {
        Respuesta respuesta = null;
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = " SELECT respuesta FROM respuestas"
                        + " JOIN preguntas ON idPreguntas = Preguntas_idPreguntas"
                        + " AND valida = idRespuestas WHERE idPreguntas = '" + validar + "';";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    respuesta = new Respuesta(result.getString(1));
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return respuesta;
    }

}
