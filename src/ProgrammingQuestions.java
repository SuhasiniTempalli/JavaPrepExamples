import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgrammingQuestions {

    public static void main(String[] args) {

      /*  // Creating an IntStream
        IntStream stream = IntStream.of(4, 12, 6, 20);

        IntSummaryStatistics summary_data =
                stream.sorted().summaryStatistics();

        // Displaying the various summary data
        // about the elements of the stream
        System.out.println(summary_data);*/


        //=====interview=====


        String input = "vivekkadiyan";
        System.out.println(uniqueElement(input));

    }

        private static List<String> uniqueElement(String input) {

             return Arrays.stream(input.split("")).
                     collect(Collectors.groupingBy(in->in,Collectors.counting())).
                     entrySet().stream().filter(fi->fi.getValue()==1).
                     map(Map.Entry::getKey).collect(Collectors.toList());
        }

}
    


