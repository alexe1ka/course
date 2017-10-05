package shape;

public class Circle extends Shape {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        //считаем,что вводятся корректные данные
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть >0");
        } else {
            this.radius = radius;
        }
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
