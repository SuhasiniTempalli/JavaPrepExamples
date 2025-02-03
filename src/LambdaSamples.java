import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface  SumCalculator{
    int sum(int a,int b);
        }

public class LambdaSamples {
    public static void main(String[] args) {
        SumCalculator calculator=(x,y)->x+y;
        int total=calculator.sum(6,7);
        System.out.println("the sum of x and y " +total);
        Predicate<String> isEmptyString = str -> str.isEmpty();
        //Supplier<String> change= str2->str2.toLowerCase();

        String str1 = ""; // empty string
        String str2 = "Java lambda expression!"; // non-empty string
        System.out.println(str2.toUpperCase());

        // Check if the strings are empty using the lambda expression
        System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
        System.out.println("String 2 is empty: " + isEmptyString.test(str2));
        Consumer<String> value=(str)-> System.out.println(str.toUpperCase());
        value.accept("checking");

        //to print even and odd numbers
        List<Integer> numbs = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        List<Integer> evenNumbers = numbs.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> oddNumbers = numbs.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Printing Even Numbers");
        evenNumbers.stream().forEach(even -> {
            System.out.print(even + " ");
        });
        System.out.println("Printing Odd Numbers");
        oddNumbers.stream().forEach(odd -> {
            System.out.println(odd + " ");
        });
    };
    }


