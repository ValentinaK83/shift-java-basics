package main.java.homework202;

import java.io.*;
import java.util.Scanner;

public class PrintToFile {
    public static void main(String[] args) {
        String outputFileName = "output.txt";
        //       PrintWriter writer;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int start = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int end = scanner.nextInt();
        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            writer.print("    ");
            for (int i = start; i <= end; i += step) {
                String result = String.format("%4d", i);
                writer.print(result);
            }
            String result = String.format("%4d", end);
            writer.print(result);
            for (int i = start; i <= end; i += step) {
                writer.println();
                result = String.format("%4d", i);
                writer.print(result);
                for (int j = start; j <= end; j += step) {
                    result = String.format("%4d", i * j);
                    writer.print(result);
                }
                result = String.format("%4d", i * end);
                writer.print(result);
            }
            writer.println();
            result = String.format("%4d", end);
            writer.print(result);
            for (int j = start; j <= end; j += step) {
                result = String.format("%4d", end * j);
                writer.print(result);
            }
            result = String.format("%4d", end * end);
            writer.print(result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
}


