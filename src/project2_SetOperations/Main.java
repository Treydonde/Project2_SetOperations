package project2_SetOperations;

import java.util.Arrays;

/**
 * Group 2
 * Gustavo Cabral, Ben Shaw, Camilla Feitosa Nunes
 * Course and section (CS 2430, section 002)
 * Project name (Programming Project 2 – (Fall) 2026)
 */
public class Main {

    public static void main(String[] args) {
        //set representation
        float[] firstA = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0};
        float[] secondA = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        Functions set1 = new Functions(firstA, secondA);

        float[] firstB = {1, 1, 0, 0, 1, 1, 0, 1, 0, 0};
        float[] secondB = {0, 0, 1, 1, 0, 1, 1, 0, 1, 0};
        Functions set2 = new Functions(firstB, secondB);

        float[] firstC = {1, 0, 0, 1, 1, 0, 1, 1, 0, 1};
        float[] secondC = {0, 1, 0, 1, 0, 1, 0, 0, 1, 1};
        Functions set3 = new Functions(firstC, secondC);

        System.out.println("~~~~ Set Operations ~~~~");
        System.out.println();
        printSetOperations(firstA, secondA, set1, "A");
        System.out.println();
        printSetOperations(firstB, secondB, set2, "B");
        System.out.println();
        printSetOperations(firstC, secondC, set3, "C");

        //fuzzy set representation


        //multi-set representation

    }

    private static void printSetOperations(float[] first, float[] second, Functions set1, String test) {
        System.out.println("----Test " + test + "----");
        System.out.println();
        System.out.println("First " + test + ":" + Arrays.toString(first));
        System.out.println("Second " + test + ":" + Arrays.toString(second));
        System.out.println();
        System.out.printf("Complement First " + test + ":\n" + Arrays.toString(set1.complement(first)) + "\n");
        System.out.printf("Complement Second " + test + ":\n" + Arrays.toString(set1.complement(second)) + "\n");
        System.out.printf("Union: \n" + Arrays.toString(set1.union()) + "\n");
        System.out.printf("Intersection: \n" + Arrays.toString(set1.intersection()) + "\n");
        System.out.printf("Difference: \n" + Arrays.toString(set1.difference()) + "\n");
        System.out.printf("Symmetric Difference: \n" + Arrays.toString(set1.symmetricDifference()) + "\n");
    }

}
