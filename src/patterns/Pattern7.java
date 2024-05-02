package patterns;

public class Pattern7 {


    public static void createPattern7(int num){
        for(int i = 0 ; i< num ; i++){
            // Space
            for(int j = 0 ; j< num-i-1 ; j++){
                System.out.print(" ");
            }
            // Star
            for(int j = 0 ; j < (2*i +1) ; j++){
                System.out.print("*");
            }
            // Space
            for(int j = 0 ; j< num-i-1 ; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        //Pattern7 pattern7 = new Pattern7();
        Pattern7.createPattern7(5);


    }
}


/*

    *
   ***
  *****
 *******
*********

 */