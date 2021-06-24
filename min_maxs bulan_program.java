package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kaç aden sayı girmeyi düşünmektesiniz : ");
        int sayi = input.nextInt();
        int n,maks=0,min=0;

        for(int i=1; i<=sayi;i++){
            System.out.print(i+". sayıyı giriniz lütfen : ");
            n = input.nextInt();
            if (i==1)
            {
                maks= n;
                min= n;
            }

            if (n>maks) {
                maks = n;
            }

            if (n<min) {
                min = n;
            }
        }
        System.out.println(" En büyük olan sayı : "+maks);
        System.out.println(" En küçük olan sayı : "+min);
	
    }
}
