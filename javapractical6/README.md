public class DiamondPattern {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Logic 1:");
        // Logic 1
        for (int i = 1; i <= n; i++) {
            int space = Math.abs(3 - i);

            for (int j = 1; j <= space; j++)
                System.out.print(" ");

            System.out.print("*");

            if (i != 1 && i != n) {
                for (int j = 1; j <= (n - 2 * space - 2); j++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nLogic 2:");
        // Logic 2
        int mid = n / 2;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                if (r + c == mid || r + c == 3 * mid || r - c == mid || c - r == mid)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\nLogic 3:");
        // Logic 3
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                if (Math.abs(mid - r) + Math.abs(mid - c) == mid)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
