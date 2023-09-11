package org.example.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfArrays {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }

       int[] res = intersection(arr1,arr2);
        for(int element:res)
            System.out.print(element+" ");
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int element : nums1){
            if(hm.get(element) == null ){
                hm.put(element,1);
            }else{
                hm.put(element,hm.get(element)+1);
            }
        }
        int size = 0;
        for(int element : nums2){
            if(hm.get(element) == null ){

            }else{
                if(hm.get(element)!=-1){
                    size++;
                    hm.put(element,-1);
                }
            }
        }
        int[] res = new int[size];
        int i = 0;
        Iterator<Map.Entry<Integer,Integer>> iterator = hm.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> ent = iterator.next();
            if(ent.getValue() == -1){
                res[i++] = ent.getKey();
            }
        }
        return res;
    }
}
