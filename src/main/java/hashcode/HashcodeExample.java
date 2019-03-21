package hashcode;


import lombok.EqualsAndHashCode;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter
class Student{
    @EqualsAndHashCode.Include private String firstName;
    private String lastName;

}

public class HashcodeExample {


    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Ranjit");

        Student student1 = new Student();
        student1.setFirstName("Ranjit");

        System.out.println(student1);
        System.out.println(student.equals(student1));
    }
}
