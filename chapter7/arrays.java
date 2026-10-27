package chapter7;

import java.util.Scanner;

public class arrays {
         public static void main(String[] args) {
         //     int marks1 = 85;
         //     int marks2 = 90;
         //     int marks3 = 78;
         //     int marks4 = 95;
         //     int marks5 = 88;

         //     int [] marks = {85 , 90 , 78 , 95 , 88};

         //     System.out.println(marks[0]);
         //     System.out.println(marks[2]);
         //     System.out.println(marks[4]);

         //     marks[1] = 100;
         //     System.out.println(marks[1]);

         //     for(int i = 0; i < marks.length; i++) {
         //          System.out.println(marks[i]);
         //     }


             Scanner sc = new Scanner(System.in);

             int[] marks = new int[5];

             for(int i = 0; i<marks.length; i++) {
                  System.out.println("Enter marks :");
                  marks[i] = sc.nextInt();
             }

             System.out.println("\n Marks");

              for(int i = 0; i<marks.length; i++) {
                  System.out.println( marks[i]);
             }

         //     // 2
         //     int [] numbers = new int[5]; 
         }
}

// Arrays are mutable 