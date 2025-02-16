package com.java.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedElement {

    public static void main(String args[]){
        /*Creating a list of input data*/
        List<String> list= Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
       /* Creating a map with input key as String and their occurence as value */
        Map<String,Long> map=list.stream().collect(Collectors.groupingBy(str->str,Collectors.counting()));
        Map.Entry<String,Long> result=map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most Repeated Element " +result.getKey());
        System.out.println("Count " +result.getValue());
    }
}
