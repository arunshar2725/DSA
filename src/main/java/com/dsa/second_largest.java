package com.dsa;

public class second_largest {
    public static void main(String[] args) {
      int arr[] = {32,34,222,632,-65,254,2,456,4,31,467,2,45,2,13,56};
        int largest = arr[0];
        int second_largest = Integer.MIN_VALUE;

        for (int i =1;i<arr.length;i++){
          if(arr[i]>largest){
              second_largest=largest;
              largest=arr[i];
          }
          if (arr[i] <largest && arr[i]>second_largest){
              second_largest=arr[i];
          }


        }
        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second_largest);
    }
}
