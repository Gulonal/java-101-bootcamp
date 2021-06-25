package com.company;
import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        int  number;
        Scanner palidrom =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number= palidrom.nextInt();

        System.out.println(number+" Bu sayı palidrom "+isPalindrom(number));

    }
}
