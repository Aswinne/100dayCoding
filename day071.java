import java.util.Scanner;

public class day071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Bilangan ini adalah positif.");
        } else if (number < 0) {
            System.out.println("Bilangan ini adalah negatif.");
        } else {
            System.out.println("Bilangan ini adalah nol.");
        }

    }
}

