package value;


import lombok.Value;


public class ValueExample {
    public static void main(String[] args) {
        Student student = new Student("Ranjit", "Shinde");
        System.out.println(student);
    }

    @Value
    private static class Student {
        private String firstName;
        private String lastName;

    }
}
