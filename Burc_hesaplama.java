package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mont,day;
        Scanner burc = new Scanner(System.in);

        System.out.print("Doğum ayınızı giriniz rakamla 1 ve 12 arasında olacak şekilde: ");
        mont = burc.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = burc.nextInt();
        if (mont==1){
            if(day>1 && day<=31){
                if(day< 22) {
                    System.out.println("Oğlak burcusunuz\n Toprak grubu burcudur.");
                } else {
                    System.out.println("Kova burcusunuz\n Hava grubu burcudur.");
                }
            }else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==2){
            if(day>1 && day<=28){
                if(day< 20) {
                    System.out.println("Kova burcusunuz \n Hava grubu burcudur.");
                } else {
                    System.out.println("Balık burcusunuz \n Su grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==3){
            if(day>1 && day<=31){
                if(day< 21) {
                    System.out.println("Balık burcusunuz \n Su grubu burcudur.");
                } else {
                    System.out.println("Koç burcusunuz \n Ateş grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==4){
            if(day>1 && day<=30){
                if(day< 21) {
                    System.out.println("Koç burcusunuz \n Ateş grubu burcudur.");
                } else {
                    System.out.println("Boğa burcusunuz \n Toprak grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==5){
            if(day>1 && day<=31){
                if(day< 22) {
                    System.out.println("Boğa burcusunuz \n Toprak grubu burcudur.");
                } else {
                    System.out.println("İkizler burcusunuz \n Hava grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==6){
            if(day>1 && day<=30){
                if(day< 23) {
                    System.out.println("İkizler burcusunuz \n Hava grubu burcudur.");
                } else {
                    System.out.println("Yengeç burcusunuz \n Su grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==7){
            if(day>1 && day<=31){
                if(day< 23) {
                    System.out.println("Yengeç burcusunuz \n Su grubu burcudur.");
                } else {
                    System.out.println("Aslan burcusunuz \n Ateş grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==8){
            if(day>1 && day<=31){
                if(day< 23) {
                    System.out.println("Aslan burcusunuz \n Ateş grubu burcudur.");
                } else {
                    System.out.println("Başak burcusunuz \n Toprak grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==9){
            if(day>1 && day<=31){
                if(day< 23) {
                    System.out.println("Başak burcusunuz \n Toprak grubu burcudur.");
                } else {
                    System.out.println("Terazi burcusunuz \n Hava grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==10){
            if(day>1 && day<=30){
                if(day< 23) {
                    System.out.println("Terazi burcusunuz \n Hava grubu burcudur.");
                } else {
                    System.out.println("Akrep burcusunuz \n Su grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==11){
            if(day>1 && day<=30){
                if(day< 22) {
                    System.out.println("Akrep burcusunuz \n Su grubu burcudur.");
                } else {
                    System.out.println("Yay burcusunuz \n Ateş grubu burcudur."); //bukadar muhteşem başka burç yok
                }
            }else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }
        if (mont==12){
            if(day>1 && day<=30){
                if(day< 22) {
                    System.out.println("Yay burcusunuz \n Ateş grubu burcudur.");
                } else {
                    System.out.println("Oğlak burcusunuz \n Toprak grubu burcudur.");
                }
            } else {
                System.out.println("Geçersiz bir gün giriş yaptınız ");
            }
        }

    }
}
