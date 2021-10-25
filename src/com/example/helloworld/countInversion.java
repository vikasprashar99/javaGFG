package com.example.helloworld;

public class countInversion {
       static int count=0;
    static int[] mergeSort(int[] arr,int low,int high){
        if(low==high){
            int[] ta={1};
            ta[0]=arr[low];
            return ta;
        }
        int mid=(low+high)/2;
        int[] left=mergeSort(arr,low,mid);
        int[] right=mergeSort(arr,mid+1,high);

        int[] merged=merge2Sorted(left,right);
        return merged;
    }

    static int[] merge2Sorted(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] merged=new int[left.length+ right.length];

        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                k++;
                i++;
            }
//            count inversions here
            else{
                count+=left.length-i;
                merged[k]=right[j];
                k++;
                j++;
            }
        }
        while(i< left.length){
            merged[k]=left[i];
            k++;
            i++;
        }
        while(j< right.length){
            merged[k]=right[j];
            k++;
            j++;
        }
        return merged;
    }

    public static void main(String[] args){
        int[] arr={2,4,1,3,5};

        mergeSort(arr,0,arr.length-1);
        System.out.println(count);
    }
}
