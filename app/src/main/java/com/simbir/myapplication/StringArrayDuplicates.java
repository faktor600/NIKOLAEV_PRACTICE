package com.simbir.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayDuplicates {
    /*
    6 kyu

    In this Kata, you will be given an array of strings and your task is to remove all consecutive
    duplicate letters from each string in the array.

    For example:

    dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
    dup(["kelless","keenness"]) = ["keles","kenes"].

    Strings will be alphabet characters only. Don't worry about lower and upper case.
    See test cases for more examples.

    Good luck!

    https://www.codewars.com/kata/59f08f89a5e129c543000069/train/java
    */

    public static String[] dup(String[] arr){
        List<String> finalArray = new ArrayList<>();
        for(String string : arr){
            List<String> list = Arrays.asList(string.split(""));
            List<String> finalList = new ArrayList<>();
            finalList.add(list.get(0));
            for(int i = 0; i < list.size() - 1; i++){
                if(!list.get(i).equals(list.get(i + 1))){
                    finalList.add(list.get(i + 1));
                }
            }
            finalArray.add(String.join("", finalList));
        }
        return finalArray.toArray(new String[0]);
    }
}
