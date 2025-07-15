

public class FindFactorial {
    public static int factorial(int n){
        if(n == 0){
            // System.out.println(1);
            return 1;
        }
        int fact = factorial(n-1);
        int facts = n * fact;

        return facts;
    }
    public static void main(String args[]){
        // int n = 5;
        System.out.println(factorial(5));
    }
}
