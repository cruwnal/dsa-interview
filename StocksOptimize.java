// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class StocksOptimize {
    public static void main(String[] args) {
        
        int [] arr = new int[] {4,5,6,3,8,2,1};
       // System.out.println("Try programiz.pro");
        int [] result = new int [2];
         int minPrice = arr[0];
        int maxProfit = 0;

        int buyIndex = 0;
        int sellIndex = 0;
        int tempBuy = 0;

        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];
                tempBuy=i;
            }
            
            int profit = arr[i] - minPrice;
            
            if(profit>maxProfit){
                maxProfit=profit;
                 buyIndex = tempBuy;
                sellIndex = i;
            }
            
        }
        
      System.out.println(arr[buyIndex]+" "+arr[sellIndex]);
        
    }
}
