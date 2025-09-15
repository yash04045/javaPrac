import java.util.*;

public class IndianCoin {
    public static void main(String args[]){
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 59000;
        Arrays.sort(coin,Collections.reverseOrder()); 
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < coin.length; i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                    count++;
                    ans.add(coin[i]);
                    amount = amount - coin[i];
                }
            }
        }
        System.out.println("The minimum Number of coin/notes required is: " + count);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
