package data;


import lombok.Data;

public class DataExample {
    public static void main(String[] args) {

        Student student = new Student("Ranjit", "Shinde");
        System.out.println(student);

        Student student1 = new Student("Ranjit", "Shinde");
        System.out.println(student1);

        System.out.println(student.equals(student1));

    }

    private static
    @Data
    class Student{
        private final String firstName;
        private final  String lastName;
    }
}
