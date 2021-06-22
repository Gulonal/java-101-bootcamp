package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String userName, password, password1;
	Scanner inp = new Scanner(System.in);

        int i=0, sifre;
        while(i<3) {

            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();

            System.out.print("şifrenizi giriniz");
            password = inp.nextLine();


            if (userName.equals("GÜL") && password.equals("ÖNAL")) {
                System.out.println("Hoş geldiniz");
                break;
            } else {
                System.out.print("Yanlış şifre veya kullanıcı ismi girdiniz: \n");
                i++;
            }
        }// bu döngü doğru ise şifre direk çıkıyor yanlış ise 3 deneme hakkı veriyor
            System.out.print("üç deneme yaptınız şifrenizi sıfırlamak için 1 tuşuna basınız:");
            sifre= inp.nextInt();
            if (sifre==1) {
                 System.out.print("şifreniz ve kullanıcı adınız sıfırlandı:");
            }


        while(true) {

            System.out.println("Yeni şifrenizi giriniz");
            password1=inp.nextLine();


            if (password1.equals("ÖNAL")) {
                System.out.println("şifre oluşturulamadı tekrar giriniz:");

            }
                else {
                    System.out.println("şifre başarıyla oluşturuldu:");
                break;
                }

            }// bu döngü yeni şifreyi istiyor yanlış ise tekrar girilmesini istiyor.
    }

}
