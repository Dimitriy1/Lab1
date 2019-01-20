import java.util.Scanner;

public class Romb {

    public static void drawRomb(int numb){
        int i = numb % 2;
        if (i == 0){
            throw new IllegalArgumentException("even number is not supported");
        }

        int k = i;
        int numbOfBlanks = numb / 2;
        while (true){
            String blank = "";
            for (int j = 0; j < numbOfBlanks; j++) {
                blank += " ";
            }
            for (int j = 1; j <= i ; j++) {
                blank += "*";
            }
            System.out.print(blank + "\n");
            if (k < numb) {
                numbOfBlanks--;
                i += 2;
                k = i;
            } else {
                numbOfBlanks++;
                i -= 2;
            }
            if (i < numb % 2){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        drawRomb(numb);
    }
}
