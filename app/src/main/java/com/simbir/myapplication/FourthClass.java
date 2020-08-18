package com.simbir.myapplication;

   /*
   Write a function that accepts an array of 10 integers (between 0 and 9),
   that returns a string of those numbers in the form of a phone number.
   */

import java.util.Arrays;

public class FourthClass {

    /*
    Write a function that accepts an array of 10 integers (between 0 and 9),
    that returns a string of those numbers in the form of a phone number.
    */

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("(")
                .append(makeArrayString(Arrays.copyOfRange(numbers, 0, 3)))
                .append(") ")
                .append(makeArrayString(Arrays.copyOfRange(numbers, 3, 6)))
                .append("-")
                .append(makeArrayString(Arrays.copyOfRange(numbers, 6, 10)))
                .toString();
    }

    private static String makeArrayString(int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for(int character : array){
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
