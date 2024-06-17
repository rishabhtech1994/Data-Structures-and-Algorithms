package array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraySum {

    public static int countMaxSubArrayOptimal(int[] arr, int k){
        int arrLen = arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        int preSum =0;
        int count=0;
        map.put(0,1);
        for(int i =0; i<arrLen; i++){
            preSum += arr[i];
            int remove = preSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return  count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int returnedSum= CountSubArraySum.countMaxSubArrayOptimal(arr,3);
        System.out.println("Rerurned Sum ="+returnedSum);
    }
}
