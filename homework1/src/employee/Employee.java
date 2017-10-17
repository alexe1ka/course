package employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(firstName);
        stringBuffer.append(" ");
        stringBuffer.append(lastName);
        return String.valueOf(stringBuffer);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        //если не посчитать это в double,возможна ошибка.
        // вообще salary лучше заменить на double
        double raisedSalary = ((double) salary) + (((double) salary) * ((double) percent)) / 100;
        salary = ((int) raisedSalary);//приходится отбрасывать дробную часть
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ",Name='" + firstName + '\'' +
                " " + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
