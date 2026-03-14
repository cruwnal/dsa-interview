package codingQuestion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,5,7,5,4,2,4,6};
        int target = 10;
        twoSum(arr,target);

        for(int i:twoSum(arr,target)){
            System.out.println(i);
        }

    }


    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            int comp = target- arr[i];

            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }

            map.put(arr[i],i);
        }
return new int[]{-1,-1};
    }
}
