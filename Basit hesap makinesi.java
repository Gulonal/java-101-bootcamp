package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Sayı:");
        int s1 = scanner.nextInt();

        System.out.println("2.Sayı:");
        int s2 = scanner.nextInt();

        System.out.println("İşlem Menüsü\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n"); //işlem bilgilendirme satırı

        int islem;
        while(true){

            System.out.println("Lütfen İşlem Seçiniz (1-4) :");
            islem = scanner.nextInt();

            if(islem > 0 && islem < 5) {
                System.out.println("Lütfen 1 ile 4 arasında bir sayı giriniz");
                break;

            }
        } // işlem aralığı belirtir kontrol eder var olan işlemleri tercih ettirir.

        switch (islem ){
            case 1:
                System.out.println(s1 + " + " + s2 + " = " + (s1+s2));
                break;

            case 2:

                System.out.println(s1 + " - " + s2 + " = " + (s1-s2));
                break;

            case 3:

                System.out.println(s1 + " * " + s2 + " = " + (s1*s2));
                break;

            case 4:

                System.out.println(s1 + " / " + s2 + " = " + ((float)s1/(float)s2));
                break;

        }
    }
}
