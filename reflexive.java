package dicMath;

import java.util.Scanner;

public class reflexive {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns :");
        int n=input.nextInt();
        int [][]r1=new int[n][n];
        boolean ref=true;
        boolean irref=true;

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.println("Enter the element in the row number : "+(r+1)+" and column number : "+(c+1));
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
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(r==c && r1[r][c]!=0){
                    irref=false;break;
                }
            }
            if (!irref)
                break;
        }

        if(ref==true && irref==false)
            System.out.println("The relation is reflexive.");
        else if(irref==true && ref==false)
            System.out.println("The relation is irreflexive.");
        else
            System.out.println("The relation is neither reflexive nor irreflexive.");
    }
}

