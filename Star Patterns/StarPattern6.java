// To Print Hollow Rectangle Pattern
// **********
// *        *
// *        *
// *        *
// **********
// We'll take it as a matrix problem 
// We'll use a loop to print the matrix
// We'll use a condition to check if the current position is at the border of the matrix or not. If it's at the border, we'll print a star, otherwise we'll print balnk space. Boundary condition






public class StarPattern6 {
    public static void hollow_rectangle(int totRows, int totCol){
        for(int i=1;i<=totRows;i++){           //OTER LOOP
            for(int j=1;j<=totCol;j++){        // INNER LOOP
                if(i==1 || i==totRows || j==1 || j==totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(5, 10);
    }
}