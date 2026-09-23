package module_1_basics;

import java.util.Scanner;

public class Task5_NextVsNextLine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println("Слово:" + a);
        scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("Строка: " + b);
    }
}
