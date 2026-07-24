package com.dsa;

public class Largest_element {

    public static void main(String[] args) {
      int[] arr = {20,43,-7,5,2,56,212,53,111,4};

        int largest = arr[0];

        for (int i=1 ;i<arr.length; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
