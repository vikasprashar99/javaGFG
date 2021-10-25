package com.example.helloworld;

public class rearrangeArrayAlternately {

    static void reArr(int[] arr){
        int[] tempArr=arr.clone();

        int i=0;
        int j=arr.length-1;
        boolean flag=true;
        for(int k=0;k<arr.length;k++){
            if(flag){
                arr[k]=tempArr[j];
                j--;
            }
            else{
                arr[k]=tempArr[i];
                i++;
            }
            flag=!flag;
        }
        for(int z=0;z<tempArr.length;z++){
            System.out.println(arr[z]);
        }

    }

    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    reArr(arr);
    }
    }
