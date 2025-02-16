package com.java.stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class SortElementsOnLength {
    public static void main(String args[]){
        List<String> languages=new ArrayList<>(Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C"));
       /* Using Collections.sort() with Comparator*/
        Collections.sort(languages, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });


        //System.out.println(sortLanguages);

        /* Print the Sorted List*/
        for (String lang : languages) {
            System.out.println(lang);
        }
    }


    }

