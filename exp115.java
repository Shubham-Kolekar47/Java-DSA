import java.util.*;
public class exp115{
    public static int buyandsell(int prices[]) {// time complexity of this program is big o of n
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length;i++){
            if(buyPrice< prices[i]){//profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
        }else{
            buyPrice = prices[i];
        }
        
    }
    return maxProfit;
}
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsell(prices));
    }
}

