/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author cfjimbo
 */
public class LeccionExtra2Bim01 {

    public static void main(String[] args) {
        
        int[] arreglo1 = {110, 220, 430, 140, 250, 460}; //Entero Arreglo 1
        int[] arreglo2 = {10, 20, 30, 40, 50, 60}; //Entero Arreglo 1
        double[] arreglo3 = new double[6]; //Float. Se añade 6 nuevos elementos en el arreglo3 sobre los promedios entre el arreglo1 y el arreglo2

        double suma = 0;
        double promedio;

        for (int contador = 0; contador < arreglo3.length; contador++) {                        
            arreglo3[contador] = (arreglo1[contador]/arreglo2[contador]);
            suma = suma + arreglo3[contador]; //Se suman y acumulan los valores que estan en el arreglo3                                     
        } //fin For
        System.out.printf("%s\t%s\t%s\t\n", "Arreglo1", "Arreglo2", "Resultado"); //Se presenta en pantalla, por cada columna, el encabezado del reporte
        for (int i = 0; i < arreglo3.length; i++) {                                  
            System.out.printf("%d\t\t%d\t\t%.2f\n", arreglo1[i], arreglo2[i], arreglo3[i]);
        } //fin For 
        promedio = suma / arreglo3.length;
        System.out.printf("\nEl promedio del arreglo 3 es: %.2f\n", promedio); // Se presenta en pantalla el promedio total del arreglo3
    } //Fin Main
} //Fin Class