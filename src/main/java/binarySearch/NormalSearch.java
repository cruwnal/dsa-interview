package binarySearch;

public class NormalSearch {

    public static void main(String[] args) {
        int [] arr = {1,4,7,8,9,13,15,19};

       ;
        System.out.println( binarySearch(arr,6));
    }

    public static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
           // System.out.println(mid);
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target) {
                start = mid+1;
            }

        }


        return start;

    }
}
