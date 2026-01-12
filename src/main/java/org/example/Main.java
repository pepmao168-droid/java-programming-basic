package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input id:");
        int studentId = sc.nextInt();
        System.out.print("Please input name:");
        String studentName = sc.next();
        System.out.print("Please input gender:");
        String studentGender = sc.next();
        System.out.print("Please input date of birth:");
        int studentDateOfBirth = sc.nextInt();



    }
}