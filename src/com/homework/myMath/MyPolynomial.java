package com.homework.myMath;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return this.coeffs.length-1;
    }

    @Override
    public String toString() {
        String polynom = "";
        int l = this.coeffs.length;
        for (int i = 0; i < l;i++) {
            if (i == 0) {
                polynom = this.coeffs[i] + polynom;
            } else if (i == 1) {
                polynom = this.coeffs[i] + "x" + " + " + polynom;
            }
            else {
                polynom = this.coeffs[i] + "x^" + i + " + " + polynom;
            }
        }
        return polynom;
    }
    public double evaluate (double x) {
        double result = 0.0;
        int l = this.coeffs.length;
        for (int i = 0; i < l; i++) {
            if (i == 0) {
                result += this.coeffs[i];
            } else {
                result += Math.pow(this.coeffs[i],i);
            }
        }
        return result;
    }
    public MyPolynomial add (MyPolynomial right) {
        int l = Math.min(this.coeffs.length, right.coeffs.length);
        double[] temp = this.coeffs.length>right.coeffs.length?this.coeffs.clone():right.coeffs.clone();
        for (int i = 0; i < l; i++) {
                temp[i] = this.coeffs[i] + right.coeffs[i];
        }
        return new MyPolynomial(temp);
    }
    public MyPolynomial multiply (MyPolynomial right) {
        int I = this.coeffs.length;
        int J = right.coeffs.length;
        double[] temp = new double[I + J - 1];
        for (int i = 0; i < I; i++ ) {
            for (int j = 0; j < J; j++) {
                temp[i+j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(temp);
    }
}
