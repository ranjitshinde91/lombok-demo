package value;


import lombok.Value;

@Value
class Student{
    String firstName;
    String lastName;

}

public class ValueExample {
    public static void main(String[] args) {
        Student student = new Student("Ranjit", "Shinde");
        System.out.println(student);
    }
}
