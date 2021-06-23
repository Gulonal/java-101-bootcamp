package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

	    int year,sonuc;
	    Scanner zodyak = new Scanner(System.in);

	    System.out.print("Doğum yılınızı giriniz");
	    year = zodyak.nextInt();
	    sonuc= year % 12;
	    switch (sonuc){
            case 0 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : MAYMUN ");
            break;
            case 1 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : HOROZ ");
                break;
            case 2 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : KÖPEK ");
                break;
            case 3 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : DOMUZ ");
                break;
            case 4 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : FARE ");
                break;
            case 5 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : ÖKÜZ ");
                break;
            case 6 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : KAPLAN ");
                break;
            case 7 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : TAVŞAN ");
                break;
            case 8 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : EJDERHA ");
                break;
            case 9 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : YILAN ");
                break;
            case 10 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : AT ");
                break;
            case 11 :
                System.out.println("SİZİN ÇİN ZODYAĞINIZ : KOYUN ");
                break;

            default:
                System.out.println("yanlış giden bir durum var daha sonra tekrar deneyiniz ");
        }
    }
}
