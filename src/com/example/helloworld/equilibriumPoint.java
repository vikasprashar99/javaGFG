package com.example.helloworld;

public class equilibriumPoint {
//    binary search
    static void equiPoint(int[] arr){
        int mid=arr.length/2;
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<mid;i++){
            leftsum+=arr[i];
        }
        for(int j=arr.length-1;j>mid;j--){
            rightsum+=arr[j];
        }
        if(rightsum>leftsum){
            while (rightsum>leftsum && mid<arr.length-1){
            rightsum-=arr[mid+1];
            leftsum+=arr[mid];
            mid++;
            }
        }
        else{
            while (leftsum>rightsum && mid>0){
                leftsum-=arr[mid-1];
                rightsum+=arr[mid];
                mid--;
            }
        }
        if(leftsum==rightsum){
            System.out.println(mid);
        }
        else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args){
        int[] arr={3,2,5,1,4};
        equiPoint(arr);
    }
}
