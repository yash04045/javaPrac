import java.util.*;

public class Substring {
    // public static String subString(String str , int si , int ei){
    //     String substr= "";
    //     for(int i=si; i<ei; i++){
    //         substr+=str.charAt(i);
    //     }
    //     return substr;
    // }
    
    public static void main(String args []){
        String str = "HelloWorld";
        // System.out.println(subString(str, 0 ,5));
        System.out.println(str.substring(0 ,5));  // instead of writing our own substring method, we can use the built-in substring method
        System.out.println(str.substring(5));     // this will return the substring from index 5 to the end of the string
        System.out.println(str.substring(0, str.length())); // this will return the entire string
        
    }
}
