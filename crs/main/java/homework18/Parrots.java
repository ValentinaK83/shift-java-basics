package main.java.homework18;

public class Parrots {
    public static void main(String[] args) {
        double lengthSnakeCentimeter = 380;
        int numberParrotsInSnake = 38;
        int numberMonkeysInSnake = 5;
        int numberElephantsInSnake = 2;
        int conversionFactorToMeters = 100;
        double lengthSnakeToMeters = lengthSnakeCentimeter / conversionFactorToMeters;
        double heightParrot = lengthSnakeToMeters / numberParrotsInSnake;
        double heightMonkey = lengthSnakeToMeters / numberMonkeysInSnake;
        double heightElephant = lengthSnakeToMeters / numberElephantsInSnake;
        double heightAll = lengthSnakeToMeters + heightParrot + heightMonkey + heightElephant;
        String resultHeightParrot = String.format("%.1f", heightParrot);
        String resultHeightAll = String.format("%.2f", heightAll);
        System.out.println("Рост удава, м: " + lengthSnakeToMeters + "\n" +
                "Рост попугая, м: " + resultHeightParrot + "\n" +
                "Рост мартышки, м: " + heightMonkey + "\n" +
                "Рост слонёнка, м: " + heightElephant + "\n" +
                "Рост всех персонажей, м: " + resultHeightAll);
    }
}
