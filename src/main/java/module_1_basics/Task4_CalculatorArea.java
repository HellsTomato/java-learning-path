package module_1_basics;

import java.util.Scanner;

public class Task4_CalculatorArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ширина прямоугольника:");
        int a = scanner.nextInt();
        System.out.println("Высота прямоугольника:");
        int b = scanner.nextInt();
        System.out.println("Площадь прямоугольника: " + a*b);
    }
}
