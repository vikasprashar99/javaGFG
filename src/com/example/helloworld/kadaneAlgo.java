package com.example.helloworld;

public class kadaneAlgo {
        static void kadaneAlgorithm(int[]arr){
            int csum=arr[0];
            int osum=arr[0];
            for(int i=1;i< arr.length;i++){
            if(csum>=0){
                csum+=arr[i];
            }
            else{
                csum=arr[i];
            }
            if(csum>osum){
                osum=csum;
            }
            }
            System.out.println(osum);
        }
    public static void main(String[] args) {
            int[] arr={1,-2,3,-4,5};
        kadaneAlgorithm(arr);
    }

}
