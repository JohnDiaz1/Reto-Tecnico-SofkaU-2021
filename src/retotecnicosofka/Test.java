/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retotecnicosofka;

import access.PreguntaDAO;
import access.RespuestaDAO;
import access.UsuarioDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nabet
 */
public class Test {

    private ArrayList<Pregunta> preguntas;
    private ArrayList<Respuesta> respuesta;
    Respuesta r = new Respuesta();
    UsuarioDAO usuario;
    private int acomuladoTotal;
    private int preguntaActual = 1;
    private String nombre;
    int resUsuario;

    RespuestaDAO respuestas;

    public Test() {
    }

    public int getAcomuladoTotal() {
        return acomuladoTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPreguntaActual() {
        return preguntaActual;
    }

    public void siguientePregunta() {
        preguntaActual++;

        switch (preguntaActual) {
            case 2:
                acomuladoTotal = acomuladoTotal + 10;
                break;
            case 3:
                acomuladoTotal = acomuladoTotal + 30;
                break;
            case 4:
                acomuladoTotal = acomuladoTotal + 50;
                break;
            case 5:
                acomuladoTotal = acomuladoTotal + 100;
        }
    }

    public void reiniciarTest() {
        preguntaActual = 6;
        usuario.comprobarExistencia(nombre, acomuladoTotal);
        System.out.println("El Programa finalizo correctamente"
                + "\n" + "Total acomulado: 0");
        System.exit(0);
    }

    public void mostrarRespuestas() {
        System.out.println("\n" + "Ronda: " + preguntaActual + "\t" + "Acomulado: " + acomuladoTotal);
        System.out.println("\n" + preguntas.get(0).getPregunta());

        for (int i = 0; i < respuesta.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + respuesta.get(i));
        }

        System.out.print("Escribe el numero de la respuesta correcta: ");
    }

    public void comprobarRespuesta() {

        String validar = respuesta.get(resUsuario).getRespuesta();
        r = respuestas.obtenerRespuesta(preguntas.get(0).getIdPregunta());

        if (validar.equals(r.getRespuesta())) {
            System.out.println("correcto");
            siguientePregunta();
        } else {
            System.out.println("Incorrecto");
            reiniciarTest();
        }
    }

    private void haGanado() {
        System.out.println("Felicitaciones ha ganado un total de: " + acomuladoTotal + " puntos");
        usuario.comprobarExistencia(nombre, acomuladoTotal);
        System.exit(0);
    }

    public void iniciarTest() {
        while (preguntaActual != 6) {

            PreguntaDAO pregunta = new PreguntaDAO();
            respuestas = new RespuestaDAO();
            usuario = new UsuarioDAO();
            Random random = new Random();
            Scanner sc = new Scanner(System.in);

            int id = 0;

            switch (preguntaActual) {
                case 1:
                    id = (random.nextInt(105 - 101 + 1) + 101);
                    break;
                case 2:
                    id = (random.nextInt(110 - 106 + 1) + 106);
                    break;
                case 3:
                    id = (random.nextInt(115 - 111 + 1) + 111);
                    break;
                case 4:
                    id = (random.nextInt(120 - 116 + 1) + 116);
                    break;
                case 5:
                    id = (random.nextInt(125 - 121 + 1) + 121);
                    break;
            }

            preguntas = pregunta.cargarPregunta(id, preguntaActual);
            respuesta = respuestas.cargarRespuestas(preguntas.get(0).getIdPregunta());
            mostrarRespuestas();
            resUsuario = sc.nextInt() - 1;

            if (resUsuario == 5) {
                reiniciarTest();
            }

            comprobarRespuesta();
        }

        haGanado();

    }

    public void pressEnterContinue() {
        try {
            //Pausa la consola hasta que se presione ENTER
            System.in.read();

        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
