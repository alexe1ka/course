package com.company.ball;

import sun.rmi.runtime.Log;

import java.util.logging.Logger;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y - height; //минус,потому что вторая точка расположена в правом нижнем углу
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2 - x1);
    }

    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    public boolean collides(Ball ball) {
        return (
                (ball.getX() - ball.getRadius() > (float) this.x1) && //левая точка круга в прямоугольнике
                        (ball.getY() + ball.getRadius() < (float) this.y1) && //верхняя точка окружности в прямоугольнике
                        (ball.getX() + ball.getRadius() < (float) (this.x2) && //правая точка окружности в прямоугольнике
                                (ball.getY() - ball.getRadius() > (float) (this.y2))) //нижняя точка окружности в прямоугольнике
        );
        /*return (
                (ball.getX() - ball.getRadius() < (float) x1) || //левая точка круга выходит за прямоугльник
                        ball.getY() + ball.getRadius() > (float) y1 || //верхняя точка окружности выходит за прямоугольник
                        ball.getX() + ball.getRadius() > (float) (x1 + getWidth()) || //правая точка окружности выходит за прямоугольник
                        ball.getY() - ball.getRadius() < (float) (y1 + getHeight()) //нижняя точка окружности выходит за прямоугольник
        );*/
    }


    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")]";
    }
}
