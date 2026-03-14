package codingQuestion;

import java.util.Arrays;

public class SubArraySum {



     public static int[] previewSum(int [] arr, int [][]query){
         int [] result = new int[query.length];
         int [] prevSum = new int [arr.length];

         int sum =0;
         for(int i = 0; i<arr.length;i++){
            sum = arr[i]+sum;

             prevSum[i] =sum;

         }

         System.out.println(Arrays.toString(prevSum));

         for(int i = 0 ; i<query.length;i++ ){

          result[i]= prevSum[query[i][1]]-prevSum[(query[i][0]>0?query[i][0]:1)-1];


         }

       return result;
     }
    public static void main(String[] args) {
        int [] arr = {-3,6,2,4,5,2,8,-9,3,1};


        int [][] twoDarr = {{4,5},
               {0,9},
                {4,6},
                {1,9}};


        System.out.println(Arrays.toString(previewSum(arr,twoDarr)) ); ;


        int [] result = new int[twoDarr.length];

        int l =0;
        int r= 0;
       for(int i =0 ;i<twoDarr.length;i++ ){
           l=twoDarr[i][0];
           r=twoDarr[i][1];
if(l>r){
    int temp = l;
    l=r;
    r=temp;
}


           for(int j = l; j<=r;j++){
               result[i]= arr[j]+ result[i];

           }
       }


        System.out.println(Arrays.toString(result));


        }


    }

