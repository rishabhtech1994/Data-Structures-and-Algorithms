package patterns;

import java.io.OutputStream;

public class Pattern1 {
    public void createPattern(int no){
        for(int i = 0 ; i < no; i++) {
            for (int j = 0; j < no; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Pattern1 pat = new Pattern1();
        pat.createPattern(4);
    }
}

/*
    Output
    --------
    * * * *
    * * * *
    * * * *
    * * * *

 */


