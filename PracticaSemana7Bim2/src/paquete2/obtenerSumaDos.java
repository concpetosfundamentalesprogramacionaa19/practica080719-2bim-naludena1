/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author nali1
 */
public class obtenerSumaDos {

    public static int obtenerSumaDos(int valor) {
        if (valor <= 0) {
            return 0;

        } else {
            return valor + obtenerSumaDos(valor - 1);
        }
    }

    public static int obtenerSumaUno(int valor) {
        int suma = 0;
        for (int i = 1; i <= valor; i++) {
            suma = suma + i;

        }
        return suma;
    }
}
