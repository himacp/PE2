package com.stackroute.wave4;


public class EvenNumber {
    public static boolean isEven(int number){
        boolean     p = false;
        if(number%2==0){
            p = true;
        }
        else{
            p = false;
        }
        return p;
    }
}
