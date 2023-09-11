package org.example.array;

import java.util.HashMap;

public class UnionOfArrays {
    public static int union(int a[], int n, int b[], int m)
    {
        //Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int element:a){
            if(hm.get(element) == null)
                hm.put(element,1);
            else{
                hm.put(element,hm.get(element)+1);
            }
        }

        for(int element:b){
            if(hm.get(element) == null)
                hm.put(element,1);
            else{
                hm.put(element,hm.get(element)+1);
            }
        }

        return hm.size();

    }
}
