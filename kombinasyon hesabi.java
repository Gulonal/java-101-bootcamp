package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //kombinasyon formülü=C(n,r) = n! / (r! * (n-r)!)
        // faktöriyel formülü = 1*2*3*...*(n)
        
        int n,r,sonucn=1,sonucr=1,sonucnr=1,kombinasyon;
        Scanner input = new Scanner(System.in);
        
        System.out.print("kombinasyon için ilk sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Kombinasyon için ikinci sayı giriniz: ");
        r = input.nextInt();

        for(int i=1;i<=n;i++){
            sonucn= sonucn*i; // ilk sayının faktöriyel hesabı
        }
        for(int j=1;j<=r;j++){
            sonucr= sonucr*j; // ikinci sayının faktöriyel hesabı
        }
        for(int z=1;z<=(n-r);z++){
            sonucnr= sonucnr*z; // ilk sayı - ikinci sayının faktöriyel hesabı
        }
        kombinasyon = sonucn /(sonucr*sonucnr); // kombinasyon formülü

        System.out.println(n+" faktöriyeli: "+sonucn);
        System.out.println(r+" faktoriyeli: "+sonucr);
        System.out.println("c("+n+","+r+") : Kombinasyon değeri: " +kombinasyon);

    }
}
