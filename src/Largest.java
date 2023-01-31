import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter a : ");
        // int a = in.nextInt();
        // System.out.print("Enter b : ");
        // int b = in.nextInt();
        // System.out.print("Enter c : ");
        // int c = in.nextInt();


        // largest 3 number

        // int max = a;
        // if(b>max){
        // max=b;
        // }
        // if(c>max){
        //    max=c;
        // }
        // System.out.print("Largest number is : ");
        // int max  = Math.max(c , Math.max(a, b));
        // System.out.print(max);


        // CaseCheck for single letters wether it is upper case or lowercase

//    Scanner in = new Scanner(System.in);
//    char ch = in.next().trim().charAt(0);

//    if(ch >='a' && ch<='z'){
//       System.out.println("LowerCase");
//    }else if(ch>='A' && ch<='Z'){
//       System.out.println("Uppercase");
// }


        // fibo

        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int a= 0;
        // int b = 1;
        // int count =2;

        // while(count<=n){
        //    int temp = b;
        //    b = b+a;
        //    a=temp;
        //    count++;
        // }
        // System.out.println(b);

        //CountNums in a number

//
// int n = 35325333;
// int count = 0;
//
// while(n>0){
//    int rem = n % 10;
//    if(rem == 3)
//    {
//       count++;
//    }
//    n = n / 10;
//    }
//        System.out.println(count);

        // reverse a number
//        int num = 123456;
//
//        int ans = 0;
//
//        while (num > 0) {
//            int rem = num % 10;
//            num /= 10;
//
//            ans = ans * 10 + rem;
//
//        }
//        System.out.println(ans);

        Scanner in = new Scanner(System.in);
        int ans = 0;
        // Take input from user till user does not press X or x

        while (true) {
            //take operatir as input
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // taking inputs

                System.out.print("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;

                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op =='x' || op == 'X' ) {
                break;
            }
            else{
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }

    }
}


    