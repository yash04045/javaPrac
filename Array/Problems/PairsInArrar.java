import java.util.*;

public class PairsInArrar {
    
    public static void Pairs(int number[]){
        //using two for loops to print all the pairs in the array
        int totalPairs = number.length * (number.length - 1) / 2;
        for(int i=0;i<number.length;i++){
            int current = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" + current + "," + number[j] + ")");
            }
            System.out.println();             
        }
        System.out.println("Total pairs in the array are: " + totalPairs);
    }
    public static void main(String[] args){
        int num[] = {1, 2, 3, 4, 5};
        Pairs(num);
         
        
    }
}



//Imporrtant Point:
// to get total pairs in the array we can use the formula n(n-1)/2 where n is the number of elements in the array.
// For example, if the array has 5 elements, the total number of pairs will be 5(5-1)/2 = 10 pairs.

//and the second approach is by using two for loops to iterate through the array and print the pairs.

// Time Complexity is O(n^2).