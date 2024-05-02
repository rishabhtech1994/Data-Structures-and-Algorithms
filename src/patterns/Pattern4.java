package patterns;

public class Pattern4 {

    public void createPattern4(int n){
        for(int i = 0; i< n ; i++){
            for(int j = 1 ; j <=i+1; j++){
                System.out.print(i+1+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Pattern4 pattern4 = new Pattern4();
        pattern4.createPattern4(5);
    }
}


/*
    Output
    --------
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5

 */
