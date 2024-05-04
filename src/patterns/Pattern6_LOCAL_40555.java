package patterns;

public class Pattern6 {

    public void createPattern6(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pattern6 pattern6 = new Pattern6();
        pattern6.createPattern6(5);
    }
}


/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */