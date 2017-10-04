package shape;

public class Rectangle extends Shape {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        //возможно это не правильно.делаю такое первый раз.
        //если не правильно - хотелось бы узнать почему
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Стороны прямоугольника не могут быть <= 0");
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public String toString() {
        //TODO переписать через stringBuffer
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
