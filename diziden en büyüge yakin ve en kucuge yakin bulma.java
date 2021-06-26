package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gecici;
        int [] dizi = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        System.out.println("\nDizinin küçüğe en yakın elemanını : " + dizi[1]);
        System.out.println("Dizinin büyüğe en yakın elemanını : " + dizi[8]);
    }
}
