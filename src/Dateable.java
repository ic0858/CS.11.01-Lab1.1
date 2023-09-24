import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        //java.lang.Object System;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println ("Question 1: Datability, Please enter your age:");
        int n = scanner.nextInt();
        System.out.print ("Dateable: " + age(n) + "\n");
    }
    public static int age (int n) {return (n/2)+7;}
}