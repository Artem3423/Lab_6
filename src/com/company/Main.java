package com.company;

import java.lang.Math;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите диапазон рандомных чисел");
        int coef = in.nextInt();
        int value;
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * (coef * 2) - coef);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("-----");

        for (int left = 0; left < array.length; left ++) {
            value = array[left];
            int j = left - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        for (int j : array) {
            System.out.print(j + ", ");
        }
    }
}

