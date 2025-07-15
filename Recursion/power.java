public class power {
    // public static int pow(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     int xnm1 = pow(x, n-1);
        
    //     int xn = x * xnm1;
    //     return xn;   
    // }

    //optimized power function
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        // int halfPowersq= optimizedPower( x,  n/2)*optimizedPower( x,  n/2); // does not reduces the time complexity stiil the time complexity is about O(n)
        int halfPower = optimizedPower( x,  n/2);
        int halfPowersq = halfPower * halfPower; // this part reduces the overall time complexity of the problem with TC  = O(log n).

        //n is odd
        if(n%2 != 0){
            halfPowersq *= x;
        }

        return halfPowersq;
    }
    public static void main(String args[]){
        System.out.println(optimizedPower(2,5));
    }
}
