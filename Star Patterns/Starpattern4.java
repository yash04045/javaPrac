// to print pattern
// A
// BC
// DEF
// GHIJ

public class Starpattern4 {
    public static void main(String[] args){
        char ch='A';
        int count=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i; j++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
