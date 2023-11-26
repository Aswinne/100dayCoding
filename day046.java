import java.util.Scanner;

public class day046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai :");
        int nilai = sc.nextInt();
        
        if(nilai >= 70 && nilai <= 100 && nilai % 2==0){
            System.out.println("pajak 5%");
        }else if (nilai >= 100 && nilai <= 120 && nilai % 2==0){
            System.out.println("pajak 10%");
        }else{
            System.err.println("tidak dikenakan pajak");
        }
    }
}
