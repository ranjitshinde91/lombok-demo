package builder;


import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.Arrays;
import java.util.List;

@Builder
@Value
class Student {
    private String firstName;
    private String lastName;
    @Singular
    private List<String> addresses;
}

public class BuilderExample {
    public static void main(String[] args) {
        List<String> addresses = Arrays.asList("Pune", "Sangvi");
        Student student = Student.builder().firstName("Ranjit")
                .lastName("Shinde")
                .address("Pune")
                .addresses(addresses)
                .build();

        System.out.println(student);
        student.getFirstName();
        System.out.println(student.getAddresses());


    }
}
