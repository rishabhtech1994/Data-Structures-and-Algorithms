package patterns;

public class Pattern9 {

    public void createPattern9(int num){
        for(int i =0 ; i < num ; i++){
            // Space
            for (int j =0 ; j< num -i -1 ; j++){
                System.out.print(" ");
            }
            // Star
            for (int j =0 ; j< 2*i + 1 ; j++){
                System.out.print("*");
            }
            //Space
            for (int j =0 ; j< num -i -1 ; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        for(int i = 0 ; i < num ; i++){
            // Space
            for (int j =0 ; j< i ; j++){
                System.out.print(" ");
            }
            // Star
            for (int j =0 ; j< 2*num -(2*i+1) ; j++){
                System.out.print("*");
            }
            //Space
            for (int j =0 ; j< i ; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pattern9 pattern9 = new Pattern9();
        pattern9.createPattern9(5);
    }
}


/*

     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *

 */


