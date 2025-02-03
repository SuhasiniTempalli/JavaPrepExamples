package com.java.examples;

public class StringExample {


    public static void main(String[] args) {
        String input="level";
        input.replaceAll("/s","").toLowerCase();
        /*String str1=new StringBuffer(input).reverse().toString();
        if(input.equalsIgnoreCase(str1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }*/

        char[] try1=input.toCharArray();
        for(int i=try1.length-1;i>=0;i--){

            System.out.print(try1[i] );

        }

    }



}
