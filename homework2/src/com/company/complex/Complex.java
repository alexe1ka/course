package com.company.complex;

import java.util.Objects;

public class Complex {
    private double real = 0.0;
    private double imag = 0.0;

    public Complex() {
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + "+" + imag + "i" + ')';
    }

    public boolean isReal() {
        return real != 0;
    }

    public boolean isImaginary() {
        return imag != 0;
    }


    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        double arg = 0;
        if (imag == 0) {
            if (real == 0) {
                throw new IllegalArgumentException("Аргумент числа 0 не определен");
            }
            if (real > 0) {
                arg = 0;
            }
            if (real < 0) {
                arg = Math.PI;
            }
        } else {
            if (real > 0) {
                arg = Math.atan(imag / real);
            }
            if (real < 0 && imag >= 0) {
                arg = Math.PI + Math.atan(imag / real);
            }
            if (real < 0 && imag < 0) {
                arg = -Math.PI + Math.atan(imag / real);
            }
        }
        return Math.toDegrees(arg);
    }

    public Complex add(Complex right) {
//   операция с this и его возврат
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public Complex addNew(Complex right) {
//    возврат нового инстанса класса Complex
        return new Complex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public Complex subtract(Complex right) {
//   операция с this и его возврат
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public Complex subtractNew(Complex right) {
//    возврат нового инстанса класса Complex
        return new Complex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public Complex multiply(Complex right) {
        double real_res = (this.real * right.getReal() - this.imag * right.getImag());
        double imag_res = (this.real * right.getImag() + this.imag * right.getReal());
        this.real = real_res;
        this.imag = imag_res;
        return this;
    }

    public Complex divide(Complex right) {
        double real_res = (this.real * right.getReal() + this.imag * right.getImag()) / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        double imag_res = (right.getReal() * this.imag - this.real * right.getImag()) / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        this.real = real_res;
        this.imag = imag_res;
        return this;
    }

    public Complex conjugate() {
        if (imag > 0) {
            return new Complex(this.real, -this.imag);
        } else {
            return new Complex(this.real, this.imag);
        }
    }

//    остались два equals - один сравнивает два объекта,другой отдельно real и imag

    public boolean equals(Complex another) {
        return this == another || this.real == another.getReal() && this.imag == another.getImag();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complex complex = (Complex) o;

        if (Double.compare(complex.real, real) != 0) return false;
        return Double.compare(complex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imag);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
