import java.util.*;

public class ActivitySelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9}; //sorted on end time basis.

        int activities[][] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }  //these part is done when the end time is not sorted but right now in the input the end time is sorted therefore it will work the same even without the this part.
        
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));  //lambada function -> short form 

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i<end.length;i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];                
            }
        }
        System.out.println("Max Activity: "+ maxAct);

        for(int i = 0; i<ans.size();i++){
            System.out.print("A"+ans.get(i)+ " ");
        }
        System.out.println();
    }
}
