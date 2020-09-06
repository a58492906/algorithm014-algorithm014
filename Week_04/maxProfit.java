class Solution {
   public int maxProfit(int[] prices) {
          int count =0;
          int i=0;
          while (i<prices.length-1){
              if(prices[i+1]>prices[i]){
                  count+=prices[i+1]-prices[i];
                  i++;

              }
              else {
                  i++;
              }
          }
         return  count ;
          }
}