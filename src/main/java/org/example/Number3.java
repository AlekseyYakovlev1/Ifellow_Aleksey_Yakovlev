package org.example;

import org.example.Classes.BaseConvert;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        BaseConvert bc = new BaseConvert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество градусов Цельсия: ");
        double toConvert = sc.nextDouble();
        System.out.println("Выберите конвертацию(1 - в Фаренгейты, 2 - в Кельвины): ");
        int choice = sc.nextInt();
        toConvert = bc.convert(toConvert, choice);
        switch(choice){
            case 1:
                System.out.println("Конвертированное значение: " + toConvert + " F");
                break;
            case 2:
                System.out.println("Конвертированное значение: " + toConvert + " K");
                break;
        }
    }
}
