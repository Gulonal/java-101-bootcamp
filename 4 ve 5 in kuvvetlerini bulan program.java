package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        int number,sonuc=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        number = input.nextInt();

        for(int i=1; i<=number;i++){
            sonuc= (int)Math.pow (5,i);
            System.out.println("5 in kuvvetleri sırasıyla : "+sonuc);
        }
        for(int j =1; j<=number;j++){
            sonuc= (int)Math.pow (4,j);
            System.out.println("4 in kuvvetleri sırasıyla : "+sonuc);
        }
    }
}
