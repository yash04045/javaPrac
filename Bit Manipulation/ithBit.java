public class ithBit {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i; // Create a bitmask with the ith bit set
        return (n & bitMask) == 0 ? 0 : 1; // Check if the ith bit is set
    }
    public static int setithBit(int n, int i){
        int bitmask = 1 << i;
        return ( n | bitmask) ; // Set the ith bit to 1
    }
    public static int clearithBit(int n, int i){
        int bitmask = ~(1 << i); // Create a bitmask with the ith bit cleared
        return (n & bitmask); // Clear the ith bit
    }
    public static int updateBit(int n, int i, int newBit){
        //first approach
        // if (newBit == 0){
        //     return clearithBit(n, i); // Clear the ith bit
        // }else{
        //     return setithBit(n, i); // Set the ith bit
        // }
        //second approach
        n = clearithBit(n, i); // Clear the ith bit
        int bitmask = newBit << i; // Create a bitmask with the newBit at the ith position
        return (n | bitmask); // Set the ith bit to newBit
    }
    public static void main(String[] args) {
   // Example bit position (0-indexed)
       
        System.out.println( getIthBit(10, 2));
        System.out.println(setithBit(10, 2));
        System.out.println(clearithBit(10, 2));
        System.out.println(updateBit(10, 2, 1));
    }
}