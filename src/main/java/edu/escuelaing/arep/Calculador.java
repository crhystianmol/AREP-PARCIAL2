package edu.escuelaing.arep;

import java.lang.Math.*;
/**
 * Clase encargada de realizar las operaciones necesarias para calcular arcotangente y el seno.

 */
public class Calculador {
    /**
     * Metodo encargado de realizar las operaciones necesarias para calcular el arcotangente del valor ingresado.
     * @param number Parametro que indica el numero ingresado con el que se van a realizar las operaciones.
     * @return Retorna el numero luego de realizar los respectivos calculos.
     */
    public double arcTangent(double number){
        return Math.atan(number);
    }
    /**
     * Metodo encargado de realizar las operaciones necesarias para calcular el seno del valor ingresado.
     * @param number Parametro que indica el numero ingresado con el que se van a realizar las operaciones.
     * @return Retorna el numero luego de realizar los respectivos calculos.
     */
    public double sen(double number){
        return Math.sin(number);
    }
}
