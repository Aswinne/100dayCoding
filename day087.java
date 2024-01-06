import java.util.Scanner;

public class day087 {
    public static void main(String[] args) {
        String hewan[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hewan.length; i++) {
            System.out.print("hewan ke-"+i+":");
            hewan[i] = sc.nextLine();
        }
        for (String hewani : hewan) {
            System.out.println("hewan : "+hewani);
            
        }
    }
}