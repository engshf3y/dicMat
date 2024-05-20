package dicMath;
import java.util.Scanner;
public class Symmetric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read number of rows and columns
        System.out.println("Enter number of rows or columns:");
        int n = input.nextInt();
        int[][] r = new int[n][n];

        // Read relation values in form of matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value of row= " + (i + 1) + " column= " + (j + 1) + ":");
                r[i][j] = input.nextInt();
            }
        }

        // Check if relation is symmetric
        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r[i][j] != r[j][i]) {
                    // Opposite elements not equal
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) break;
        }

        if (symmetric) {
            System.out.println("Relation is symmetric");
        } else {
            System.out.println("Relation is not symmetric");
        }
    }
}
