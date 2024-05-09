package patterns;

public class Pattern12 {

    public void createPattern12(int n){
        int start =1;
        for(int i =0 ; i<n ;i++){
            if(i %2 == 0) start = 1;
            else start =0;
            for(int j =0;j<=i ; j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pattern12 pattern12= new Pattern12();
        pattern12.createPattern12(5);
    }
}


/*


1
01
101
0101
10101

 */