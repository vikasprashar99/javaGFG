package com.example.helloworld;

public class mergeSortedArr {

    static void mergeArr(int[]arr1,int[]arr2){
        int[] res=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
                res[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i< arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while (j< arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }
        for(int z=0;z<res.length;z++){
            System.out.println(res[z]);

        }
    }

    public static void main(String[] args) {
       int[] arr1 = {1,3,5,7};
       int[] arr2 = {0,2,6,8,9};
        mergeArr(arr1,arr2);
    }
    }
