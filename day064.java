import java.util.Scanner;  

public class day064   { 
    
    public static void main(String[] args)   {  
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("masukkan jumlah elemen: ");  
        n=sc.nextInt();  
   
        int[] array = new int[10];  
        System.out.println("masukkan emlemen array: ");  
        for(int i=0; i<n; i++)  {  
   
            array[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        for (int i=0; i<n; i++)   {  
            System.out.println(array[i]);  
        }  
    }  
}