// TO print the star pattern with spaces
//   *
//  **
// ***

import java.util.*;
public class StarPattern7 {
    public static void Inverted_Pattern(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop(Spaces)
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");                
            }
            //inner loop(Asterisks)
            for(int j=1; j<=i;j++){
                    System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Inverted_Pattern(a);
    }  
}
