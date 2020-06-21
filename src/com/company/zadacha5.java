package com.company;
import java.util.Random;
public class zadacha5 {
    public static void main(String[] args) {
        int [] mas = new int[12];
        int maxNum= 15;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*16);
            if(maxNum <= mas[i]){
                maxNum = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}


