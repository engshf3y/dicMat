package dicMath;

import java.util.Scanner;

public class symmetricDiffrence {
    public static void main(String[] args) {
        String syDiff="";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size For Set A ");
        int size_A = s.nextInt();
        int[] setA = new int[size_A];
        for (int i = 0 ; i< size_A ; i++) {
            System.out.println("Enter Elements For Set A " + (i+1));
            setA[i] = s.nextInt();
        }

        System.out.print("Enter Size For set B ");
        int size_B = s.nextInt();
        int[] arr2 = new int[size_B];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter Elements For set B " + (i+1));
            arr2[i] = s.nextInt();
        }
        for (int k : setA) {
            boolean isUni = true;
            for (int i : arr2) {
                if (k == i) {
                    isUni = false;
                    break;
                }

            }
            if (isUni)
                syDiff += k + "," + " ";
        }
        for (int k : arr2) {
            boolean isUni = true;
            for (int i : setA) {
                if (k == i) {
                    isUni = false;
                    break;
                }
            }
            if (isUni)
                syDiff += "," + " " + k;
        }
        System.out.println("Symmetric Difference = "+"{"+syDiff+"}");
    }
}
