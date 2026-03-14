package codingQuestion;

import java.util.Arrays;

public class PrefixSumArrayTwo {

    public static void main(String[] args) {
        int [] arr = {-3,6,2,4,5,2,8,-9,3,1};

//[7, 22, 15, 22]
        int [][] twoDarr = {{4,5},
                {0,9},
                {4,6},
                {1,9}};

        System.out.println(Arrays.toString(sumOfQuery(arr,twoDarr))  );


    }


    public static int[] sumOfQuery(int[] arr, int [][] query){
        int sum =0;

        int [] result = new int[query.length ];
        for(int i=0;i<arr.length;i++) {

            sum= arr[i]+sum;
            arr[i]= sum;
        }



        for(int i=0;i<query.length;i++){
            result[i]=arr[query[i][1]]-arr[(query[i][0]>0?query[i][0]:1)-1];
        }

        return result;
    }
}
