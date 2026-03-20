class PerformanceEvaluater2 {

     static int s1(String s1, String s2) {

        if (s1.length() < s2.length())
            return 0;

        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }

        return count;
}

     static int s2(String s1, String s2) {

        if (s1.length() < s2.length())
            return 0;

        if (s1.startsWith(s2))
            return 1 + countRec(s1.substring(s2.length()), s2);
        else
            return countRec(s1.substring(1), s2);
    }


    public static void main(String[] args) {

        int noOfTimes = 50;
        long s1_time = 0, s2_time = 0, st, et;
        float s1_avg, s2_avg;

        // Measure s1 time
        for (int i = 0; i < noOfTimes; i++) {
            st = System.currentTimeMillis();
            s1();
            et = System.currentTimeMillis();
            s1_time += (et - st);
        }

        s1_avg = (float) s1_time / noOfTimes;

        // Measure s2 time
        for (int i = 0; i < noOfTimes; i++) {
            st = System.currentTimeMillis();
            s2();
            et = System.currentTimeMillis();
            s2_time += (et - st);
        }

        s2_avg = (float) s2_time / noOfTimes;

        System.out.println("\nTotal s1 time: " + s1_time);
        System.out.println("Total s2 time: " + s2_time);
        System.out.println("Average s1 time: " + s1_avg);
        System.out.println("Average s2 time: " + s2_avg);
    }
}
