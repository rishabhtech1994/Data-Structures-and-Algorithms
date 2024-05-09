package patterns;

public class Pattern8 {

    public void createPattern8(int num){
        for(int i = 0 ; i < num ; i++){
            // Space
            for(int j = 0 ; j< i ; j++){
                System.out.print(" ");
            }
            // Star
            for(int j = 0 ; j < 2*num - (2*i +1) ; j++){
                System.out.print("*");
            }
            // Space
            for(int j = 0 ; j< i ; j++){
                System.out.print(" ");
            }
            System.out.print("\n");

        }
    }
    public static void main(String[] args) {
        Pattern8 pattern8 = new Pattern8();
        pattern8.createPattern8(5);

    }
}


/*
 *********
  *******
   *****
    ***
     *
 */
