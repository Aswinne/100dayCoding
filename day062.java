import java.util.Scanner;

public class day062 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan jumlah baris :");
        int baris = a.nextInt();
        System.out.print("masukkan jumlah kolom :");
        int kolom = a.nextInt();
        int array[][]=new int[baris][kolom];
        System.out.print("masukkan elemen jumlah elemen array :");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                array[i][j]=a.nextInt();
                System.out.println("elemen array :");
                for (int k = 0; k < baris; k++) {
                    for (int l = 0; l < kolom; l++) {
                        System.out.print(array[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
