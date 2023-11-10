import java.util.Scanner;
public class day030 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        if (nilai >= 1 && nilai <= 50) {
            System.out.println("Nilai E");
        } else if (nilai > 50 && nilai <= 60) {
            System.out.println("Nilai C");
        } else if (nilai > 60 && nilai <= 80) {
            System.out.println("Nilai B");
        } else if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai A");
        } else {
            System.out.println("Nilai tidak VALID . masukkan nilai 1 sampai 100");
        }

        scanner.close();
    }
}

