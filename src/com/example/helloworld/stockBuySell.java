package com.example.helloworld;

public class stockBuySell {

    public static void main(String[] args){
       int A[] =  { 100, 180, 260, 310,
               40, 535, 695 };

       int bd=0;
       int sd=0;
       int profit=0;


       for(int i=1;i<A.length;i++){
           if(A[i]>=A[i-1]){
              sd++;
           }
           else{
               profit+=A[sd]-A[bd];
                bd=sd=i;
           }
       }
System.out.println(profit);

    }
}
