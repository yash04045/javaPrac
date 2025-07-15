

public class SumOfNaturalNo {
    public static int SumOfN(int n){
        if(n == 1){
            return 1;
        }
        int summation= SumOfN(n-1);
        int sum = n + summation;       

        return sum;
    }
    public static void main(String args[]){
        System.out.println(SumOfN(100));
    }
    
}
