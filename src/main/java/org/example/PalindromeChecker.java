package org.example;

public class PalindromeChecker {

    public static boolean isInputAPalindrome(String input){
        input = input.toLowerCase();
        System.out.println("Input word: " + input);

        boolean isPalindrome = true;
        int fromBeginning = 0;
        int fromEnd = input.length() - 1;

        while(fromBeginning < fromEnd){
            if(input.charAt(fromBeginning) != input.charAt(fromEnd)){
                isPalindrome = false;
                break;
            }
            fromBeginning++;
            fromEnd--;
        }

        return isPalindrome;
    }
}
