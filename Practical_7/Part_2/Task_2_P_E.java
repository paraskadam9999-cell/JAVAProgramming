class Task_2_P_E {

    static int countUsingIndexOf(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    static int recIndexOf(String str, String sub, int index) {
        int pos = str.indexOf(sub, index);
        if (pos == -1)
            return 0;
        return 1 + recIndexOf(str, sub, pos + sub.length());
    }

    public static void main(String[] args) {

        String s1 = args[0];
        String s2 = args[1];
        int noOfTimes = Integer.parseInt(args[2]);

        long it_tt = 0, rec_tt = 0;
        long st, et;
        int ans1 = 0, ans2 = 0;
        float it_avg, rec_avg;

        // Iteration
        for (int i = 0; i < noOfTimes; i++) {
            st = System.nanoTime();
            ans1 = countUsingIndexOf(s1, s2);
            et = System.nanoTime();
            it_tt += (et - st);
        }
        it_avg = (float) it_tt / noOfTimes;

        // Recursion
        for (int i = 0; i < noOfTimes; i++) {
            st = System.nanoTime();

            ans2 = recIndexOf(s1, s2, 0);
            et = System.nanoTime();
            rec_tt += (et - st);
        }
        rec_avg = (float) rec_tt / noOfTimes;

        System.out.println("Iteration Count: " + ans1);
        System.out.println("Recursion Count: " + ans2);

        System.out.println("Iterative Avg Time: " + it_avg + " ns");
        System.out.println("Recursive Avg Time: " + rec_avg + " ns");
    }
}