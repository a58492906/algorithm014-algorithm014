class Solution {
        public boolean lemonadeChange(int[] bills) {
            int five=0; int ten =0;
            for (int i:bills){
          if (i==5){
              five++;
          }
          if(i==10){

              if(0==five){
                  return  false;
              }
              else {
                  five--;
                  ten++;
              }
          }
          if(i==20){
           
              if(0!=five&&0!=ten){
                  five--;
                  ten--;
              }
              else if(five>=3){
                  five=five-3;
              }
              else {
                  return false;
              }
          }


         }
return  true;
        }
    }