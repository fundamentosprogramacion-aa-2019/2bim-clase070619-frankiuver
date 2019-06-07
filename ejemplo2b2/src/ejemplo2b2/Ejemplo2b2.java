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
public class Ejemplo2b2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        double promedio = 0;
        int[] partidos = new int[7];
        
        // String [] dias = new String[7];
        String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        // proceso para llenar los datos al arreglo de respuesta
        for(int i = 0; i<dias.length; i++){
            System.out.printf("Número de partidos jugados el día %s\n",dias[i]);
            partidos[i] = entrada.nextInt();
        }
        
        
        
        for(int i = 0; i<dias.length; i++){
            System.out.printf("Partidos jugados el día %s fue %s\n",dias[i], partidos[i]);
            
        }
        
        // proceso para encontrar el promedio de partidos a la semana
        for(int i = 0; i<partidos.length; i++){
            suma = suma + partidos[i];
        }
        promedio = (double)suma / partidos.length;
        System.out.printf("El promedio de partidos jugados es %.2f\n", promedio);
        
        

    }
}