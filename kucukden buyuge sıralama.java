package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner number = new Scanner(System.in);
        System.out.print("sıralanması istenen 1.sayıyı giriniz lütfen: ");
        sayi1 =number.nextInt();

        System.out.print("sıralanması istenen 2.sayıyı giriniz lütfen: ");
        sayi2 = number.nextInt();

        System.out.print("sıralanması istenen 3.sayıyı giriniz lütfen: ");
        sayi3 = number.nextInt();

        if(sayi1<sayi2 && sayi1<sayi3){
             if (sayi2<sayi3) {
                 System.out.print( sayi1+" < "+sayi2+" < "+sayi3);
             }
        }
             if(sayi3<sayi2 && sayi3<sayi1){
                 if(sayi2<sayi1){
                     System.out.print( sayi3+" < "+sayi2+" < "+sayi1);
                 }
             }
            if(sayi2<sayi1 && sayi2<sayi3){
                if(sayi1<sayi3){
                    System.out.print( sayi2+" < "+sayi1+" < "+sayi3);
                }
            }
            if(sayi3<sayi2 && sayi3<sayi1){
                if(sayi1<sayi2){
                    System.out.print( sayi3+" < "+sayi1+" < "+sayi2);
                }
            }
            if(sayi1<sayi2 && sayi1<sayi3){
                if(sayi3<sayi2){
                    System.out.print( sayi1+" < "+sayi3+" < "+sayi2);
                }
            }
            if(sayi2<sayi1 && sayi2<sayi3){
                if(sayi3<sayi1){
                    System.out.print( sayi2+" < "+sayi3+" < "+sayi1);
                }
            }
            if(sayi1==sayi2 && sayi2==sayi3){
                System.out.print( sayi2+" = "+sayi3+" = "+sayi1+" sayıların üçüde birbirine eşit:");
            }
    }
}
