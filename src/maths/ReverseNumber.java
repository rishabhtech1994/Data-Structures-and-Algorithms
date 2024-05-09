package maths;

public class ReverseNumber {

    public void reverseNumber(int n){
        int last = 0;
        while(n > 0){
            last = n %10;
            n = n / 10;
            System.out.print(last);
        }
    }
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.reverseNumber(21345345);
    }
}
