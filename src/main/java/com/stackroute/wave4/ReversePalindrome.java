package com.stackroute.wave4;

/* Write a Java method to Reverse the given input & Check if it is a Palindrome.*/


public class ReversePalindrome{

    public static String function(String inputString) {
        if (inputString != null)
        {
            String reverse = "";
            String b = "";
            for (int i = (inputString.length()) - 1; i >= 0; i--) //Function for reversing the string
            {
                reverse = reverse + inputString.charAt(i); //Checking for each character
            }
            if (reverse.equals(inputString))
            {
                b = inputString + " is a palindrome";
            } else
                {
                b = "Not a palindrome";
            }
            return b;
        }
        return null;
    }

    }

