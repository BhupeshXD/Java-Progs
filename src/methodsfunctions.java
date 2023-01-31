import java.util.Scanner;

public class methodsfunctions {
//    public static void main(String[] args) {
////        sum();
//        int ans = sum2();
//        System.out.println(ans);
//    }
//
//    // return the value
//    static int sum2() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;
//}
//    static void sum() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Final output: " + sum);
//    }

//    public static void main(String[]args){
//        Greeting();
//    }
//
//    static void Greeting(){
//        System.out.println("Hello World");
//
//    }


    //string Example

//    public static void main(String[] args){
//        String msg = greet();
//        System.out.println(msg);
//    }
//    static String greet(){
//        String greeting = "How are you ?";
//        return greeting;
//    }

    //passing the value of numbers when   are calling the method in main()
//    public static void main(String []arg){
//        int ans = sum3(23,21);
//        System.out.println(ans);
//    }
//        static int sum3(int a, int b){
//        int sum = a+b;
//        return sum;
//        }
//}

public static void main(String[]args){
    int a =10;
    int b= 20;
    swap(a,b);
    System.out.println(a + "  " + b);
}
static void swap(int a, int b){
   int temp = a;
   a=b;
   b=temp;
}


}
