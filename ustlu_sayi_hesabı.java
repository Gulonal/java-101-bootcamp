package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ust,number, islem=1;
        Scanner input = new Scanner(System.in);

        System.out.print("işlem yapmak isteiğiniz sayıyı giriniz: ");
         number= input.nextInt();

        System.out.print("üst sayıyı giriniz: ");
         ust = input.nextInt();
         for(int i=1;i<=ust;i++){
             islem=islem*number;
         }
        System.out.println(number+" ^ "+ust+" = "+islem);
    }
}
