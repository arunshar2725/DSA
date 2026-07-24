package com.dsa;

public class Count_even {
    public static void main (String[] args){

        int arr[] = {12,33,1,23,43,5,32,2};
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
