import java.util.*;
public class OnesComplement {
    public static void main(String[] args){
        System.out.println(~5);  // Output: -6 because MSB is 1
        System.out.println(~3);  // Output: -4 because MSB is 1
        System.out.println(~0);  // Output: -1 because MSB is 1
        System.out.println(~-1); // Output: 0 because MSB is 0
    }
}
