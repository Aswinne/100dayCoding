import java.util.Arrays;
import java.util.Scanner;

public class day055 {
    public static void main(String[] args) {
        int data [][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("masukkan angka ke- "+i+" "+j+":");
                data[i][j]=sc.nextInt();55
                
            }   
        }
        System.out.println("--------------");
                System.out.print(Arrays.deepToString(data));
        }
    }

