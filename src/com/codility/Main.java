package com.codility;

import com.codility.lesson_1_Iterations.BinaryGap;
import com.codility.lesson_2_Arrays.CyclicRotation;
import com.codility.lesson_2_Arrays.OddOccurrencesInArray;
import com.codility.lesson_3.FrogJmp;

public class Main {

    public static void main(String[] args) {

        //
        //  UWAGA! BAJZEL
        //  TODO: skrypy do odpalania poszczególnych zadań
        //


        // Lesson 1: Iterations

        // Task 1: BinaryGap  https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

//        int N = 529;
//        System.out.println("\nSolution: " + BinaryGap.solution(N));


        // Lesson 2: Arrays

        // Task 1: OddOccurrencesInArray   https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/

//        int[] A = {9, 3, 9, 3, 9, 7, 9};
//        System.out.println("\nSolution: " + OddOccurrencesInArray.solution(A));

        // Task 2: CyclicRotation   https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

//        int[] A = {3, 8, 9, 7, 6};
//        int K = 5;
//        int[] B = CyclicRotation.solution(A, K);
//        for (int i = 0; i < B.length; i++) {
//            System.out.println(" " + B[i]);
//        }


        // Lesson 3

        // Task 1:

        // Task 2: FrogJmp  https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
        int X = 10;
        int Y = 85;
        int D = 30;
        System.out.println("\nSolution:" + FrogJmp.Solution(X, Y, D));

        // Task 3: TapeEquilibrium
//        int[] A = {3,1,2,4,3};
//        int s = TapeEquilibrium.solution(A);
//        System.out.println("\nSolution: " + s);


    }
}

