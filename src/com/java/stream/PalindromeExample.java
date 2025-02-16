package com.java.stream;

public class PalindromeExample {

    public static void main(String args[]){
        PalindromeExample eg=new PalindromeExample();
        String input="level";
        boolean palindrome=eg.callPalindrome(input);
        System.out.println(palindrome);
        String reversed=new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            System.out.println("printing using stringbuilder");
        }else {
            System.out.println("not a palindrome");
        }
    }

    private boolean callPalindrome(String input) {
        int n = input.length();

        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                return false;
            }

        }
        return true;
    }}

