//this code finds the maximum sum of all subarrays in a given array using PREFIX SUM approach.
//



import java.util.*;

public class MaxSubArrays {
    public static void Subarrays(int num[]){
        int CurrSum=0;
        int Largest = Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        prefix[0]=num[0]; // Initialize the first element of prefix sum array
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i]; // Calculate prefix sum
        }

        for(int i=0;i<num.length;i++){

            // used j=i insead of j=i+1 to include single element subarrays
            for (int j=i;j<num.length;j++){ 
                CurrSum= i==0 ? prefix[j] : prefix[j]-prefix[i-1]; // Calculate current subarray sum using prefix sums
                
                if (CurrSum > Largest){
                    Largest = CurrSum;
                }
            }
        }
        System.out.println("Largest sum of any subarray: " + Largest); 
    }
    public static void main(String[]args){
        int num[]= {2,4,6,8,10};
        Subarrays(num);
       
        System.out.println();
        
    }
}



//the time complexity of this code is O(n^2) because we are using two nested loops to iterate through the array.
// However, the prefix sum approach optimizes the calculation of subarray sums, making it more efficient than the brute force method.

    

