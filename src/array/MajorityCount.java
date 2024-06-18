package array;

public class MajorityCount {

    static int majorityCountElement(int[] arr){
        int arrLen = arr.length;
        int el = 0;
        int cnt = 0;
        for(int i=0 ; i< arrLen; i++){
            if(cnt == 0){
                cnt=1;
                el = arr[i];
            }
            else if(el == arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i =0; i< arrLen; i++){
            if(arr[i]==el){
                cnt1 ++;
            }
        }
        if(cnt1 > arrLen/2){
            return el;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int returnedEl= MajorityCount.majorityCountElement(arr);
        System.out.println("Majority Element is "+ returnedEl);

    }
}
