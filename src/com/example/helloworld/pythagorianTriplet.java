package com.example.helloworld;

import java.util.Arrays;

public class pythagorianTriplet {

    static boolean pythagorian(int[] arr){

        for(int j=0;j<arr.length;j++){
            arr[j]=arr[j]*arr[j];
        }

        Arrays.sort(arr);

        for(int i=arr.length-1;i>=2;i--){
            int a=0;
            int b=i-1;
            while(a<b){
                if(arr[a]+arr[b]==arr[i]){
                    System.out.println("true");
                    return true;
                }
                else if(arr[a]+arr[b]<arr[i]){
                    a++;
                }
                else{
                    b--;
                }
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {

        int Arr[] = {3, 2, 4, 6, 5};
        pythagorian(Arr);

    }
    }
