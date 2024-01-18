package com.epam.rd.autotasks;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum = 0;
        int count = 0;

        int number;
        while ((number = sc.nextInt()) != 0) {
            sum += number;
            count++;
        }

        if (count != 0) {
            int average = sum / count;
            System.out.print(average);
        } else {
            System.out.print(0); 
        }

        sc.close();
  
    }

}
