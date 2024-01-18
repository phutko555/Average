package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int sum = 0;
        int count = 0;

        int number;
        while ((number = scanner.nextInt()) != 0) {
            sum += number;
            count++;
        }

        if (count != 0) {
            int average = sum / count;
            System.out.print(average);
        } else {
            System.out.print(0); // Avoid division by zero
        }

        scanner.close();
  
    }

}
