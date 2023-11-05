import java.util.Scanner;

    class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Basic Number Calculator");

        // Instructions
        System.out.println("You can start calculate the number like this (Num1 -> Space -> + Num2 and Your Ans is Here )");

        System.out.print("Please Start Calculation Here  - ");

        int i = sc.nextInt();
        char op = sc.next().charAt(0);
        int j = sc.nextInt();
        solve(i, j, op);

    }
    public static int solve(int i, int j, char op)
    {
        int ans = 0;
                                            // addition
        if (op == '+') {
            ans = i + j;
        }
                                        // subtraction
        else if (op == '-') {
            ans = i - j;
        }

                                     // multiplication
        else if (op == '*') {
            ans = i * j;
        }

                                   // Division
        else if (op == '/') {
            ans = i / j;
        }
                                //DisplayError
        else {
            System.out.println("invalid input");
        }
        // Result
        System.out.println("Your answer is - " + ans );
        System.out.println("Thank you for using this Program GoodBye!");
        return ans;
    }
}
//This program is made by Hamad Raza - 2K23/MSCS/16
//I use comment for better understanding and I just try to apply clean code rule.