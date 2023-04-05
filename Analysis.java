
// Write a Java program that allows the user to input the marks obtained by five students in three different subjects (TCS1, TCS2, TCS3) and then calculates the outputs for following information:

// Total marks obtained by each student
// The student who scored the highest total marks
// The highest marks obtained in each subject and the roll number of the student who scored it.

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[5][3];

        // Reading marks of five students in three subjects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks in TCS " + (j + 1) + ": ");
                m[i][j] = s.nextInt();
            }
        }

        // Calculating total marks obtained by each student
        int[] t = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                t[i] += m[i][j];
            }
        }

        // Finding the student who scored the highest total marks
        int h = t[0];
        int hti = 0;
        for (int i = 1; i < 5; i++) {
            if (t[i] > h) {
                h = t[i];
                hti = i;
            }
        }

  
        System.out.println("\nTotal marks obtained by each student:");
        for (int i = 0; i < 5; i++) {
            System.out.println("S" + (i + 1) + ": " + t[i]);
        }

       
        int h1 = m[0][0];
        int h2 = m[0][1];
        int h3 = m[0][2];
        int h1i = 1;
        int h2i = 1;
        int h3i = 1;
        for (int i = 1; i < 5; i++) {
            if (m[i][0] > h1) {
                h1 = m[i][0];
                h1i = i + 1;
            }
            if (m[i][1] > h2) {
                h2 = m[i][1];
                h2i = i + 1;
            }
            if (m[i][2] > h3) {
                h3 = m[i][2];
                h3i = i + 1;
            }
        }

       
        System.out.println("\nHighest marks in each subject and roll number of the student who scored it:");
        System.out.println("T1: " + h1 + " (S" + h1i + ")");
        System.out.println("T2: " + h2 + " (S" + h2i + ")");
        System.out.println("T3: " + h3 + " (S" + h3i + ")");

    
        System.out.println("\nStudent who scored highest total marks: S" + (hti + 1));
    }
}

