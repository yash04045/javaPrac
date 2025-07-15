import java.util.*;

public class LargestNumber {
    public static int LargestNumber(int num[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest= Integer.MAX_VALUE; //infinity
            for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
            if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("Smallest number in the array is: " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6,14,20,4,58,90,299,455,677};
        System.out.println("Largest number in the array is: " + LargestNumber(num));
        
    }
}


//the time complexity of this code is O(n) where n is the number of elements in the array.