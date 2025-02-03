import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] input = new String[10];
        input[2] = "let me do my work";
        //It returns an empty instance of an Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        // It returns non-empty Optional
        Optional<String> value = Optional.of(input[2]);
        System.out.println(value.get());
        //check for value in input and if not present returns from orElse
        System.out.println(Optional.ofNullable(input[2]).orElse("check"));
        // To check the value returned by the supplying function
        System.out.println(Optional.ofNullable(input[2]).orElseGet(() -> "change string"));
        //System.out.println(value);
    }
}
