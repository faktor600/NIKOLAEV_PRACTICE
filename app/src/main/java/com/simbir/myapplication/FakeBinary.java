package com.simbir.myapplication;

public class FakeBinary {

    /*
    8 kyu
    Given a string of digits, you should replace any digit below 5 with '0'
    and any digit 5 and above with '1'. Return the resulting string.
    https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
    */

    public static String fakeBin(String numberString) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numberString);
        for(int i = 0; i < stringBuilder.length(); i++){
            if((Integer.valueOf(String.valueOf(stringBuilder.charAt(i))))  >= 5){
                stringBuilder.setCharAt(i, '1');
            }else {
                stringBuilder.setCharAt(i, '0');
            }
        }
        return stringBuilder.toString();
    }
}
