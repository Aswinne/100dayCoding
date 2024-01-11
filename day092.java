import java.util.Scanner;

public class day092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan baris :");
        int kolom = sc.nextInt();
        System.out.print("masukkan kolom :");
        int baris = sc.nextInt();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("+--");
            }
            System.out.print("+");
            System.out.println();
            for (int k = 0; k < kolom; k++) {
                System.out.print("|  ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
