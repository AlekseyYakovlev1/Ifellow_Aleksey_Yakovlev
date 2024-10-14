package org.example;

import java.util.Scanner;

public class Number2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите строку: ");
        String text = sc.nextLine();
        int len = 128;
        int[] arr = new int[len];

        for(int i = 0; i < text.length(); ++i) {
            ++arr[text.charAt(i)];
        }

        boolean flag = false;

        for(int i = 0; i < len; ++i) {
            if (arr[i] > 1) {
                char ch = (char)i;
                System.out.println("" + ch + " повторяется " + arr[i] + " раз");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Нет повторяющихся символов");
        }

    }
}