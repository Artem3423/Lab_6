package com.company;

import java.lang.Math;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите диапазон рандомных чисел");
        int coef = in.nextInt();
        int num = -1 - coef;
        int num2 = coef + 1;
        int[] pos = new int[2];
        int[] pos2 = new int[2];
        int temp;
        int[] array = new int[25];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * (coef * 2) - coef);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("-----");


        //System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left ++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        //System.out.println(Arrays.toString(array))
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }
}

