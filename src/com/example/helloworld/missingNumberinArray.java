package com.example.helloworld;

public class missingNumberinArray {

    static void missNum(int[] arr){
        int n=arr.length;
        int n_elements_sum = n * (n + 1) / 2;
        int sum = 0;

        for(int i = 0; i < n - 1; i++)
            sum += arr[i];

        System.out.println(n_elements_sum - sum);
    }

    public static void main(String[] args) {
    int[] arr={1,2,3,5};
    missNum(arr);
    }

}
