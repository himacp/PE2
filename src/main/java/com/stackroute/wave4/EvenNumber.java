package com.stackroute.wave4;

/*Checking whether the number is even or odd*/

public class EvenNumber {
    public static boolean isEven(int number)
    {
        boolean     p = false;
        if(number%2==0) //Checking for even number
        {
            p = true;
        }
        else{
            p = false;
        }
        return p;
    }
}
