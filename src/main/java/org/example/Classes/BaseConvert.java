package org.example.Classes;

public class BaseConvert {
    public double convert(double toConvert, int choice){
        switch (choice){
            case 1:
                return toConvert * 9 / 5 + 32;
            case 2:
                return toConvert + 273.15;
            default:
                System.out.println("Неверный выбор");
                return 0.0;
        }
    }
}
