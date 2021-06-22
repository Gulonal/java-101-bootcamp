package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	     int heat;
	     Scanner hava = new Scanner(System.in);
 
	     System.out.print("Hava ısısını lütfen giriniz:  ");
	     heat = hava.nextInt();

	     if(heat<5){
 
             System.out.print(heat+" Derece havada kayak yapmak mükemmel olur !! \n ");
         }
	     if (heat>=5 && heat<=15){
             System.out.print(heat+" Bu havalarda sinemaya gitmeye ne dersiniz :)  \n");
         }
	     if (heat>=10 && heat<=25){

             System.out.print(heat+" Bizi bu güzel havalar mahvetti : piknik yapmak hoşunuza gidebilir. \n ");
         }
	     if(heat>=25){

             System.out.print(heat+" Hava sizcede birden çok ısınmadımı suyun serin kollarına bıraksak ya kendimizi hadi yüzelim :) \n");
       }
    }
}
