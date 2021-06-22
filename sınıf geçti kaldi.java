package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int mat, fizik, kimya, turkce,muzik,toplam=0,sayac=0;

        Scanner ing = new Scanner (System.in);
        System.out.print("Matematik des notunu giriniz : ");
        mat = ing.nextInt();

        System.out.print("Fizik des notunu giriniz : ");
        fizik = ing.nextInt();

        System.out.print("Kimya des notunu giriniz : ");
        kimya = ing.nextInt();

        System.out.print("Turkce des notunu giriniz : ");
        turkce = ing.nextInt();

        System.out.print("Müzik des notunu giriniz : ");
        muzik = ing.nextInt();

        if(mat >= 0 && mat <= 100){
            toplam += mat;
            sayac++;
        }
        if(fizik >= 0 && fizik <= 100){
            toplam += fizik;
            sayac++;
        }
        if(turkce >= 0 && turkce <= 100){
            toplam += turkce;
            sayac++;
        }
        if(kimya >= 0 && kimya <= 100){
            toplam += kimya;
            sayac++;
        }
        if(muzik >= 0 && muzik <= 100){
            toplam += muzik;
            sayac++;
        }
        if(toplam/sayac>=55){
            System.out.println("SINIFI BAŞARIYLA GEÇTİNİZ TEBRİKLER");
        }
        else {
            System.out.println("sınıfı geçemediniz && sınıf tekrarı");
        }
    }
}
