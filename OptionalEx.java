import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("navin", "laxmi", "kishor");

        String name1 = names1.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("x not present");

        System.out.println(name1);

        List<String> names2 = Arrays.asList("navin", "lakshmi", "kishor");

        Optional<String> name2 = names2.stream()
                .filter(str -> str.contains("x"))
                .findFirst();

        System.out.println(name2.orElse("x not found"));
    }
}
