package com.example.helloworld;

public class reverseArrayGroup {

    static void reverArr(int[] arr,int k){
        for(int i=0;i<arr.length;i+=k){
            int l=i;
            int r=Math.min(i+k-1,arr.length-1);
            while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l+=1;
            r-=1;
            }
        }
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }

    }

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5};
        int k=3;
        reverArr(arr,k);

    }
}
