/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retotecnicosofka;

import access.UsuarioDAO;
import java.util.Scanner;

/**
 *
 * @author nabet
 */
public class RetoTecnicoSofka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
        UsuarioDAO historico = new UsuarioDAO();
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println("\t" + "\t" + " Bienvenido a este juego de preguntas"
                + "\n" + "\n" + "REGLAS:"
                + "\n" + "\n" + "Este juego Consta de 5 rondas en la cual la siguiente pregunta es mas dificil que la anterior"
                + "\n" + "Por cada pregunta contestada correctamente obtendra puntos que iran aumentando conforme a la ronda"
                + "\n" + "Si se equivoca en alguna pregunta terminara el juego y se ira sin nada"
                + "\n" + "Por el contrario si responde bien a todas las preguntas se llevara el acomulado total"
                + "\n" + "Nota: Puedes salir del juego en cualquier momento pulsando la tecla numero 6"
                + "\n" + "\n" + "Pulse ENTER para continuar...");
        test.pressEnterContinue();
        do {
            System.out.print("\n" + "\t" + "Menu"
                    + "\n" + "1.Iniciar Juego"
                    + "\n" + "2.Historico"
                    + "\n" + "3.Salir"
                    + "\n" + "Seleccionar: ");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\n" + "Ingrese nombre de usuario: ");
                    test.setNombre(sc.next());
                    test.iniciarTest();

                    break;
                case 2: //Llama a la base de datos
                    System.out.print("\n" + "\t" + "Datos historicos");
                    historico.listarHistorico();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (opc != 3);
    }

}
