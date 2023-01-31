public class patterns {

    public static void main(String[] args) {
        patterns(5);
    }
    static void patterns(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}

