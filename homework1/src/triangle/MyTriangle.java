package triangle;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//        TODO ПРОВЕРИТЬ НА ТРЕУГОЛЬНИК
        //любая сторона в треугольнике меньше суммы двух других и больше их разности
        if (isTriangle(x1, y1, x2, y2, x3, y3)) {
            this.v1.setXY(x1, y1);
            this.v2.setXY(x2, y2);
            this.v3.setXY(x3, y3);
        } else {
            throw new IllegalArgumentException("Это не треугольник!!!");
        }
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        if (isTriangle(v1, v2, v3)) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        } else {
            throw new IllegalArgumentException("Это не треугольник!!!");
        }

    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v1.distance(v3);
//          equilateral - равносторонний
        if (a == b && b == c && c == a) {
            return "equilateral";
        }

//          isosceles - равнобедренный
        if (a == b || b == c || a == c) {
            return "isosceles";
        }

//          scalene - неравносторонний
        if (a != b && b != c && a != c) {
            return "scalene";
        }
        return "Это не треугольник";
    }


    //проверяем на свойство треугольника
    private boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        MyPoint v1 = new MyPoint(x1, y1);
        MyPoint v2 = new MyPoint(x2, y2);
        MyPoint v3 = new MyPoint(x3, y3);
        return isTriangle(v1, v2, v3);
    }

    private boolean isTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v1.distance(v3);
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }
}
