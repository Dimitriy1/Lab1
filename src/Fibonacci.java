import java.util.Scanner;

public class Fibonacci {

    public static int fibo(int numb) {
        if (numb <= 2) {
            return 1;
        }

        return fibo(numb - 1) + fibo(numb - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println(fibo(numb));
    }
}