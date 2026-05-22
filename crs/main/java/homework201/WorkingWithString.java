package main.java.homework201;

import java.util.Scanner;

public class WorkingWithString {

    static class TwoString {
        private String modifiedString;
        private String originalString;

        public String getOriginalString() {
            return originalString;
        }

        public String getModifiedString() {
            return modifiedString;
        }

        public TwoString(String originalString, String modifiedString) {
            this.originalString = originalString;
            this.modifiedString = modifiedString;
        }

        public static void print(TwoString ts) {
            System.out.println("Исходная строка: " + ts.getOriginalString() + "\nПолучившаяся строка: " + ts.getModifiedString());
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

        String cleanString = inputOriginalString.replaceAll("\\s{2,}", " ");


        String replacedString = cleanString.replace(String.valueOf(inputSymbol), " ");

        String finalString = replacedString.replaceAll("\\s{2,}", " ");

        TwoString result = new TwoString(inputOriginalString, finalString);

        TwoString.print(result);

        if (inputOriginalString.equals(finalString)) {
            System.out.println("После преобразования строка не изменилась");
        }
    }
}

