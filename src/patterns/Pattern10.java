package patterns;

public class Pattern10 {

    public void createPattern10(int num){
        for (int i =0 ; i <= 2 * num  ; i++) {
            int star = i;
            if (i > num) star = 2 * num - i;
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pattern10 pattern10 = new Pattern10();
        pattern10.createPattern10(5);
    }
}


/*

 *
 **
 ***
 ****
 *****
 ******
 *****
 ****
 ***
 **
 *


 */