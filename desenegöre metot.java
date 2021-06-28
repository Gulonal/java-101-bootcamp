package com.company;
import java.util.Scanner;
public class Main {
    public static void Desen(int sayi, int temp, boolean status) {

        if (sayi <= temp) {
            System.out.println(sayi);
            if (sayi > 0 && !status) {
                Desen(sayi-5,temp,false);
            }else{
                Desen(sayi+5,temp,true);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = sc.nextInt();
        int temp = sayi;
        Desen(sayi,temp,false);
	
    }
}
