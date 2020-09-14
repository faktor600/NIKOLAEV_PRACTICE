package com.simbir.myapplication.tasks;

public class FirstTask {

    /*
    Usually when you buy something, you're asked whether your credit card number,
    phone number or answer to your most secret question is still correct. However,
    since someone could look over your shoulder, you don't want that shown on your screen.
    Instead, we mask it.

    Your task is to write a function maskify,
    which changes all but the last four characters into '#'.
    */

    public String maskify(String str){
        if(str.length() <= 4){
            return str;
        }else {
            int length = str.length();
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = new char[4];
            str.getChars(length - 4, length, chars, 0);
            for(int i = 0; i < length - 4; i++){
                stringBuilder.append("#");
            }
            stringBuilder.append(chars);
            return stringBuilder.toString();
        }
    }

}
