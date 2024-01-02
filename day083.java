import java.util.Scanner;

public class day083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai a:");
        int nilaia = sc.nextInt();
        System.out.print("masukkan nilai b:");
        int nilaib = sc.nextInt();
        int nilai = nilaia+nilaib;
        if (nilai % 2 == 0){
            int a = nilai + 1;
            System.out.println("hasil penjumlahan Genap :"+a);
        }else{
            int b = nilai + 2;
            System.out.println("hasil penjumlahan ganjil"+b);
        }
    }
}

