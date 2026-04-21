public class PatternProblem {

    public static void printPatternIterative(int size) {

        int totalRows = 2 * size - 1;

        for (int i = 0; i < size; i++) {

            int row = 2 * i;
            int stars;

            if (row < size)
                stars = 2 * row + 1;
            else
                stars = 2 * (totalRows - row - 1) + 1;

            int spaces = (2 * size - 1 - stars) / 2;

            for (int j = 0; j < spaces; j++)
                System.out.print(" ");

            for (int j = 0; j < stars; j++)
                System.out.print("*");

            System.out.println();
        }
    }
// ===================================================

    public static void printPatternRecursive(int size) {

        int totalRows = 2 * size - 1;
        printRow(0, size, totalRows);
    }

    public static void printRow(int i, int size, int totalRows) {

        if (i == size)
            return;

        int row = 2 * i;
        int stars;

        if (row < size)
            stars = 2 * row + 1;
        else
            stars = 2 * (totalRows - row - 1) + 1;

        int spaces = (2 * size - 1 - stars) / 2;

        printSpaces(spaces);
        printStars(stars);

        System.out.println();

        printRow(i + 1, size, totalRows);
    }
    public static void printSpaces(int spaces) {

        if (spaces == 0)
            return;

        System.out.print(" ");
        printSpaces(spaces - 1);
    }
    public static void printStars(int stars) {

        if (stars == 0)
            return;

        System.out.print("*");
        printStars(stars - 1);
    }

    public static void main(String[] args) {

        int size = 5;

        System.out.println("Iterative Approach:");
        printPatternIterative(size);

        System.out.println("\nRecursive Approach:");
        printPatternRecursive(size);
    }
}