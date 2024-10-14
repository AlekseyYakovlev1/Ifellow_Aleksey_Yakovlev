package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Number1 {
    public Number1 () {
    }


    public static void main(String[] args) {
        int len = 2;
        int[] arr = new int[len];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (int)(Math.random() * 20.0);
            System.out.print(arr[i] + " ");
        }

        int max;
        max = arr[0];
        int min = arr[0];
        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];
        }

        float average = (float)sum / (float)len;
        System.out.println("\nмасимальное число = " + max + "\nминимальное число = " + min + "\nсреднее значение = " + average);
    }
}
