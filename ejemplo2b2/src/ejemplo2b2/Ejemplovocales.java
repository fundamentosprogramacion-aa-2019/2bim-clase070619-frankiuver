/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2b2;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Ejemplovocales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // asigno valores de las vocales
        String[] vocales = {"a", "e", "i", "o", "u"};
        
        String palab = "";
        int[] cont = new int[5];
        boolean bandera = true;
        String continuar = "";
        String reporteFinal = "";
        //bucle que me permita ingresar cuantas veces desea hasta que decida finalizar
        while (bandera == true) {
            System.out.println("Ingrese una palabra por favor ");
            palab = entrada.next();
            char vocal = palab.charAt(0);
            switch (vocal) {
                //en caso de que la primera vocal este en mayuscula o minuscula
                case 'A':
                case 'a':
                    cont[0] = cont[0] + 1;
                    break;
                case 'E':
                case 'e':
                    cont[1] = cont[1] + 1;
                    break;
                case 'I':
                case 'i':
                    cont[2] = cont[2] + 1;
                    break;
                case 'O':
                case 'o':
                    cont[3] = cont[3] + 1;
                    break;
                case 'U':
                case 'u':
                    cont[4] = cont[4] + 1;
                    break;

            }
            entrada.nextLine();
            System.out.println("Ingrese... [ F   para finalizar |  "
                    + "|  ENTER para continuar]");
            continuar = entrada.nextLine();
            //evaluo si el valor ingresado permite salir de el bulce sea mayuscula o minuscula
            if (continuar.equals("F") || continuar.equals("f")) {
                bandera = false;
            }

        }
        //evaluo la catidad de veces que se uso una volac en primera letra de la palabra
        reporteFinal = String.format("%sReporte de notas\n", reporteFinal);
        for (int i = 0; i < cont.length; i++) {
            reporteFinal = String.format("%s Vocal %s, número de veces usada %s\n",
                    reporteFinal, vocales[i], cont[i]);
        }
        //muestro resultados 
        System.out.printf("%s\n", reporteFinal);
    }
}
