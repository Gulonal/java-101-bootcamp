package com.company;

public class Main {

    public static void main(String[] args) {
        
                int[] numbers = {1, 2, 3, 4, 5};
                double sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    for(int j=0; j<numbers.length;j++) {
                        sum += (1 /numbers [j]);
                    }
                    System.out.println(sum / numbers.length);

                }
    }
}
