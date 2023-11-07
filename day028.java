import java.util.Scanner;

public class day028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan luas tanah nenek :");
        int tanah =sc.nextInt();

        System.out.print("masukkan panjang tanah yang dijual :");
        int panjang=sc.nextInt();
        System.out.print("masukkan lebar tanah yang dijual :");
        int lebar=sc.nextInt();
        System.out.print("jumlah luas seluruh tanah nenek :"+tanah/panjang*lebar);

    }
}
