class Task_2{

    static int countUsingIndexOf(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;		
    }

    static int countUsingSubstring(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        return count;
    }

    static int countUsingCharCheck(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                count++;
            }
        }
        return count;
    }

    static int recIndexOf(String str, String sub, int index) {
        int pos = str.indexOf(sub, index);
        if (pos == -1)
            return 0;
        return 1 + recIndexOf(str, sub, pos + sub.length());
    }

    static int recSubstring(String str, String sub) {
        if (str.length() < sub.length())
            return 0;

        if (str.substring(0, sub.length()).equals(sub))
            return 1 + recSubstring(str.substring(sub.length()), sub);
        else
            return recSubstring(str.substring(1), sub);
    }

    static int recCharCheck(String str, String sub, int i) {
        if (i > str.length() - sub.length())
            return 0;

        int j = 0;
        while (j < sub.length() && str.charAt(i + j) == sub.charAt(j)) {
            j++;
        }

        if (j == sub.length())
            return 1 + recCharCheck(str, sub, i + sub.length());
        else
            return recCharCheck(str, sub, i + 1);
    }

    public static void main(String[] args) {
        String s1 = "SGGSIE&TSGGS";
        String s2 = "SGGS";

        System.out.println(countUsingIndexOf(s1, s2));
        System.out.println(countUsingSubstring(s1, s2));
        System.out.println(countUsingCharCheck(s1, s2));
        System.out.println(recIndexOf(s1, s2, 0));
        System.out.println(recSubstring(s1, s2));
        System.out.println(recCharCheck(s1, s2, 0));
    }
}