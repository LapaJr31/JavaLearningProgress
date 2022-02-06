package com.company;

public class Part2 {
    public static void main(String[] args){
        /*
        boolean - 1 bit value: true or false
        byte - 1 byte value: -128 to 127
        short - 2 bytes value: -32,768 to 32,767
        int - 4 bytes value: -2 billion to 2 billion
        long - 8 bytes value: -9 quintillion to 9 quintillion

        float - 4 bytes value: fractional number up to 6 - 7 digits
        double - 8 bytes value:  fractional number up to 15 digits

        char - 2 bytes value: single character/letter/ASCII value
        String - varies in size value: a sequence of characters
         */

        long x = 1237127637812638737L;
        double y = 3.14;
        boolean z = true;
        char symbol = '@';
        String name = "Yaroslav";

        System.out.println("My number is: " +x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(symbol);
        System.out.println("Hello my name is "+name);
    }
}
