package getter;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import java.util.Arrays;
import java.util.List;


class Address {
    @Setter
    @Getter
    private String lane;

    @Setter(AccessLevel.PROTECTED)
    @Getter(AccessLevel.NONE)
    private int pinCode;
}

@Getter
@Setter
class Student {

    @NonNull
    private String firstName;
    private List<Address> addresses;

    public List<Address> getAddresses(int i){
        return this.addresses;
    }

}


public class GetterSetterExample {
    public static void main(String[] args) {

        Address address = new Address();
        address.setLane("Lane1");
        address.setPinCode(411061);
        List<Address> addresses = Arrays.asList(address);

        Student student = new Student();
        student.setFirstName("Ranjit");
        student.setAddresses(addresses);

      //  student.setFirstName(null);

        student.getAddresses().forEach(element -> System.out.println(element));

        System.out.println(address);
        System.out.println(student.getAddresses());

        student.getAddresses().forEach(element -> System.out.println(element));

//        Exception in thread "main" java.lang.UnsupportedOperationException
//        addresses.add(new Address());
//
//        List<Address> addresses1 = student.getAddresses();
//        addresses1.add(new Address());

        student.getAddresses().forEach(element -> System.out.println(element));
    }
}
