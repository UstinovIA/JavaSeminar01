package Seminar01.Homework01;

import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num + "-ое треугольное число равно: " + GetTriangleNumber(num));
        System.out.println("Факториал числа " + num + " равен: " + GetFactorial(num));
    }

    static int GetTriangleNumber(int number) {
        int result = 0;
        while (number > 0) {
            result += number--;
        }
        return result;
    }

    static int GetFactorial(int number) {
        int result = 1;
        while (number > 1) {
            result *= number--;
        }
        return result;
    }
}
