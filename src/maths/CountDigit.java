package maths;

public class CountDigit {

    public void countDigitInNumber(int n){
        int count =0;
        while(n > 0){
            //int last = n %10;
            n = n/10;
            count ++;
        }
        System.out.print("Count "+count);
    }

    public static void main(String[] args) {
        CountDigit countDigit = new CountDigit();
        countDigit.countDigitInNumber(456789);
    }

    /// Time com
    // O(log10(N) // iteration depends on div,
}
