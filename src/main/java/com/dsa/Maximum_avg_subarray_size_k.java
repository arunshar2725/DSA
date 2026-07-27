package com.dsa;

public class Maximum_avg_subarray_size_k {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};

        int k = 3;

        int sum=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];

        }
        double avg = (double)sum / k;

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            avg= (sum/k);
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        double max_avg = (double) maxSum/k;
        System.out.println(max_avg);
    }
}

