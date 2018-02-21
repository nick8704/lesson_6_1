package com.company;

import java.util.Scanner;

public class Permutations {

    public static void main(String args[]) {
        System.out.println("Enter any string");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        permute(text.toCharArray(), 0, text.length() - 1);
    }

    private static void permute(char[] array, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            System.out.println(String.valueOf(array));
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                swap(array, startIndex, i);
                permute(array, startIndex + 1, endIndex);
                swap(array, startIndex, i);
            }
        }
    }

    private static void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}