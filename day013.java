import java.util.Scanner;

public class day013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka yang di inginkan :");
        
        int nilai = input.nextInt();
        
        for (int i = 0; i < nilai; i++) {
            System.out.println(1-i);
        }
        

    }
}
