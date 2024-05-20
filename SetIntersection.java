package dicMath;

import java.util.Scanner;

public class SetIntersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String intersection = "";

        // Read number of elements in the first set
        System.out.println("Enter number of elements in first set:");
        int m = input.nextInt();
        int[] s1 = new int[m];

        // Read elements of the first set
        for (int i = 0; i < m; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            s1[i] = input.nextInt();
        }

        // Read number of elements in the second set
        System.out.println("Enter number of elements in second set:");
        int n = input.nextInt();
        int[] s2 = new int[n];

        // Read elements of the second set
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            s2[i] = input.nextInt();
        }

        // Find the intersection (elements in both sets)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s1[i] == s2[j]) {
                    intersection += s1[i] + " ";
                    break;
                }
            }
        }

        // Print the intersection
        System.out.println("The Intersection is: " + intersection);
    }
}