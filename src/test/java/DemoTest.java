import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTest {


    @Test
    public  void test1(){
        Optional<String> first = Stream.of("a", "b").
                filter(e -> e.equals("a"))
                .findFirst();
        System.out.println(first.isPresent());

    }

}
