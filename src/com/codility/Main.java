package com.codility;

import com.codility.lesson_4_counting_elements.FrogRiverOne;
import com.codility.lesson_4_counting_elements.MaxCounters;
import com.codility.lesson_4_counting_elements.MissingInteger;

import java.util.Arrays;

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

        // Task 1: FrogJmp  https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
//        int X = 10;
//        int Y = 85;
//        int D = 30;
//        System.out.println("\nSolution:" + FrogJmp.Solution(X, Y, D));

        // Task 2: PermMissingElem  https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
//        int[] A = {2, 3, 1, 5};
//        System.out.println("\nSolution: " + PermMissingElem.Solution(A));

        // Task 3: TapeEquilibrium
//        int[] A = {3,1,2,4,3};
//        int s = TapeEquilibrium.solution(A);
//        System.out.println("\nSolution: " + s);


        // Lesson 4

        // Task 1: PermCheck    https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
//        int[] A = {4,1,3,2};
//        int s = PermCheck.solution(A);
//        System.out.println("\nSolution: " + s);

        // Task 2: FrogRiverOne https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
//        int X = 5;
//        int[] A = {1,3,1,4,2,3,5,4};
//        FrogRiverOne F = new FrogRiverOne();
//        System.out.println("\nSolution: " + F.solution(X, A));

        // Task 3: MaxCounters  https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
//        int N = 5;
//        int[] A = {1,2,3,6,4,5,6,1,2};
//        MaxCounters M = new MaxCounters();
//        System.out.println("\nSolution: " + Arrays.toString(M.solution(N, A)));

        // Task 4: MissingInteger   https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
//        int[] A = {-1,2,-5,2,2,3,1,7,2,4,5,6};
        int[] A = {1,2,3};
        MissingInteger M = new MissingInteger();
        System.out.println("\nSolution: " + M.solution(A));
    }
}

