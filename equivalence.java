package dicMath;
import java.util.Scanner;

public class equivalence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns :");
        int n=input.nextInt();
        int r1[][]=new int [n][n];

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.println("Enter the element in the row number "+(r+1)+" and the column number "+(c+1));
                r1[r][c]=input.nextInt();
            }
        }

        System.out.println("The relation is :");
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.print(r1[r][c]+" ");
            }
            System.out.println("");
        }

        boolean ref=true;
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(r==c && r1[r][c]!=1){
                    ref=false;
                    break;
                }
            }
            if (!ref)
                break;
        }

        boolean sym=true;
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(r1[r][c]!=r1[c][r]){
                    sym=false;
                    break;
                }
            }
            if (!sym)
                break;
        }

        boolean tran=true;
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if (r1[r][c]==1){
                    for(int k=0;k<n;k++){
                        if (r1[c][k]==1 && r1[r][k]!=1){
                            tran=false;
                            break;
                        }
                    }
                }

            }
            if(!tran)
                break;
        }
        if(ref&&sym&&tran==true)
            System.out.println("The relation is equivalence.");
        else
            System.out.println("The relation is not equivalence.");

    }
}

