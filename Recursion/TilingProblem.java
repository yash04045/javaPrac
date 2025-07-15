// Given "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using 2 x 1 tiles. (A tile can either be placed horizontally or vertically). 
public class TilingProblem {
    public static int solveTile(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        // int fnm1 = solveTile(n-1); // vetical choice
        // int fnm2 = solveTile(n-2); // horizontal choice

        // int totways = fnm1 + fnm2;
        // return totways;

        return solveTile(n-1) + solveTile(n-2);
    }
    public static void main(String args[]){
        System.out.println(solveTile(4));
    }
}
