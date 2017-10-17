package com.company.polinom;

import java.util.ArrayList;
import java.util.Arrays;

public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        int i = coeffs.length - 1;
        while (i >= 0) {
            if (coeffs[i] > 0)
                return i;
            i--;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = coeffs.length - 1;
        while (i >= 0) {
            if (coeffs[i] != 0) {
                if (i != coeffs.length - 1) {
                    stringBuilder.append(" + ");
                }
                if (i == 1) {
                    stringBuilder.append(coeffs[i] + "*" + "x");
                }
                if (i == 0) {
                    stringBuilder.append(coeffs[i]);
                }
                if (i > 1) {
                    stringBuilder.append(coeffs[i] + "*" + "(x^" + i + ")");
                }
            }
            i--;
        }
        return String.valueOf(stringBuilder);
    }

    public double evaluate(double x) {//знач при заданном x
        int i = coeffs.length - 1;
        double res = 0;
        while (i >= 0) {
            res += coeffs[i] * Math.pow(x, i);
            i--;
        }
        return res;
    }

    public MyPolinomial add(MyPolinomial right) {
        double[] result = new double[this.coeffs.length > right.coeffs.length ? this.coeffs.length : right.coeffs.length];//массив большей размерности
        int small_arr_size = this.coeffs.length > right.coeffs.length ? right.coeffs.length : this.coeffs.length;//размерность меньшего массива
        for (int i = 0; i < result.length; i++) {
            if (i < small_arr_size) {
                result[i] = this.coeffs[i] + right.coeffs[i];
            } else {
                result[i] = this.coeffs.length > right.coeffs.length ? this.coeffs[i] : right.coeffs[i];
            }
        }
        return new MyPolinomial(result);
    }


    public MyPolinomial multiply(MyPolinomial right) {
        double[] res = new double[this.coeffs.length + right.coeffs.length - 1];
        int small_arr_size = this.coeffs.length > right.coeffs.length ? right.coeffs.length : this.coeffs.length;//размерность меньшего массива
        int big_arr_size = this.coeffs.length < right.coeffs.length ? right.coeffs.length : this.coeffs.length;
        for (int i = 0; i < big_arr_size; i++) {
            for (int j = 0; j < small_arr_size; j++) {
                res[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolinomial(res);
    }
    //функция перемножения полиномов с использованием быстрого преобразования фурье
    // http://informatics.mccme.ru/mod/resource/view.php?id=878 - изучить позже.переписать этот метод


}
