package dicMath;

import java.util.Scanner;

public class inverse {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number of rows  :");
        int r=s.nextInt();
        System.out.println("Enter the number of columns :");
        int c=s.nextInt();
        int r1[][]=new int[r][c];
        int inverse[][]=new int [c][r];



        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c;k++)
            {
                System.out.println("Enter the element in the row number "+(i+1)+" and the column number "+(k+1));
                r1[i][k]=s.nextInt();
            }
        }

        for(int k=0;k<c;k++)
        {
            for(int i=0;i<r;i++)
            {
                inverse[k][i]=r1[i][k];
            }
        }


        System.out.println("The inverse of the matrix is : ");
        for (int k=0;k<c;k++)
        {
            for(int i=0;i<r;i++)
            {
                System.out.print(" "+inverse[k][i]+" ");
            }
            System.out.println(" ");
        }

    }
}

