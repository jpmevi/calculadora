/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

/**
 *
 * @author potz
 */
public class calculos {

    private double num1;
    private double num2;

    public calculos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getSuma() {
        return num1 + num2;
    }

    public double getMultiplicacion() {
        return num1 * num2;
    }

    public double getMayor() {
        double mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        return mayor;
    }

    public double getPotencia() {
        return Math.pow(num1, num2);
    }

    public String getBinario1() {
        long numero1 = (new Double(num1)).longValue();
        return Long.toBinaryString(numero1);
    }

    public String getBinario2() {
        long numero2 = (new Double(num2)).longValue();
        return Long.toBinaryString(numero2);
    }
}
