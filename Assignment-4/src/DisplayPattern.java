public class DisplayPattern {
    public static void main(String[] args) {
        for (int i = 10; i >= 5; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 6; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int j = 0; j < 9; j++) {
            System.out.print('*');
        }
        System.out.println();
    }
}
