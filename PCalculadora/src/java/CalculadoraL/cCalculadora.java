/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraL;


public class cCalculadora {
    public double calcular(double n1, double n2, String operacion) {
        double resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = n1 + n2;
                break;
            case "resta":
                resultado = n1 - n2;
                break;
            case "multiplicacion":
                resultado = n1 * n2;
                break;
            case "division":
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    resultado = 0; 
                }
                break;
            default:
                resultado = 0;
                break;
        }
        return resultado;
    }
}
