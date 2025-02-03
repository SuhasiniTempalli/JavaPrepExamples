import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //Functional Interface
        Function<Integer, Integer> printInt = a -> a * 10;
        System.out.println("Calling the Functional Interface Impl " + printInt.apply(10));
        //BiFunctional Interface
        BiFunction<Integer, Integer, Integer> printInt1 = (x, y) -> x * y;
        System.out.println("Calling the BiFunctional Interface Impl " + printInt1.apply(10, 20));
        //BiPredicate Interface
        BiPredicate<String, String> predicate1 = (str1, str2) -> str1.equals(str2);
        System.out.println("Calling the BiPredicate Interface Impl " + predicate1.test("lol", "lol"));
        //BiConsumer Interface
        System.out.println("Calling the BiConsumer Interface Impl");
        BiConsumer<String, String> consumer1 = (b, c) -> System.out.println(b.concat(c));
        consumer1.accept("Bi", "Consumer");
    }
}
