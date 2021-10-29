import java.util.Scanner;

public class octalNumberSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1, b, c = 0;
        while (a > 0) {
            b = a % 8;
            a = a / 8;
            c += b * i;
            i *= 10;
        }
        System.out.println(c);
    }
}
