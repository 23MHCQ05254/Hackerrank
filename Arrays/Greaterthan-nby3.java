import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
         LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();;
         for(int num: arr){
             hm.put(num,hm.getOrDefault(num,0)+1);
         }
         ArrayList<Integer> list=new ArrayList<>();
        int tar=arr.length/3;


         for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
             if(entry.getValue()>tar){
                 list.add(entry.getKey());
             }
         }
         Collections.sort(list);
         return list;
    }
}