import java.util.Scanner;

public class day038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai :");
        int nilai = input.nextInt();
        if(nilai % 2 == 0){
            int angka = nilai+2;
            System.out.println("hasil :"+angka);
        }else{
            int angka = nilai+1;
            System.out.println("hasil :"+angka);
        }
    }
    
}
