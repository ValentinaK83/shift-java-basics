package main.java.homework201;

import java.util.Scanner;

public class WorkingWithString {

    static class TwoString {
        private String originalString;
        private String modifiedString;

        public TwoString(String originalString, String modifiedString) {
            this.originalString = originalString;
            this.modifiedString = modifiedString;
        }

        public String toString() {
            return "Исходная строка: " + originalString + "\nПолучившаяся строка: " + modifiedString;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите исходную строку:");
        String inputOriginalString = scanner.nextLine();

        System.out.println("Введите искомый символ:");
        String inputSymbol = scanner.nextLine();

        if (inputSymbol.length() != 1 || inputSymbol.charAt(0) == ' ') {
            System.out.println("Ошибка: необходимо ввести один символ (не пробел)");
            return;
        }
        char targetSymbol = inputSymbol.charAt(0);

        String cleanString = inputOriginalString.replaceAll("\\s+", " ");

        String replacedString = cleanString.replace(String.valueOf(targetSymbol), " ");

        String finalString = replacedString.replaceAll("\\s+", " ");

        TwoString result = new TwoString(inputOriginalString, finalString);

        System.out.println(result);

        if (inputOriginalString.equals(finalString)) {
            System.out.println("После преобразования строка не изменилась");
        }
    }
}

