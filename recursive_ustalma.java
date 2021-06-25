package com.company;
import java.util.Scanner;
public class Main {

    public static int pow(int exp, int ust) {
        if (ust == 0) {
            return 1;
        } else if (exp == 1) {
            return 1;
        } else {
            return exp * pow(exp, ust - 1);
        }
    }
    public static void main(String[] args) {
        Scanner pow = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz: ");
        int exp = pow.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        int ust = pow.nextInt();

        System.out.println("Sonuç = " + pow(exp, ust));
    }
}
