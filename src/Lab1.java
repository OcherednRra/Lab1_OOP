import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
    	/*	Умови лабораторної роботи:
	        1515 % 2 = 1  ----> операція O1 "-"
	        1515 % 3 = 0  ----> константа С = 0
	        1515 % 5 = 0  ----> операція О2 "*"
	        1515 % 7 = 3  ----> long - тип i & j	*/

        Scanner input = new Scanner(System.in);
        final int C = 0;	// за умовою

        System.out.print("n = ");
        final int n = input.nextInt();
        System.out.print("m = ");
        final int m = input.nextInt();
        System.out.print("a = ");
        final long a = input.nextLong();
        System.out.print("b = ");
        final long b = input.nextLong();

        if (n < a && m < b)
            System.out.println("Error: n & m must be more than a & b.");
        else {
            double S = 0;
            boolean flag = true;
            for (long i = a; i <= n; i++) {
                if (i - C == 0) {
                    System.out.println("Error: division by zero.");
                    flag = false;
                } else for (long j = b; j <= m; j++)
                    S += ((double) (i * j) / (i - C));
            }

            if (flag)
                System.out.println("Result: " + S);
            else
                System.out.println("The execution of the program is interrupted.");
        }
    }
}
