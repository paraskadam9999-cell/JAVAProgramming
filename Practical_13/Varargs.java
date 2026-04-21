public class Varargs {

    static void printAll(String... words) {
        System.out.println("printAll called with " + words.length + " argument(s):");
        for (String w : words) {
            System.out.println("  " + w);
        }
    }

    static int add(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    static void fun(String... s) {
        System.out.println("fun(String...) called");
    }
    static void fun(int... i) {
        System.out.println("fun(int...) called");
    }
    // fun();       AMBIGUOUS: compiler cannot decide which to call
    // fun("hi");   OK: calls fun(String...)
    // fun(1);      OK: calls fun(int...)


    static void correctPosition(String label, int... values) {
        System.out.print("correctPosition | " + label + " -> ");
        for (int v : values) System.out.print(v + " ");
        System.out.println();
    }

    static void wideningVarargs(int fixed, float... values) {
        System.out.print("wideningVarargs | fixed=" + fixed + " | floats: ");
        for (float f : values) System.out.print(f + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("===== 2.1 Basic varargs =====");
        printAll();                          // zero args
        printAll("apple");                   // one arg
        printAll("apple", "mango", "guava"); // many args

        System.out.println("\n===== 2.2 Benefit: flexible add =====");
        System.out.println("add()        = " + add());
        System.out.println("add(5)       = " + add(5));
        System.out.println("add(1,2,3)   = " + add(1, 2, 3));
        System.out.println("add(1,2,3,4) = " + add(1, 2, 3, 4));

        System.out.println("\n===== 2.3 Ambiguity 1: overloaded varargs =====");
        fun("hello");   // unambiguous — String
        fun(42);        // unambiguous — int
        // fun();       // AMBIGUOUS — would not compile

        System.out.println("\n===== 2.3 Ambiguity 2: multiple varargs =====");
        System.out.println("void multiVarargs(int... a, String... b) -> COMPILE ERROR");
        System.out.println("Java does not allow more than one vararg parameter.");

        System.out.println("\n===== 2.3 Ambiguity 3: vararg position =====");
        correctPosition("scores", 10, 20, 30);
        correctPosition("empty");
        System.out.println("void wrongPosition(int... v, String label) -> COMPILE ERROR");

        System.out.println("\n===== 2.3 Ambiguity 4: widening into varargs =====");
        wideningVarargs(99, 1, 2, 3);       // ints widen to float automatically
        wideningVarargs(99, 1.5f, 2.5f);    // direct float args
        System.out.println("void fun(float... f, int i) -> COMPILE ERROR (vararg not last)");
    }
}