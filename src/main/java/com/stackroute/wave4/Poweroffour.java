package com.stackroute.wave4;

public class Poweroffour {
    public static boolean function(int number){
        double     a = Math.log(number)/Math.log(4);
        boolean b = false;
        if(a%1==0){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }
}
