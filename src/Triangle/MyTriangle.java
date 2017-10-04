package Triangle;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//        TODO ПРОВЕРИТЬ НА ТРЕУГОЛЬНИК
        //любая сторона в треугольнике меньше суммы двух других и больше их разности
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        //TODO переписать через stringBuffer
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
//          equilateral - равносторонний
//          isosceles - равнобедренный
//          scalene - неравносторонний
        String type = "";

        return type;
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
