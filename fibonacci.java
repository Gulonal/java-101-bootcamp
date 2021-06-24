package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,n1=0,n2=1,n3=0;

        System.out.print("kaç adet fibonacci serisi istemektesiniz: ");
        number= input.nextInt();

        for(int i=0;i<number;i++){
            n3=n1+n2;

            System.out.println(n1 +" + "+n2+" = "+n3);
            n1=n2;
            n2=n3;
        }
        
    }
}
