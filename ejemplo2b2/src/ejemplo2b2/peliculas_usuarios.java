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
public class peliculas_usuarios {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String resulreport = "";//estado de resultados generales
        String[] generospel = {"Comedia", "Terror", "Drama", "Familiar"};
        int[] valoropc = new int[4];//valores de opcion de la galeria 

        int tipo_Peliculas = 5;/*asigno valor 5 ya que este valor no afecta al
         registro y quiero usar a "0" como un valor*/

        boolean bandera = true;

        while (bandera == true) {
            // Listado de las generos pel a seleccionar 
            System.out.println("\n             --GENERO-PELICULAS-- \n\n"
                    + " OPCION [1] Comedia\n"
                    + " OPCION [2] Terror\n"
                    + " OPCION [3] Drama\n"
                    + " OPCION [4] Familiar ");

            System.out.println("Selecione una [OPCION] a su gusto.    /O/"
                    + "     Digite [0] para finalizar. ");
            System.out.print(": ");
            tipo_Peliculas = entrada.nextInt();

            //evaluo ingreso de una opcio nmediante valores asignado
            if (tipo_Peliculas == 1) {
                valoropc[0] = valoropc[0] + 1;

            } else {
                if (tipo_Peliculas == 2) {
                    valoropc[1] = valoropc[1] + 1;
                } else {
                    if (tipo_Peliculas == 3) {
                        valoropc[2] = valoropc[2] + 1;
                    } else {
                        if (tipo_Peliculas == 4) {
                            valoropc[3] = valoropc[3] + 1;
                        } else {
                            if (tipo_Peliculas == 0) {
                                break;//Frena el bucle si se digita el valor de 0 
                            }
                        }
                    }
                }
            }

        }

        resulreport = String.format("%s\n***Reporte de Preferencia de "
                + "Peliculas***\n", resulreport);
        //Remplazo de numero_elecion a insignia mas votada
        for (int i = 0; i < valoropc.length; i++) {
            int j = valoropc[i];
            String insignia = "";//cantidad de eleciones
            for (int a = 0; a < j; a++) {
                insignia = String.format("%s*", insignia);
            }

            resulreport = String.format("%s %s: %s\n",
                    resulreport, generospel[i], insignia);
        }

        System.out.printf("%s\n", resulreport);//resultados
    }
}
