import book.Author;
import book.Book;
import employee.Employee;
import shape.Circle;
import shape.Rectangle;
import triangle.MyPoint;
import triangle.MyTriangle;

import java.util.Arrays;

public class TestHomeWork {

    public static void main(String[] args) throws IllegalArgumentException {

        //test Shape
        Circle circle = null;
        try {
            circle = new Circle(0);
            circle.setColor("green");
            System.out.println("Circle area = " + circle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }


        Rectangle rectangle = null;
        try {
            rectangle = new Rectangle(2, 2);
            System.out.println("Rectangle Area = " + rectangle.getArea());
            System.out.println("Rectangle Perimeter = " + rectangle.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println("\n\n\n");

        //test employee
        Employee employee = new Employee(1, "Alexei", "nadezhkin", 555);
        System.out.println("Работник " + employee.getName());
        System.out.println("Годовой заработок " + employee.getAnnualSalary());
        employee.raiseSalary(23);
        System.out.println("Работнику повысили зарплату.Теперь он зарабатывает " + employee.getSalary());

        System.out.println("\n\n\n");

        //test book
        Author gamma = new Author();
        gamma.setName("E Gamma");
        gamma.setEmail("gamma@ma.co");
        gamma.setGender('m');

        Author helm = new Author();
        helm.setName("R Helm");
        helm.setEmail("helm@ma.co");
        helm.setGender('m');

        Author johnson = new Author();
        johnson.setName("R Johnson");
        johnson.setEmail("johnson@ma.co");
        johnson.setGender('m');

        Author vlissides = new Author();
        vlissides.setName("D Vlissides");
        vlissides.setEmail("vlissides@ma.co");
        vlissides.setGender('m');

        Author[] authors = {gamma, helm, johnson, vlissides};
        Book book = new Book("Gang of four", authors, 100, 5);

        System.out.println(book.getAuthorNames());
        System.out.println(Arrays.toString(book.getAuthors()));
        System.out.println(book.getName());
        System.out.println(book.getPrice());

        System.out.println("\n\n\n");

        //testPoint,triangle
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(2, 0);
        MyPoint point3 = new MyPoint(0, 2);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println(triangle.toString());
        System.out.println("Perimeter of triangle = " + triangle.getPerimeter());
        System.out.println("Type of triangle= " + triangle.getType());
    }
}
