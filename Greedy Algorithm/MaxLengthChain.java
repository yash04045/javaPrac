import java.util.*;

public class MaxLengthChain {
    public static void main(String args[]){
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        List<int[]> selectedPairs = new ArrayList<>();
        selectedPairs.add(pairs[0]);

        for(int i = 1 ; i < pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
                selectedPairs.add(pairs[i]);
            }
        }
        System.out.println("Maximum Chain length = " + chainLen);
        System.out.print("The Chain Length Pairs are : ");
        for(int[] pair : selectedPairs){
            System.out.print( Arrays.toString(pair) + " ");
        }
        
    }
}
