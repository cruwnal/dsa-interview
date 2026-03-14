package codingQuestion;

import java.util.Arrays;

public class ShiftngZero {
    public static void main(String[] args) {
      int [] arr = {1,2,3,4,0,0,0,9,8,7,70,0,0,6};
        ;
        System.out.println(Arrays.toString(shiftingZeros(arr)));
    }

    public static int[] shiftingZeros (int [] arr){
        int indexes=arr.length-1;
        int [] shiftedArr = new int [arr.length];

        for(int i = arr.length-1; i>=0;i--){
            if(arr[i]>0){
                shiftedArr[indexes--]= arr[i];
            }
        }
        for(int i =0;i<=indexes;i++){
            shiftedArr[i]=0;
        }

        return shiftedArr;
    }
}
