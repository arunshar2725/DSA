package com.telusko;

public class both {

    public static void main(String[] args) {
        int arr[] = {23,5,2,1,3,533,12,-4,-32,43};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
             if (arr[i] <smallest){
                smallest=arr[i];
            }
        }
        System.out.println("largest="+largest);
        System.out.println("smallest="+smallest);
    }
}

