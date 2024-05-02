package patterns;

public class Pattern3 {


    public void createPattern(int no){
        for(int i = 0; i < no ; i++){
            for(int j =1 ; j<= i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        Pattern3 pat3 = new Pattern3();
        pat3.createPattern(5);
    }
}



/*
    Output
    --------
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */