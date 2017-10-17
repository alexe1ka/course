package com.company;

import com.company.ball.Ball;
import com.company.ball.Container;
import com.company.complex.Complex;
import com.company.polinom.MyPolinomial;

import java.util.Random;

public class TestHomework2 {

    public static void main(String[] args) {
//        testComplex
        Complex complex1 = new Complex();
        Complex complex2 = new Complex(1, 1);
        Complex complex3 = new Complex(-3, -2);
        Complex complex4 = new Complex(1, 1);

        System.out.println(complex2.getReal());
        System.out.println(complex2.getImag());
        System.out.println(complex2.magnitude());
        System.out.println(complex2.argument());
        System.out.println(complex2.conjugate());
        System.out.println(complex2.isReal());
        System.out.println(complex2.isImaginary());
        System.out.println(complex2.equals(complex3));
        System.out.println(complex2.equals(complex4));
        System.out.println(complex2.add(complex4));
        System.out.println(complex2.addNew(complex3));
        System.out.println(complex2.divide(complex4));
        System.out.println(complex2.subtract(complex3));


        System.out.println("\n\n\n\n");
        //testPolinomial
//        коэффициенты задаются в обратном порядке - 0 индекс это 0 коэффициент

        double[] coeffs = {1, 1, 1};
        MyPolinomial polinom = new MyPolinomial(coeffs);

        System.out.println(polinom.toString());
        System.out.println(polinom.getDegree());
        System.out.println(polinom.evaluate(2));

        double[] coeffs1 = {1, 0, 1};
        MyPolinomial polinom1 = new MyPolinomial(coeffs1);
        System.out.println(polinom1.toString());
        System.out.println(polinom.add(polinom1).toString());
        System.out.println(polinom.multiply(polinom1));
        System.out.println(new MyPolinomial(new double[]{1, 1, 1, 1, 1}).multiply(new MyPolinomial(new double[]{1, 1, 1})));

        System.out.println("\n\n\n\n");

        //myBalltest
        //параметры в конструктор передаются корректные
        Container container = new Container(0, 0, 10, 10);
        System.out.println("x =" + container.getX());
        System.out.println("y =" + container.getY());
        System.out.println("height =" + container.getHeight());
        System.out.println("width =" + container.getWidth());
        System.out.println(container.toString());

        Ball ball = new Ball(5, -2, 1, 10, 90);
        System.out.println(ball.toString());
        System.out.println("x_Ball =" + ball.getX());
        System.out.println("y_ball =" + ball.getY());
        System.out.println("dX_ball =" + ball.getxDelta());
        System.out.println("dY_ball =" + ball.getyDelta());
        System.out.println("radiusBall =" + ball.getRadius());

        Ball ball2 = new Ball(100, 100, 10, 10, 90);
        System.out.println(ball2.toString());

        System.out.println(container.collides(ball));
        System.out.println(container.collides(ball2));


        Ball jumperBall = new Ball(5, -5, 1, 10, 90);
        for (int i = 0; i < 8; i++) {
            Random rndX = new Random();
            Random rndY = new Random();
            System.out.println(jumperBall);
            System.out.println("x_Ball =" + jumperBall.getX());
            System.out.println("y_ball =" + jumperBall.getY());
            System.out.println("dX_ball =" + jumperBall.getxDelta());
            System.out.println("dY_ball =" + jumperBall.getyDelta());
            System.out.println("radiusBall =" + jumperBall.getRadius());
            System.out.println(container.collides(jumperBall));
            jumperBall.move();
            jumperBall.setxDelta(rndX.nextInt(4) + 1);
            jumperBall.setyDelta(rndY.nextInt(2) + 1);
        }

        Ball reflectBall = new Ball(1, -1, 1, 1, 90);
        for (int i = 0; i < 9; i++) {
            if (i == 4) {
                reflectBall.reflectHorizontal();//возвращаем шар на изначальное место
                reflectBall.reflectVertical();
            }
            System.out.println(reflectBall);
            System.out.println("x_Ball =" + reflectBall.getX());
            System.out.println("y_ball =" + reflectBall.getY());
            System.out.println("dX_ball =" + reflectBall.getxDelta());
            System.out.println("dY_ball =" + reflectBall.getyDelta());
            System.out.println("radiusBall =" + reflectBall.getRadius());
            reflectBall.move();
        }
    }
}
