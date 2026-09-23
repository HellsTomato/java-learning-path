package module_1_basics;

import java.util.Scanner;

public class Task6_StringAnalyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int stringLength = a.length();
        System.out.println(a + "-" + stringLength + " символов");
    }
}
