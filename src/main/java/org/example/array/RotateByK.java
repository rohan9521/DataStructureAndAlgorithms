package org.example.array;

import java.util.Scanner;

public class RotateByK {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        //edge cases
        if(k%n == 0)// array elements complete the rotation cycle
            return ;
        if(n == 1) // single element in array
            return ;

        int newK = k;
        if(n < k){
            newK = k%n;
        }

        int[] arrK = new int[newK];
        int j=0;


        for(int i=n-newK;i<n;i++){
            arrK[j++] = nums[i];
        }

        j=0;

        for(int i=0;i<n-newK;i++){
            nums[n-1-i] = nums[n-newK-i-1];
            j++;
        }

        for(int i=0;i<newK;i++){
            nums[i] = arrK[i];
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr,k);
        for(int  i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
