package com.example.helloworld;

import java.util.*;
//using hash
public class JAVAPROBLEMS {
    static void SubArrGivenSum(int[] arr, int sum){
        int tempAns=0;
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            tempAns+=arr[i];
            if(tempAns==sum){
                System.out.println("0" + i);
                break;
            }
            if(hash.containsKey(tempAns-sum)){
                System.out.println(hash.get(tempAns-sum)+1 + i);
                break;
            }
            hash.put(tempAns, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int sum = -10;
        SubArrGivenSum(arr, sum);
    }
}
