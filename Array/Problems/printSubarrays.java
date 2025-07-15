//a contiguous part of array is called a subarray.
//every size n array has n*(n+1)/2 subarrays.
//Also we got MaxSubaraySum using brute force approach.


public class printSubarrays{

    public static void Subarrays(int num[]){
        int Largest = Integer.MIN_VALUE; // Declare outside all loops
        for(int i=0;i<num.length;i++){

            // used j=i insead of j=i+1 to include single element subarrays
            for (int j=i;j<num.length;j++){ 
                int sum = 0; // Reset sum for each subarray
                // Print subarray from index i to j
                for(int k=i;k<=j;k++){
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                }   
                System.out.println(); 
                System.out.println("Sum: " + sum); // Print sum of current subarray
                if (sum > Largest){
                    Largest = sum; // Update Largest if current sum is greater
                }
            }
        }
        System.out.println("Largest sum of any subarray: " + Largest); // Print largest sum after all subarrays
    }
    public static void main(String[]args){
        int num[]= {2,4,6,8,10};
        Subarrays(num);
        System.out.println(num.length);
        System.out.println();
        System.out.println("Total number of subarrays: " + (num.length * (num.length + 1)) / 2);
    }
}


