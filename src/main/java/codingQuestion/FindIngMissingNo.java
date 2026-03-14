package codingQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIngMissingNo {

    public static void main(String[] args) {
        int [] arr = {1,5,6,7,2,2,3,8,8,8};
        System.out.println(findMissingNo(arr)); ;
    }

    public static List<Integer> findMissingNo(int[] arr){

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int val = Math.abs(arr[i])-1;
            if(arr[val]>0){
                arr[val]= -arr[val];
            }
        }

        System.out.println(Arrays.toString(arr));



        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){

                result.add(i+1);
            }
        }
return result;
    }
}
