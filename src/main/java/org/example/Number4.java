package org.example;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите часы: ");
        int hours = sc.nextInt();
        System.out.println("Введите минуты: ");
        int minutes = sc.nextInt();
        if(hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60){
            System.out.println("Угол между стрелками: " + angle(hours, minutes));
        }
        else {
            System.out.println("Некорректный формат времени");
        }
    }
    public static double angle(int hours, int minutes) {
        hours = hours % 12;
        minutes = minutes % 60;
        double hourAngle = (hours * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
}
