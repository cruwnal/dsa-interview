package codingQuestion;

import java.util.Arrays;

public class PreviewSumPractOne {
    public static void main(String[] args) {
        int [] arr = {-3,6,2,4,5,2,8,-9,3,1};


        int [][] twoDarr = {{4,5},
                {0,9},
                {4,6},
                {1,9}};


        System.out.println(Arrays.toString(getQuerySum(arr,twoDarr))  );

    }


    public static int [] getQuerySum(int [] arr, int [][] query){

        int [] prevSum = new int[arr.length];
        int [] result = new int[query.length];
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
            prevSum[i]= sum;
        }


        for(int i=0;i<query.length;i++){

            result[i]= prevSum[query[i][1]]-prevSum[     (query[i][0]>0?query[i][0]:1)-1];

        }

        return result;
    }
}
