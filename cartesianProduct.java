package dicMath;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cartesianProduct {
    public static void main(String[] args) {

        // define set 1 (size & elemnents)
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size For Array A ");
        int size_set1 = s.nextInt();
        int[] arr1 = new int[size_set1];
        System.out.println("Enter Elements For Array A ");
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = s.nextInt();
        }

        // define set 2 (size & elemnents)
        System.out.print("Enter Size For Array B ");
        int seize_set2=s.nextInt();
        int [] arr2=new int[seize_set2];
        System.out.println("Enter Elements For Array B ");
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i]=s.nextInt();
        }
        System.out.println("The cartesian product between sets is");
        for (int i = 0; i < size_set1; i++)
        {
            for (int j = 0; j < seize_set2 ; j++)
            {
                System.out.println("{"+"("+arr1[i]+","+arr2[j]+")"+"}");
            }
        }
    }
}