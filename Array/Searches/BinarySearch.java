import java.util.*;
public class BinarySearch {
    public static int BS(int number[],int key){
        int start=0 , end=number.length-1;
        

        while( start <= end){
            int mid = (start + end) / 2;
            //compare
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;   //right side
            }
            else{
                end=mid-1;//left side
            }
        }
        return -1; //if the key is not found

    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 14, 20, 4};
        int key =4;
        System.out.println("The index of the key id : " + BS(number, key));
    }
    
}

// Time complexity is O(log n) since we are dividing the array in half each time i.e.... divided by 2 and it's power of 2 we can calculate time complexity as n/2^(k) = 1 
// n=2^(k) => log n = k

//Binary search is better than linear search because it count's the number of iterations in logarithmic time, which is much faster than linear time for large datasets.
