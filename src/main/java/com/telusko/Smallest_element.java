package com.telusko;

public class Smallest_element {

    public static void main(String[] args) {
        int arr[]= {65,87,7,543,-7,-56,0};

        int smallest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
