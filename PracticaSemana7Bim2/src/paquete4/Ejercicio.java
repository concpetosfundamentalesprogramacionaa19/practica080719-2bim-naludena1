/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author nali1
 */
public class Ejercicio {

    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        // Método recursivo
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, 
                    tamanio - 1);
        }

    }

    public static int miEjercicio(int arreglo2[], int tamanio) {
        int cont = 0;
        int suma = 0;

        // Método no recursivo con ciclo while
        while (cont != 8) {
            suma = suma + arreglo2[cont];
            cont = cont + 1;

        }
        return suma;
    }
}
