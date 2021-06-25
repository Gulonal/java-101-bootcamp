package com.company;
import java.util.Scanner;
public class Main {

    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner fibona =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = fibona.nextInt();
        for(int i=1; i<=n;i++)

        System.out.println(fibo(i));

    }
}
