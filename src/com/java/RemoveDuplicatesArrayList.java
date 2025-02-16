package com.java;

import java.util.*;

public class RemoveDuplicatesArrayList {


    public static void main(String args[]){
        ArrayList<String> newList=new ArrayList<>(Arrays.asList("Pen","Eraser","NoteBook","Pen", "Pencil", "Pen", "Note Book", "Pencil"));
        ArrayList<String> removedList=removeDuplicates(newList);
        System.out.println(removedList);
    }

    private static ArrayList<String> removeDuplicates(ArrayList<String> newList) {
      /*  HashSet<String> uniqueset=new HashSet<>();
        ArrayList<String> removedList=new ArrayList<>();
        for (String element : newList) {
            if (uniqueset.add(element)) {
                removedList.add(element);
            }
        }
        return removedList;*/


      /*  Using LinkedHashSeet to remove the duplicates*/
        Set<String> set=new LinkedHashSet<>();
        set.addAll(newList);
        newList.clear();
        newList.addAll(set);
        return newList;
    }
    /*Using Java Stream.distinct() Method to Remove Duplicates from ArrayList*/
}
