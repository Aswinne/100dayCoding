public class day021 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 0 || i == 10) {
                System.out.println("\u001B[30m" + i);
            } else {
                System.out.println("\u001B[33m" + i);
            }
        }
    }
}