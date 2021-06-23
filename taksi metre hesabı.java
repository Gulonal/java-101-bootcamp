package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int km;
	double perKm = 2.20, total, startPrice=10 ;

	Scanner input = new Scanner(System.in);
	System.out.println("Mesafeyi km cinsinden giriniz:");
	km = input.nextInt();

	total = km * perKm; //kilometre boyunca nekadar ücret olduğunu hesaplar
	total=total+startPrice; // hesaplanan ücrete başlangıç parası eklenir

	total = (total<20)? 20 : total; // minimum fiyat belirleme işlemi
	System.out.println("toplam ücret"+total);
    }
}
