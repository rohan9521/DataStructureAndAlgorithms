package org.example.array;

import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] arr,int n){
        for(int i=0;i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-1-i] = temp;
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        reverse(arr,n);
        for(int element:arr)
            System.out.print(element+" ");
    }
}
