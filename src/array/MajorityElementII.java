package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] arr){
        int count1 =0;
        int count2 = 0;
        int el1= Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        // TC == O(N)
        for(int i =0 ; i< arr.length; i++){
            if(count1 == 0 && el2!= arr[i]){
                count1 = 1;
                el1 = arr[i];
            } else if(count2 ==0 && el1 != arr[i]){
                count2 =1;
                el2 = arr[i];
            }else if(arr[i] == el1) count1 ++;
            else if(arr[i] == el2)  count2++;
            else{
                count2 --;
                count1 --;
            }
        }
        // TC == O(N)
        // Now let iterate to find the element 1 and 2 are correct
        List<Integer> list = new ArrayList<>();
        // re initialising counters
        count2 = 0;
        count1 = 0;
        for(int i =0 ; i<arr.length ; i++){
            if(el1 == arr[i]) count1 ++;
            if(el2 == arr[i]) count2 ++;

        }
        int mini = (int)(arr.length / 3) + 1;
        if (count1 >= mini) list.add(el1);
        if (count2 >= mini) list.add(el2);
        // O(log n) // negligible
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
