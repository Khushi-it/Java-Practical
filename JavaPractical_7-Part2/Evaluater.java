class Evaluater {

    // Iterative factorial
    static long s1(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }

        long r = 1;
        for (int i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

    // Recursive factorial
    static long s2(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * s2(n - 1);
    }

    public static void main(String[] args) {

        int noOfTimes = 50;
        int number = 15;  // number whose factorial we calculate

        long s1_time = 0, s2_time = 0, st, et;
        float s1_avg, s2_avg;

        //  s1 (iterative)
        for (int i = 0; i < noOfTimes; i++) {
            st = System.nanoTime();
            s1(number);
            et = System.nanoTime();
            s1_time += (et - st);
        }

        s1_avg = (float) s1_time / noOfTimes;

        // (recursive)
        for (int i = 0; i < noOfTimes; i++) {
            st = System.nanoTime();
            s2(number);
            et = System.nanoTime();
            s2_time += (et - st);
        }

        s2_avg = (float) s2_time / noOfTimes;

        System.out.println("Total s1 time: " + s1_time);
        System.out.println("Total s2 time: " + s2_time);
        System.out.println("Average s1 time: " + s1_avg);
        System.out.println("Average s2 time: " + s2_avg);
    }
}
