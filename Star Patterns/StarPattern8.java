// To print pattern:
// 12345
// 1234
// 123
// 12
// 1


public class StarPattern8 {
    public static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern(5);

    }
    
}
