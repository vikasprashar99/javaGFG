package com.example.helloworld;

public class leaderinArr {

    static void leadinAr(int[] arr){
        int size=arr.length;
        int max_from_right =  arr[size-1];
        System.out.print(max_from_right);

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right);
            }
        }
    }

    public static void main(String[] args){
        int[] arr={16,17,4,3,5,2};
        leadinAr(arr);
    }
}
