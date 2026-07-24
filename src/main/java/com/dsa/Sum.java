package com.dsa;

public class Sum {
    public static void main(String[] args) {
        int arr[] = {12,33,1,23,43,5,32,2};

        int sum= 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
