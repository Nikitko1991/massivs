package com.company;

import java.util.Random;
public class zadacha3 {
    public static void main(String[] args) {
        int b=0;
        int[] mas = new int[15];
        for(int i=0;i<mas.length;i++){
            Random rnd=new Random();
            mas[i]=rnd.nextInt(10);
            System.out.print(mas[i] +" ");
            if(mas[i]>0&mas[i]%2==0)b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве "+b+" четных");

    }
}
