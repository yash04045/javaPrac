//there are 2 approaches to reverse an array the first one is to create a new array and copy the elements in reverse order,
// and the second is by swapping the elements in the original array.
//the second approach is more efficient in terms of space complexity as it does not require additional space for a new array.


public class Reverse {
    public static void reverse(int number[]){
        int start=0;int last=number.length-1;
        while(start<last){
            int temp=number[last];
            number[start]=number[last];
            number[last]=temp;
            start++;
            last--;
        }

    }
    public static void main(String[] args) {
        int num[]= {1, 2, 3, 4, 5, 6, 14, 20, 4};
        System.out.println("Before reversing the array: " + java.util.Arrays.toString(num));
        reverse(num);
        // System.out.println("After reversing the array: " + java.util.Arrays.toString(num));        //one of the ways to print the array with brackets though. other way is to use for loop
        System.out.print("After reversing the array: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        
    }

    
}
