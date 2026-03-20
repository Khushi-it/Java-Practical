public class sy2024bit007 {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3(5);
        pattern4();
        pattern5();
        pattern6();
    }

    static void pattern1() {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == 5))
                    System.out.print("* ");
                else if (i > 1)
                    System.out.print("* ");
                else
                    System.out.print("+ ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2() {
        System.out.println("Pattern 2:");
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
         System.out.println("Pattern 3:");

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 9; j++) {

                if((i == 1 && j == 5) ||
                   (i == 2 && (j == 1 || j == 9)) ||
                   (i == 3 && j == 5)) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("Pattern 4:");
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5() {
        System.out.println("Pattern 5:");
        int num = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6() {
        System.out.println("Pattern 6:");
        System.out.println("  1");
        System.out.println(" 2 3");
        System.out.println("3 4 5");
        System.out.println(" 2 3");
        System.out.println("  1");
    }
}
