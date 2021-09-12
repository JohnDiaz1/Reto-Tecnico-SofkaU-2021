/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retotecnicosofka;

import java.util.ArrayList;

/**
 *
 * @author nabet
 */
public class Pregunta {

    private int idPregunta;
    private String pregunta;
    private int respuesta;

    public Pregunta() {

    }

    public Pregunta(int idPregunta, String pregunta, int respuesta) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public int getRespuesta() {
        return respuesta;
    }
}
