package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam=0;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for(int i =1 ; i<=n/2;i++){
            if(n%i==0){
                toplam=toplam+i;
            }
        }
        if(n==toplam){
            System.out.println(n+" Sayı mükemmel bir sayıdır : ");
        }
        else {
            System.out.println(n+" Sayı mükemmel bir sayıdeğildir malesef : ");
        }
    }
}
