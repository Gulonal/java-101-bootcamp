package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b,c;
	double u, alan; // u üçgenin çevresinin yarısı

	Scanner uzunluk = new Scanner(System.in);
	System.out.println("1.kenar uzunluğunu giriniz: ");
	a = uzunluk.nextInt();
	System.out.println("1.kenar uzunluğunu giriniz: ");
	b = uzunluk.nextInt();
	System.out.println("1.kenar uzunluğunu giriniz: ");
	c = uzunluk.nextInt();

	u = (a+b+c)/2; // alan hesabında kullanmak için çevrenin yarısı hesaplanır
	alan =Math.sqrt( u * (u - a) * (u - b) * (u - c)); // alan hesaplama işlemi sqrt kare kök alma işlemi yapar
	System.out.println ("girilen uzunluklara ait üçgenin çevresi: "+ 2*u);
    System.out.println ("girilen uzunluklara ait üçgenin alanı: "+ alan);
    }

}
