package array;

public class MaxProductSubArray {

    public int maxProduct(int[] arr){
        // Result will have the result of the Product
        int result = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length -1; i++){
            for(int j =i+1; j<arr.length; j++){
                int product =1;
                for(int k =i ; k<=j ; k++){
                    product *= arr[k];
                }
                result = Math.max(result, product);
            }
        }
        return result;
    }


    public int maxProductOpt(int[] arr){
        // We use the pre and suffix to find the mx.
        // This algo is a part of Kadane algo
        // Result will have the result of the Product
        int result = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i =0 ; i< arr.length-1 ; i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0)  suffix = 1;
            // start from front
            prefix = prefix * arr[i];
            //Start from back
            suffix = suffix * arr[arr.length-i-1];
            result = Math.max(result, Math.max(prefix, suffix));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -3, 0, -4, -5};
        MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
        int maxProd = maxProductSubArray.maxProductOpt(arr);
        System.out.println("MaxProd " +maxProd);
    }
}
