public class KadanesAlgorithm {
   
    public static void kadane(int number[]){
        int MaxSum=Integer.MIN_VALUE;
        int Currsum=0;
        for(int i=0;i<number.length;i++){
            Currsum += number[i];
            if(Currsum < 0){
                Currsum = 0; // Reset current sum if it becomes negative
            }
            MaxSum = Math.max(Currsum, MaxSum);
        }
        // Check if all elements are negative and find the number closest to 0
        boolean allNegative = true;
        int closestToZero = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(number[i] >= 0){
                allNegative = false;
                break;
            }
            if(closestToZero == Integer.MIN_VALUE || number[i] > closestToZero){
                closestToZero = number[i];
            }
        }
        if(allNegative){
            System.out.println("All elements are negative. Number closest to 0 is: " + closestToZero);
        } else {
            System.out.println("Maximum subarray sum is: " + MaxSum);
        }
    }

   
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        kadane(num);
    }
    
}


// This implementation of Kadane's Algorithm efficiently finds the maximum sum of a contiguous subarray in O(n) time complexity.
// It iterates through the array, maintaining a running sum (`Currsum`) and updating the maximum sum found (`MaxSum`).
