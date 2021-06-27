package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dizi boyutu giriniz: ");
        int n= input.nextInt();

        int[] dizi = new int[10];
        for(int i=0; i<n; i++) {
            Random rastgele = new Random();
            int sayi = rastgele.nextInt();
            dizi[i] = sayi;
        }


        for(int m=0; m<n; m++) {
            int t=0;
            t=m+1;

            System.out.println("\ndizinin "+t+".değeri: "+dizi[m] );
        }
        for(int k=1; k<10; k++) {
            int gecici;
            for(int j=0; j<10-k; j++) {
                if(dizi[j] > dizi[j]) {
                    gecici = dizi[j];
                    dizi[j] = dizi[j];
                    dizi[j+1] = gecici;
                }
            }
        }
        System.out.print("dizinin sıralanmış hali: ");
        for(int g=0; g<n; g++) {

            System.out.print(" // "+dizi[g] );
        }
    }
}
