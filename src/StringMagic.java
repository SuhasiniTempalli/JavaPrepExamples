    import java.util.*;
    import java.util.function.Predicate;
    import java.util.stream.Collectors;
    import java.util.stream.IntStream;
    import java.util.stream.Stream;

    public class StringMagic {


        public static void main(String args[]) {
            String input="I bought 5 apples, 4 bananas, and 3 oranges";
            char[] ch=input.toCharArray();
            
            /*Arrays.stream(ch).forEach( e -> System.out.println(e));

            System.out.println(ch);

            Collections.reverse(list);
*/
            //System.out.println(list.toArray());

            int[] reverse = IntStream.rangeClosed(1, ch.length)
                    .map(i -> ch[ch.length - i])
                    .toArray();


            //Arrays.stream(reverse).findFirst().map(i->
            //Arrays.stream(reverse).filter(i->Character.isDigit()).limit(reverse.length);

            //OptionalInt first = IntStream.range(0, reverse.length-1).findFirst(i->Character.isDigit(reverse[i]));
            System.out.println("print first" +reverse);
            /* StringMagic stringMagic = new StringMagic();
            String s="final";
            String str="HelloWORLD";
            char[] str1=s.toCharArray();
            int uppercaseLetters = stringMagic.countUppercaseLetters(str);
           System.out.println(uppercaseLetters);

           *//*To Find Uppercase letter and print count using java 8*//*
            long count = IntStream.range(0, str.length())
                    .filter(i -> Character.isUpperCase(str.charAt(i)))
                    .count();
            System.out.println(count);

            *//*To find consecutive duplicates and print true or false using java 8*//*
            boolean hasConsecutiveDuplicates = IntStream.range(0, str1.length - 1)
                    .anyMatch(i -> str1[i] == str1[i + 1]);
            System.out.println(hasConsecutiveDuplicates);

        }
      public boolean hasConsecutiveDuplicates(String str) {
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    return true;
                }
            }
            return false;
        }

          public int countUppercaseLetters(String str) {
                    // TODO: Write your code here
                    // This will print 5
                    int count=0;
                    if(str==null)
                    {return 0;}
                    else{
                        for(int i=0;i<str.length();i++){
                            if(Character.isUpperCase(str.charAt(i))){
                                count=count+1;
                            }


                        }
                    }
                    return count;
                }*/
        }
    }

