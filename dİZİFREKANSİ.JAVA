package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int G[] = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi : " + Arrays.toString(G));
        System.out.println("Tekrar Sayıları");

        int count = 0;
        Arrays.sort(G);

        for (int i = 0; i < G.length; i++) {
            count = 0;
            for (int j = 0; j < G.length; j++) {
                if (G[i] == G[j]) {
                    count++;
                }
            }
            if (i == 0 && G[i + 1] != G[i]) {
                System.out.println(G[i] + " sayısı " + count + " kere tekrar edildi");
            }
            if (i != 0 && G[i - 1] != G[i]) {
                System.out.println(G[i] + " sayısı " + count + " kere tekrar edildi");
            }
            if (i == 0 && G[i + 1] == G[i]) {
                System.out.println(G[i] + " sayısı " + count + " kere tekrar edildi");
            }
        }

    }
}
