package com.simbir.myapplication;

public class ReversedStrings {

    /*
    8 kyu
    Complete the solution so that it reverses the string passed into it.

    'world'  =>  'dlrow'
    https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
    */

    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
