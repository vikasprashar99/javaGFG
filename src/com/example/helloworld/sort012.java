package com.example.helloworld;

public class sort012 {

    static void sortArr(int[] arr){
        int low=0;
        int mid=0, temp = 0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                 temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }

    }


    public static void main(String[] args){
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortArr(arr);
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
