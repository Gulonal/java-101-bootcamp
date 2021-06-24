package com.company;

public class Main {

    public static void main(String[] args) {
        int sayac=0;

        for(int i=2;i<=100;i++){
            int kontrol =0;
            for(int j=2; j<i;j++) {
                if (i%j==0){
                    kontrol=1;
                    break;
                }
            }
            if(kontrol==0){
                System.out.print(i+"   ");
                sayac++;
            }
        }
        System.out.println("\n"+sayac+" tane sayı 1 ile 100 aralığında asaldır.");
    }
}
