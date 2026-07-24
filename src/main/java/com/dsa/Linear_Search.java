package com.dsa;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] = {12, 45, 7, 89, 23};
        int target = 89;
        int index= -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
               index=i;
                break;

            }

        }
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }


    }
}
