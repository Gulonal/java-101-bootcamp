package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1= input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2= input.nextInt();

        int ebob=1, k=n1, i=1;
        while (k>=1){
            if(n1%k==0 && n2%k==0){
                ebob=k;
                break;
            }
            k--;
        }
        while (i<=(n1*n2)){
            if(i%n1==0 && i%n2 ==0){
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println((n1*n2)/ebob);
        
    }
}
