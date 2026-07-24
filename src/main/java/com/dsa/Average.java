package com.dsa;

public class Average {
    public static void main(String[] args) {
        int[] arr = {12,33,1,23,43,5,32,2};

        double sum= 0;
        double avg = 0;

        for (int j : arr) {
            sum += j;
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
