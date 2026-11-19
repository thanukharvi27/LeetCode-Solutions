import  java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>(); 
        int[] copy=arr.clone();
        Arrays.sort(copy);
        int rank=1;

        for(int i=0;i<copy.length;i++){
            if(i>0 && copy[i]!=copy[i-1]){
                rank++;
            }
            map.put(copy[i],rank);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
        
    }
}