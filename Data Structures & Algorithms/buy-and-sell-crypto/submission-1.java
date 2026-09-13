class Solution {
    public int maxProfit(int[] prices) {


        int minimumPrice = prices[0];
        int maxProfit = 0;

        for(int price : prices){


            if(price < minimumPrice){
                minimumPrice = price;
            }else{
                int mp = (price - minimumPrice);
                if(mp > maxProfit){
                    maxProfit = mp;
                }
                
            }


        }

        return maxProfit;
        
    }
}
