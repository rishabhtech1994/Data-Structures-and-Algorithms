package patterns;

public class Pattern5 {

    public void createPattern5(int n){
        for(int i = 0; i <=n ; i++){
            for(int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pattern5 pattern5 = new Pattern5();
        pattern5.createPattern5(5);
    }
}


/*
    Output
    --------
    * * * * *
    * * * *
    * * *
    * *
    *

 */