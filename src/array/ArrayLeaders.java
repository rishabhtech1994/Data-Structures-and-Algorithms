package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    static ArrayList<Integer> arrayLeaders(int n, int[] arr) {
        /*
        Time Complexity
        ------------------
        O(N)
        Space Complexity
        -----------------
        O(N)
         */
        ArrayList<Integer> leaderArray = new ArrayList<>();
        int maxElement = arr[n-1];
        leaderArray.add(maxElement);
        for(int i = n-2 ; i >= 0; i--){
            if(arr[i] > maxElement){
                leaderArray.add(arr[i]);
                maxElement = arr[i];
            }

        }
        return leaderArray;
    }

    public static void main(String[] args) {
        int[] arr ={16,17,4,3,5,2};
        ArrayList<Integer> ans= ArrayLeaders.arrayLeaders(arr.length, arr);
        Collections.sort(ans, Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
}
