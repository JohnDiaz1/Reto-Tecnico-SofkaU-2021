/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retotecnicosofka;

/**
 *
 * @author nabet
 */
public class Respuesta {

    private String respuesta;
    boolean correcta;

    public Respuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Respuesta() {

    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }

    @Override
    public String toString() {
        return respuesta;
    }
}
