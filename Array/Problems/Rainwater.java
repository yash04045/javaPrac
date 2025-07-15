public class Rainwater {
         public static int maxArea(int[] height) {
        int n = height.length;
        //find leftmax height
        int leftmax[]= new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
        }
        //find rightmax height
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i = n-2; i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //find the min from both the maxes
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel= Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String [] args){
        int num[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(num));
    }
}

