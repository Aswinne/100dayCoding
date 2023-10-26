import java.util.Scanner;

public class day016 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai = input.nextInt();
        int angka = input.nextInt();
        for (int i = 0; i < nilai; i++) {
            for (int j = 0; j < angka; j++) {
                System.out.print("--+");
            }
            System.out.println();
            
        }
        
    }
    
}