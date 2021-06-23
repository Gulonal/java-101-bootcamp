package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double tutar, kdvOranı, kdvTutar, kdvliTutar ;

        Scanner input=new Scanner(System.in);
        System.out.print("ücret tutarınızı giriniz: ");
        tutar = input.nextDouble();
        kdvOranı = tutar <= 1000 ? 0.18 : 0.08 ; // if else satırı yerine ? işareti operatörü kullanılmıştır.
        /*if(tutar<=1000){  kdvOranı= 0.18; }
        else{ kdvOranı= 0.08; }*/

        kdvTutar= tutar*kdvOranı; //kdv hesaplama işlemi
        kdvliTutar= tutar + kdvTutar; // kdv'yi ekleme işlemi

        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV' oranı: "+kdvOranı);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.println("KDVli tutar: "+kdvliTutar);
    }
}
