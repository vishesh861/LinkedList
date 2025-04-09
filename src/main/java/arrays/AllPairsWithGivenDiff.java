package arrays;

import java.util.HashMap;
import java.util.Map;

public class AllPairsWithGivenDiff {

    public int countKDifference(int[] arr, int diff) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0;i< arr.length;i++){
            if(map.containsKey(arr[i]-diff)){
                count+= map.get(arr[i]-diff);
            }
            if(map.containsKey(arr[i]+diff)){
                count+= map.get(arr[i]+diff);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        return count;
    }
}
