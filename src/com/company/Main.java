package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Задача 1"); // Ниже выполнение первой задачи.
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
            System.out.println();
        for (;i > 0; i--) {
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println(" Задача 2"); // Ниже выполнение второй задачи.
        int friday = 1;
        for (; friday <= 31; friday++)
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        System.out.println(" Задача 3"); // Ниже выполнение третьей задачи.
        for (int currentYear = 2022, pastYear = currentYear - 200; pastYear < currentYear+100;pastYear++)
        if (pastYear%79==0) {
        System.out.println(pastYear);
        }
    }
}
