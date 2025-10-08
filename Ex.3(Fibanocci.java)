import java.util.Scanner;
public class FibonacciRecursive {

   
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Eneter a number :");
        int a = sc.nextInt();
        

        System.out.println("Fibonacci sequence up to " +a + " terms:");
        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
