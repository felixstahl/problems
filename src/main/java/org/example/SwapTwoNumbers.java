package org.example;

public class SwapTwoNumbers {

    public static void swapTwoNumbersWithoutUsingAThirdVariable(int a, int b){
        System.out.println("Input numbers: " + a + " " + b);

        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println("Output numbers: " + a + " " + b);
    }
}
