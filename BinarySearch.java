// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int [] arr= {0,1,2,3,4,4,4,4,5,6,7,8,9,10,11};
     
        
        System.out.println(searchElement(arr,9));
    }
    public static int searchElement(int[] arr,int key ){
        
        if(arr.length<=0) return -1;
        int start=0;
        int end = arr.length-1;
      
        while(start<=end){
          int mid = start +(end-start)/2;
          
          if(arr[mid]==key) return mid;
          
          if(key < arr[mid]){
              end=mid-1;
          }else{
              start = mid+1;
          }
      
        }
        
        return -1;
    }
}
