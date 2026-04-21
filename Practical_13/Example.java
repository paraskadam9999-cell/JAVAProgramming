public class Example {

    static int charCount1(char ch, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
        }
        return count;
    }

    static int charCount2(char ch, String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }

    static int charCount3(char ch, String s) {
        String removed = s.replace(String.valueOf(ch), "");
        return s.length() - removed.length();
    }

    static int charCount4(char ch, String s, int index) {
        if (index == s.length()) return 0;
        return (s.charAt(index) == ch ? 1 : 0) + charCount4(ch, s, index + 1);
    }

    public static void main(String[] args) {

        if (args.length > 2) {
            System.out.println("Warning: " + (args.length - 2) +
                " excess argument(s) passed. Only first two will be used.");
        }

        if (args.length < 2) {
            System.out.println("Error: Two arguments required.");
            System.out.println("Usage: java Example 'a' 'hello world'");
            return;
        }

        String firstArg  = args[0];
        String secondArg = args[1];

        if (firstArg.length() > 1) {
            System.out.println("Warning: First argument '" + firstArg +
                "' has more than one character.");
            System.out.println("Only the first character '" +
                firstArg.charAt(0) + "' will be used.");
        }

     
        if (firstArg.isEmpty()) {
            System.out.println("Error: First argument cannot be empty. It must be a character.");
            return;
        }

        char ch     = firstArg.charAt(0);
        String str  = secondArg;

        System.out.println("\nSearching for character : '" + ch + "'");
        System.out.println("In string               : \"" + str + "\"");
        System.out.println("------------------------------------------");
        System.out.println("Approach 1 (index loop) : " + charCount1(ch, str));
        System.out.println("Approach 2 (for-each)   : " + charCount2(ch, str));
        System.out.println("Approach 3 (replace)    : " + charCount3(ch, str));
        System.out.println("Approach 4 (recursive)  : " + charCount4(ch, str, 0));
    }
}