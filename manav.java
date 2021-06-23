package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double armutkg =2.14,elmakg=3.67,domates=1.11,muzkg=0.95,patlıcankg=5.00;
        double akg,ekg,dkg,mkg,pkg,toplam; //girilen ürün kiloları

        Scanner ing = new Scanner (System.in);

        System.out.print("Armut kaç kilo ? : ");
        akg = ing.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        ekg = ing.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        dkg = ing.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        mkg = ing.nextDouble();

        System.out.print("patlıcan kaç kilo ? : ");
        pkg = ing.nextDouble();

        toplam = (armutkg*akg) +(elmakg*ekg) +(domates*dkg)+(muzkg*mkg)+(patlıcankg*pkg); //toplam ürün fiyat hesaplaması
        System.out.println("Toplam ödenecek tutar : " +toplam);

    }
}
