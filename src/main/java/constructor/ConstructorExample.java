package constructor;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student{

    @NonNull
    private String firstName;
    private String lastName;

    public void setFirstName(@NonNull String firstName){
        this.firstName = firstName;
    }
}


@RequiredArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
class Address{
    @NonNull
    @ToString.Include(name="Lane No") private String lane;

    private final  int pinCode;
}

public class ConstructorExample {
    public static void main(String[] args) {
        Student student = new Student("Ranjit", "Shinde");
        System.out.println(student);

        Student student1 = new Student();
      //  student1.setFirstName(null);
        System.out.println(student1);

        Address address = new Address("Lane1", 1);
        System.out.println(address);
    }
}
