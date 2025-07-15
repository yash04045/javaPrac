import java.util.*;
public class SumOfSecRow {
    public static int Sumof(int [][] matrix){
        int StartRow=1;
        int sum = 0;
        
       
        for(int StartCol=0; StartCol<matrix[StartRow].length; StartCol++){
            sum += matrix[StartRow][StartCol];
        }       
        
            
            
        
        return sum;
    }
    public static void main(String [] args){
        int matrix[][]={ {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("Sum of second row: " + Sumof(matrix));
    }
}
