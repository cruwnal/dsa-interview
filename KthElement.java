// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class KthElement {
    public static void main(String[] args) {
        
        //find the kth largest animal
      
             Integer [] arr = new Integer[]{1,8,7,9,5,4,6,4,11,12,85,99,77};
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i=0;i<arr.length;i++){
                 pq.add(arr[i]);
                 if(pq.size()>5){
                    pq.remove(); 
                 }
       }
       //4th largest element from the array
        Integer [] arr2 = new Integer[]{1,8,7,9,5,4,6,4,11,12,85,99,77};
       Optional <Integer> kthelement = Arrays.stream(arr2).sorted(Comparator.reverseOrder()).skip(3).findFirst();
       
       kthelement.ifPresent(System.out::println);
       
                 

       
      // System.out.println(pq.peek());
       
       
       
    }
}
