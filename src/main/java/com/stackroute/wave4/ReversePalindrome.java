package com.stackroute.wave4;


public class ReversePalindrome{

    public static String function(String s){
            String reverse = "";
            String b = "";
            for (int i = (s.length()) - 1; i >= 0; i--) {
                reverse = reverse + s.charAt(i);
            }
            if(reverse.equals(s))
            {
                b = s + " is a palindrome";
            }
            else{
              b = "Not a palindrome";
            }
            return b;
        }


    }

