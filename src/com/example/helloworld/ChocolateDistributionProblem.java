package com.example.helloworld;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    static void cdProb(int[] arr,int m){
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-m;i++){
            int minG=arr[i];
            int maxG=arr[i+m-1];
            int gap=maxG-minG;
            ans=Math.min(gap,ans);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {

    int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
    int m=5;
    cdProb(arr,m);

    }
    }
