package builder;


import lombok.Builder;
import lombok.Value;

@Builder
@Value
class Student {
    private String firstName;
    private String lastName;
}

public class BuilderExample {
    public static void main(String[] args) {
        Student student = Student.builder().firstName("Ranjit").lastName("Shinde").build();
        System.out.println(student);
        student.getFirstName();
        System.out.println(student);
    }
}
