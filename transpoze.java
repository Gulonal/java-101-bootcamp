package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int r1,c1;
        Scanner inp = new Scanner(System.in);
        System.out.print(" matris satırını giriniz: ");
        r1 = inp.nextInt();
        c1 = inp.nextInt();
        int a[][] = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=inp.nextInt();
            }
        }
        int b[][] = new int[c1][r1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<c1;i++)
        {
            for(int j=0;j<r1;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

    }
}
