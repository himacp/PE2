package com.stackroute.wave4;

/* Program, which reads number of students and n grades as input (of int between 0 and 100, inclusive) and displays
the average, minimum and maximum.Your program shall check for valid input.*/


public class StudentAverage {
    public static int studentMin(int length,int[] a){
        int     min = a[0];
        for(int i=0;i<length;i++)
        {
            if(a[i]<0||a[i]>100){
                return -1;
            }
            else{
                if(a[i]<min){
                    min = a[i];
                }
            }
        }
        return min;
    }


    public static int studentMax(int length,int[] a){
        int     max = a[0];
        for(int i=0;i<length;i++)
        {
            if(a[i]<0||a[i]>100){
                return -1;
            }
            else{
                if(a[i]>max){
                    max = a[i];
                }
            }
        }
        return max;
    }
    public static String studentAvg(int length,int[] a){
        double  avg=0;
        double  sum=0;
        String  average;
        for(int i=0;i<length;i++)
        {
            if(a[i]<0||a[i]>100){
                return "-1";
            }
            else{
               sum = sum + a[i];
            }
        }
        avg = sum/length;
        average = Double.toString(avg);
        return average+ "0";
    }

}
