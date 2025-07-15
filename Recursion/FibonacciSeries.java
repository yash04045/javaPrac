

public class FibonacciSeries {
    public static int calcFibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int Fbn = calcFibo(n-1);
        int Fbm = calcFibo(n-2);
        int Fibonacci = Fbn + Fbm;
        return Fibonacci;
    }
    public static void main(String args[]){
        System.out.println(calcFibo(5));
    }
}
