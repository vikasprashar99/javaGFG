package com.example.helloworld;
import java.util.*;

//Two Pointers
public class countTriplets {
    static void cTriplets(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = arr.length-1; i >= 2; i--) {
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                    count++;
                    l++;
                    r--;
                } else if (arr[l] + arr[r] < arr[i]) {
                    l++;
                } else {
                    r++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        cTriplets(arr);
    }}
