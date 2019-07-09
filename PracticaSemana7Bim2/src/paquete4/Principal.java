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
public class Principal {

    public static void main(String[] args) {
        int arreglo[] = {10, 20, 30, 1, 2, 3, 40, 4};
        // Se llama al método recursivo
        int tamanio = Ejercicio.obtenerTamanioArreglo(arreglo, arreglo.length);
        // Se presenta el método recursivo
        System.out.printf("Método recursivo: %d\n", tamanio);

        // Se llama al método no recursivo
        int tamanio1 = Ejercicio.miEjercicio(arreglo, arreglo.length);
        // Se presenta el método no recursivo
        System.out.printf("Método no recursivo: %d\n", tamanio1);

    }

}
