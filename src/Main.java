import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinOps bins = new BinOps();
        System.out.println("Введите первое двоичное число для сложения:");
        String a = scanner.nextLine();
        System.out.println("Введите второе двоичное число для сложения:");
        String b = scanner.nextLine();
        System.out.println("\tРезультат сложения двух двоичных чисел:");
        System.out.println(a + " + " + b + " = " + bins.sum(a, b));

        System.out.println("Введите первое двоичное число для умножения:");
        a = scanner.nextLine();
        System.out.println("Введите второе двоичное число для умножения:");
        b = scanner.nextLine();
        System.out.println("\tРезультат умножения двух двоичных чисел:");
        System.out.println(a + " * " + b + " = " + bins.mult(a, b));




    }// main
}// classb