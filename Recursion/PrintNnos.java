

public class PrintNnos {
    public static void decOrder(int n){
        if(n == 1){
            System.out.println(1+" ");
            return;
        }
        System.out.print (n+" ");
         decOrder(n-1);
        
    }

    // public static void main(String[] args) {
    //     int n = 10;
    //     decOrder(n);
    // }




    public static void incOrder(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }
        incOrder(n-1);
        System.out.print (n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        incOrder(n);
    }
}
