package com.homework.myMath;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {}
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() { return real; }
    public void setReal(double real) { this.real = real; }
    public double getImag() { return imag; }
    public void setImag(double imag) { this.imag = imag; }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }
    public boolean isReal() {
        return this.real != 0.0;
    }
    public boolean isImaginary() {
        return this.imag != 0.0;
    }
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }
    public double magnitude() {
        return (Math.sqrt((Math.pow(this.real,2)) + (Math.pow(this.imag,2))));
    }
    public double argument() {
        double result = -1;
        if (real > 0) {
            result = Math.atan(imag/real);
        } else if (real < 0 && imag >= 0) {
            result = Math.PI + Math.atan(imag/real);
        } else if (real < 0 && imag <= 0) {
            result = -Math.PI + Math.atan(imag/real);
        } else if (real == 0 && imag != 0) {
            result = Math.PI/2*(imag/Math.abs(imag));
        }
        return result;
    }
    public MyComplex add (MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew (MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
    public MyComplex subtract (MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }
    public MyComplex subtractNew (MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }
    public MyComplex multiply (MyComplex right) {
        double temp = this.real;
        this.real = (this.real*right.real - this.imag*right.imag);
        this.imag = (temp*right.imag + this.imag*right.real);
        return this;
    }
    public MyComplex divide (MyComplex right) {
        double temp = this.real;
        this.real = ((this.real*right.real + this.imag*right.imag)/
                    (Math.pow(right.real,2)+Math.pow(right.real,2)));
        this.imag = ((right.real*this.imag - right.imag*temp)/
                    (Math.pow(right.real,2) + Math.pow(right.imag,2)));
        return this;
    }
    public MyComplex conjugate () {
        return new MyComplex(this.real, -this.imag);
    }
}
