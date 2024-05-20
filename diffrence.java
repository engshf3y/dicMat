package dicMath;
import java.util.Scanner;

public class diffrence {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                boolean isUnique;
                String difference = "";

                // Read number & elements of elements in the first set
                System.out.println("Enter number of elements in the first set:");
                int m = input.nextInt();
                int[] set1 = new int[m];
                for (int i = 0; i < m; i++) {
                    System.out.println("Enter element " + (i + 1) + ":");
                    set1[i] = input.nextInt();
                }


                // Read number & elements of elements in the second set
                System.out.println("Enter number of elements in the second set:");
                int n = input.nextInt();
                int[] set2 = new int[n];

                // Read  of the second set
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter element " + (i + 1) + ":");
                    set2[i] = input.nextInt();
                }

                // Find the difference
                for (int i = 0; i < m; i++) {
                    isUnique = true;
                    for (int j = 0; j < n; j++) {
                        if (set1[i] == set2[j]) {
                            isUnique = false;
                            break;
                        }
                    }
                    if (isUnique) {
                        difference += set1[i] + " ";
                    }
                }

                // Print the difference
                System.out.println("Difference (first set - second set): " + difference.trim());
            }
        }





