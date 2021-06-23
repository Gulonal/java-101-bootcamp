package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int number,ortalama, sayac=0,toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for(int i= 0; i<=number; i++){
            if(i % 3==0 && i % 4==0){
                toplam+= i;
                sayac++;

            }
        }
        ortalama=toplam/sayac;
        System.out.println(number+" giridiğiniz sayı içerisinde 3 ve 4 de bölüne bilen sayıların ortalaması: "+ortalama);

    }
}
