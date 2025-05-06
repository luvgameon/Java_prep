package Basic;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("this is scanner value: " + scanner.nextLine());
        }
    }
}