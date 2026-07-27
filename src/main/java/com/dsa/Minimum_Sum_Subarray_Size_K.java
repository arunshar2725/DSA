package com.dsa;

public class Minimum_Sum_Subarray_Size_K {
    public static void main(String[] args) {
int[] arr ={1,2,3,4,2,1,3,4,2,2,5,5};
        int k =3;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int min=sum;
        for (int i = k; i <arr.length ; i++) {
            sum = sum-arr[i-k]+arr[i];
            if(sum<min){
              min=sum;
            }
        }
        System.out.println(min);

    }
}
