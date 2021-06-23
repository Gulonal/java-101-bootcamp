package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int km , age , yolTipi;
        double normalTutar, yenitutar=0,toplam=0,odenecektutar;
        Scanner pair = new Scanner(System.in);

        while(true){

            System.out.print("Lütfen yaşınızı giriniz : ");
            age = pair.nextInt();
            System.out.print("Lütfen kilometre cinsinden mesafe girişi yapınız : ");
            km = pair.nextInt();
            System.out.print("yolculuk Tipini giriniz: gidiş 1, gidiş dönüş 2: ");
            yolTipi = pair.nextInt();

            if(age > 0 && km > 0) {
                if (yolTipi>=1 && yolTipi<=2){
                    break;
                }else {
                    System.out.println("Tekrar giriş yapınız hatalı veriler giriş yaptınız");
                }
            }
            else {
                System.out.println("Tekrar giriş yapınız hatalı veriler giriş yaptınız");
            }
        }
        normalTutar= km*0.10;
        if(age>0) {
            if (age < 12) {
                yenitutar = normalTutar * 0.5;
                if (yolTipi == 2) {
                    toplam = yenitutar * 0.2;
                    odenecektutar= normalTutar - (yenitutar+toplam);
                    System.out.println("Normal indirimsiz fiyat: " + normalTutar);
                    System.out.println("yaş indirimi: " + yenitutar);
                    System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
                    System.out.println("toplam ödenecek tutar: " + odenecektutar);
                } else {
                    odenecektutar= normalTutar - (yenitutar+toplam);
                    System.out.println("Normal indirimsiz fiyat: " + normalTutar);
                    System.out.println("yaş indirimi: " + yenitutar);
                    System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
                    System.out.println("toplam ödenecek tutar: " + odenecektutar);
                }
            }

            if (age >= 12 && age <= 24) {
                yenitutar = normalTutar * 0.1;
                if (yolTipi == 2) {
                    toplam = yenitutar * 0.2;
                    odenecektutar= normalTutar - (yenitutar+toplam);
                    System.out.println("Normal indirimsiz fiyat: " + normalTutar);
                    System.out.println("yaş indirimi: " + yenitutar);
                    System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
                    System.out.println("toplam ödenecek tutar: " + odenecektutar);


                } else {
                    odenecektutar= normalTutar - (yenitutar+toplam);
                    System.out.println("Normal indirimsiz fiyat: " + normalTutar);
                    System.out.println("yaş indirimi: " + yenitutar);
                    System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
                    System.out.println("toplam ödenecek tutar: " + odenecektutar);
                }
            }
            if (age >= 65) {
                yenitutar = normalTutar * 0.3;
                if (yolTipi == 2) {
                    toplam = yenitutar * 0.2;
                    odenecektutar= normalTutar - (yenitutar+toplam);
                    System.out.println("Normal indirimsiz fiyat: " + normalTutar);
                    System.out.println("yaş indirimi: " + yenitutar);
                    System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
                    System.out.println("toplam ödenecek tutar: " + odenecektutar);

                } else {
                    odenecektutar= normalTutar - (yenitutar+toplam);
                    System.out.println("Normal indirimsiz fiyat: " + normalTutar);
                    System.out.println("yaş indirimi: " + yenitutar);
                    System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
                    System.out.println("toplam ödenecek tutar: " + odenecektutar);
                }
            }
        } else {
            odenecektutar= normalTutar - (yenitutar+toplam);
            System.out.println("Normal indirimsiz fiyat: " + normalTutar);
            System.out.println("yaş indirimi: " + yenitutar);
            System.out.println("yol tipi gidiş dönüş indirimi: " + toplam);
            System.out.println("toplam ödenecek tutar: " + odenecektutar);
        }
    }
}

