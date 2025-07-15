/*Declares three different types of variables: an integer, a double, and a boolean.
Initializes these variables with values of your choice.
Performs the following operations:
Adds the integer and double variables and stores the result in a new variable.
Uses a relational operator to check if the integer variable is greater than the double variable and stores the result in another variable.
Uses a logical operator to check if both the boolean variable and the result from the relational operation are true.
Prints the results of each operation to the console.*/

public class practise1 {
    public static void main(String[] args) {
        int a = 10; // integer variable
        double b = 20.5; // double variable
        boolean c = true; // boolean variable

        double d = a + b;
        System.out.println(d);
        boolean e= a>b;
        System.out.println(e);
        System.out.println(c && e);

    }

    
}
