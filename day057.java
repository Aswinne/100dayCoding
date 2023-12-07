import java.util.Scanner;

public class day057 {
    public static void main(String[] args) {
        int [][] data = new int[2][2];
        Scanner dc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("masukkan angka ke- "+i+" "+j+":");
                data[i][j]=dc.nextInt();
            }
            
        }
    }
}

