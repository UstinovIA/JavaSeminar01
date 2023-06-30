package Seminar01.Homework01;

// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите бинарное выражение: ");
        String inputString = scanner.nextLine();
        Calc(inputString);
    }

    static int Plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int Minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    static int Multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static double Del(Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }

    static void Calc(String inputStr) {
        String[] temp = inputStr.split(" ");
        switch (temp[1]) {
            case "+":
                System.out.println("Результат: " + Plus(Integer.parseInt(temp[0]), Integer.parseInt(temp[2])));
                break;
            case "-":
                System.out.println("Результат: " + Minus(Integer.parseInt(temp[0]), Integer.parseInt(temp[2])));
                break;
            case "*":
                System.out.println("Результат: " + Multi(Integer.parseInt(temp[0]), Integer.parseInt(temp[2])));
                break;
            case "/":
                System.out.println("Результат: " + Del(Double.parseDouble(temp[0]), Double.parseDouble(temp[2])));
                break;
            default:
                System.out.println("Введена неподдерживаемая операция");
                break;
        }
    }
}
