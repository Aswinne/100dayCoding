public class day061{
    public static void main(String[] args) {
        //deklarasi array 2 dimensi
        String [][]huruf={
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","i"}
        };
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(huruf[i][j]+" ");
            }
            System.out.println();
        }
    }
}