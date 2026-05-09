package main.java.homework19;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int start = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int end = scanner.nextInt();
        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        int realStart = Math.min(start, end);
        int realEnd = Math.max(start, end);
        printTable(realStart, realEnd, Math.abs(step));
    }

    public static void printTable(int start, int end, int step) {

        System.out.print("  ");
        for (int i = start; i <= end; i += step) {
            System.out.printf("%4d", i);
        }
        System.out.printf("%4d", end);
        System.out.println();

        for (int i = start; i <= end; i += step) {
            System.out.printf("%2d", i);
            for (int j = start; j <= end; j += step) {
                System.out.printf("%4d", i * j);
            }
            System.out.printf("%4d", i * end);
            System.out.println();
        }

        System.out.printf("%2d", end);
        for (int j = start; j <= end; j += step) {
            System.out.printf("%4d", end * j);
        }
        System.out.printf("%4d", end * end);
    }
}