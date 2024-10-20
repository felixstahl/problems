package org.example;

public class ReverseString {

    public static String reverseString(String toReverse){
        if(toReverse == null)
            throw new IllegalArgumentException();

        System.out.println("Input String: " + toReverse);

        StringBuilder sb = new StringBuilder();
        for(int i = toReverse.length()-1; i >= 0; i--){
            sb.append(toReverse.charAt(i));
        }

        System.out.println("Output String: " + sb);
        return sb.toString();
    }
}
