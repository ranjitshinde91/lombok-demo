package builder;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
class Student {
    private String firstName;
    private String lastName;
}

public class BuilderExample {
    public static void main(String[] args) {
        Student student = Student.builder().firstName("Ranjit").lastName("Shinde").build();
        System.out.println(student);
        student.getFirstName();
        student.setFirstName("Ranjit2");
        System.out.println(student);
    }
}
