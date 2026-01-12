package org.example.homework;

import java.util.Scanner;

public class BasicOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String Name = sc.next();
        System.out.print("Enter age:");
        int Age = sc.nextInt();
        System.out.print("Enter address:");
        String Address = sc.next();
    }
}
