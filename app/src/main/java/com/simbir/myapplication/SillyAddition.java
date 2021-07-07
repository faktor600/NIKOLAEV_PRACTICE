package com.simbir.myapplication;

import java.util.LinkedList;

public class SillyAddition {

    /*
    7 kyu

    https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java*/

    public int add(int num1, int num2){
        LinkedList<Integer> firstValue = getListFromInteger(num1);
        LinkedList<Integer> secondValue = getListFromInteger(num2);

        if(firstValue.size() > secondValue.size()){
            return getFinalValue(firstValue, secondValue);
        }else{
            return getFinalValue(secondValue, firstValue);
        }
    }

    private LinkedList<Integer> getListFromInteger(int value){
        LinkedList<Integer> integers = new LinkedList<>();
        while (value != 0){
            integers.addFirst(value % 10);
            value = value /10;
        }
        return integers;
    }

    private int getFinalValue(LinkedList<Integer> firstValue, LinkedList<Integer> secondValue){
        int sizeCount = firstValue.size() - secondValue.size();
        StringBuilder finalValue = new StringBuilder();
        while (sizeCount != 0){
            finalValue.append(firstValue.get(0));
            firstValue.remove(0);
            sizeCount--;
        }
        for(int i = 0; i < secondValue.size(); i++){
            finalValue.append(firstValue.get(i) + secondValue.get(i));
        }
        return Integer.valueOf(finalValue.toString());
    }
}
