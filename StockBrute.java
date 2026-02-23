// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class StockBrute {
    public static void main(String[] args) {
        
        int [] arr = new int[] {4,5,6,3,8,2,1};
        System.out.println("Try programiz.pro");
        int [] result = new int [2];
        int profit =0;
        int temp=0;
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                
                 temp = arr[j]-arr[i];
                if(temp>profit){
                   profit= temp;
                   result[0]=i;
                   result[1]=j;
                    
                }
            }
        }
        
      System.out.println(arr[result[0]]+" "+arr[result[1]]);
        
    }
}
