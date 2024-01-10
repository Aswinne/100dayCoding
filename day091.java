public class day091 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        numbers[2][0] = 5;
        numbers[2][1] = 6;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        String[][][] names = new String[3][2][2];
        names[0][0][0] = "Lili";
        names[0][0][1] = "08111";
        names[0][1][0] = "Lala";
        names[0][1][1] = "08122";
        names[1][0][0] = "Maya";
        names[1][0][1] = "08133";

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                for (int k = 0; k < names[i][j].length; k++) {
                    System.out.print(names[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
