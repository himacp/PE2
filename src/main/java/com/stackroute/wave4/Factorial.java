package com.stackroute.wave4;


import java.util.Scanner;

/* This program provides the list of factorial numbers*/

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
    }
        public static String getFactorial(int number)
        {
        String s= "";
            for (int i = 1; i <= number; i++) //Checking for factorial number
            {
             s += "The factorial of " +i +" is "+ (fact(i))+ "\n" ;
            }
            return s;
        }
   public static int fact(int i){
        int p;
        if(i==1){
            return 1;
        }
        else{
            return i*(fact(i-1));
        }

   }
        }

