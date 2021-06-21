package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int r,a;
        double pi =3.14, alan,cevre, dairedilimialanı ;

        Scanner input = new Scanner(System.in);
        System.out.println("dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.println("dairenin merkez açısının ölçüsünü giriniz : ");
        a = input.nextInt();

        alan = 2*Math.pow(r,2); // mat kütüphanesi pow üst alma işlemi yapar dairenin alanı
        cevre = 2*pi*r; // dairenin çevresini bulma işlemi
        dairedilimialanı= (pi * r*r * a)/360; // daire diliminin çevresini bulma işlemi

        System.out.println("dairenin alanı :"+alan);
        System.out.println("dairenin çevresi : "+cevre);
        System.out.println("daire dilimi "+a+ " olan parçanın alanı: "+dairedilimialanı);
    }
}
