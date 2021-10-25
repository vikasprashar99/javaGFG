package com.example.helloworld;

import java.util.Arrays;

public class minimumPlatforms {

    static void minPlat(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int maxTrains=0;
        int minPlatforms=0;
        while(i<arr.length && j<arr.length){
            if(arr[i]<=dep[j]){
                maxTrains++;
                i++;
            }
            else{
                maxTrains--;
                j++;
            }
            minPlatforms=Math.max(minPlatforms,maxTrains);
        }
        System.out.println(minPlatforms);

    }

    public static void main(String[] args){

       int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        minPlat(arr,dep);
    }
}
