import java.util.*;
public class continueStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            int a= sc.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println(a);            
        }
    }
}
