public class homework5 {
    public static void BubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            int currPos= i;
            for(int j=i+1;j<a.length;j++){
                if(a[currPos]>a[j]){
                    currPos=j;
                }
            }
            int temp = a[i];
            a[i]=a[currPos];
            a[currPos]=temp;
        }
    }


    public static void InsertionSort(int[] a) {
        for(int i=0;i<a.length;i++){
            int Currpos=a[i];
            int prev=i-1;
            while(prev>=0&& a[prev]>Currpos){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=Currpos;
        }
    }

    public static void printArr(int[] a) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" , ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        int[] a = {3,6,2,1,8,7,4,5,3,1};
        InsertionSort(a);
        printArr(a);
        
    }
}
