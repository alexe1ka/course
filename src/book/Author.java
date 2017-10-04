package book;

public class Author {
    private String name;
    private String email;
    private char gender;

    //либо геттеры и сеттеры,либо наверху public^^^.
    // а в диаграмме не написано что именно реализовать
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        //TODO переписать через stringBuffer
        return "Author[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ']';
    }
}
