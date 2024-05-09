package patterns;

public class Pattern13 {
    public void createPattern(int n){
        int start = 2*(n-1);
        for(int i =1; i<=n ; i++){
            //number
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }

            //space
            for(int j = 1; j<= start; j++ ){
                System.out.print(" ");
            }

            //Number
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.print("\n");
            start -=2;

        }
    }
    public static void main(String[] args) {
        Pattern13 pattern13 = new Pattern13();
        pattern13.createPattern(4);
    }
}

/*

1      1
12    21
123  321
12344321

 */
