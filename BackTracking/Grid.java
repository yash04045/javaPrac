public class Grid {
    public static int getGrid(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){
            return 1;            
        }else if(i == n || j == m ){
            return 0;
        }

        //kaam(Recursion).
        int way1 = getGrid(i+1,j,n,m);
        int way2 = getGrid(i,j+1,n,m);

        return way1 + way2;
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        // System.out.println(getGrid(0,0,n,m));
        System.out.println(getGrid(0,0,n,m));
    }
}


//we can solve it using permutation as well it improves the time complexity form O(2^n+m) to O(n).