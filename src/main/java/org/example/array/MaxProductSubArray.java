package org.example.array;

import java.util.Scanner;

public class MaxProductSubArray {
    public static int maxProduct(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < 0){
                int temp = max;
                max = min ;
                min =temp;
            }
            min = Math.min(arr[i],arr[i]*min);
            max = Math.max(arr[i],arr[i]*max);
            ans = Math.max(ans,max);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
}
