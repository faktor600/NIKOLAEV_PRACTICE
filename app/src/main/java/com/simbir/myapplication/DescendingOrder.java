package com.simbir.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DescendingOrder {

    /*
    7 kyu
    Your task is to make a function that can take any non-negative integer as a argument
    and return it with its digits in descending order. Essentially, rearrange the digits
    to create the highest possible number.

    https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
    */

    public static int sortDesc(final int num) {
        List<Integer> arrayList = new ArrayList<>();
        int value = num;
        while(value != 0){
            arrayList.add(value % 10);
            value = value / 10;
        }
        int count = arrayList.size() - 1;
        long maxNumber = 0;
        while (count != 0){
            int max = 0;
            for(int i = 0; i < arrayList.size(); i++){
                if(max < arrayList.get(i)){
                    max = arrayList.get(i);
                }
            }
            arrayList.remove((Object) max);
            int tens = (int) Math.pow(10, count + 1);
            maxNumber = maxNumber + (long) max * tens;
            count--;
        }
        return 1;
    }

}
