package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.print("Please enter the score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        char s = grade(score);
        System.out.println(s);
    }
    public static char grade(int s) {
        if (s < 0 || s > 100)
            return 'I';
        else if (s >= 90)
            return 'A';
        else if (s >= 80)
            return 'B';

        else if (s >= 70)
            return 'C';
        else if (s >= 60)
            return 'D';
        else
            return 'F';
    }
}