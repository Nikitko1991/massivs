package com.company;

public class Main {

    public static void main(String[] args) {
	int mas[]=new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            mas[i] = b;
            b += 2;
            i++;
        }
        //вывод в строку
        for (i = 0; i < 10; i++)
            System.out.print(mas[i] + " ");
        //Вывод в столбик
        System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(mas[i]);

    }
}
