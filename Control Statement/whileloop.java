// public class whileloop {
//     public static void main(String[] args) {
//         int counter=0;
//         while (counter<100) {
//             System.out.println("wassup My man");
//             counter++;
//         }
//     }
// }


// public class whileloop {
//     public static void main(String[] args) {
//         int i=1;
//         while (i<11) {
//             System.out.print(i+" ");
//             i++;            
//         }        
//     }
// }


// import java.util.*;
// public class whileloop {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int i=1;
//         while (i<=n) {
//             System.out.print(i+" ");
//             i++;
//         }
//     }
// }



import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            
            sum=sum+i;
            i++;            
            
        }
        System.out.println(sum);
    }
}