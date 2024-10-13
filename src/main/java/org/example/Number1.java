package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Number1 {
    public Number1 () {
    }


    public static void main(String[] args) {
        int len = 20;
        int[] arr = new int[len];

        int max;
        for(max = 0; max < arr.length; ++max) {
            arr[max] = (int)(Math.random() * 20.0);
            System.out.print(arr[max] + " ");
        }

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
