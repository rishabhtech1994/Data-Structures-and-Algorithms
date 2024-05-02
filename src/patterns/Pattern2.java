package patterns;

public class Pattern2 {

    public void createPattern(int no){
        for(int i = 0 ; i< no; i++){
            for( int j =0; j < i+1 ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Pattern2 pat2 = new Pattern2();
        pat2.createPattern(5);
    }

}



/*
    Output
    --------
    *
    * *
    * * *
    * * * *
    * * * * *

 */
