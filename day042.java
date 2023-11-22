import java.util.Scanner;

public class day042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan bb :");
        int bb = sc.nextInt();
        System.out.println("masukkan tb :");
        double tb = sc.nextDouble();

        double body_ideal = tb/(bb*bb);
        System.out.println("habil body yang ideal adalah :"+body_ideal);
    }
}
