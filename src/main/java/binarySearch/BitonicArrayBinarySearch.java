package binarySearch;

public class BitonicArrayBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,4,8,9,10,13,16,14,13,12,8,7,1};

int target=7;

        int peek = findPeek(arr);
        int result=-1;
        if(arr[peek]==target){
            System.out.println(peek);
        }else{
            result =  searchDesc(arr,peek,arr.length-1,target);
            System.out.println(result);
        if(result==-1){
            result=searchAsc(arr,0,peek,target);
            System.out.println(result);
        }

        }





        ;
    }

    public static int searchDesc(int [] arr, int start, int end, int target){
        while (start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target) return mid;
            if(arr[mid]<target){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return -1;
    }


    public static int searchAsc(int [] arr, int start, int end, int target){

        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }




    public static int findPeek(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;


            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }



        }


return start;
    }


}
