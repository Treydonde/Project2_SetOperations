package project2_SetOperations;

import java.lang.reflect.Array;
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
        System.out.println();

        //fuzzy set representation
        float[] fuzzyA = {0.1f, 0.8f, 0.4f, 0.9f, 0.1f, 0.6f, 0.5f, 0.8f, 0.3f, 0.6f};
        float[] fuzzyB = {0.7f, 0.2f, 0.9f, 0.4f, 0.8f, 0.1f, 0.6f, 0.4f, 0.9f, 0.1f};
        Functions fuzzy1 = new Functions(fuzzyA, fuzzyB);

        float[] fuzzyC = {0.3f, 0.7f, 0.1f, 0.6f, 0.5f, 1.0f, 0.2f, 0.5f, 0.8f, 0.2f};
        float[] fuzzyD = {0.6f, 0.0f, 0.9f, 0.3f, 0.7f, 0.4f, 1.0f, 0.2f, 0.6f, 0.4f};
        Functions fuzzy2 = new Functions(fuzzyC, fuzzyD);

        System.out.println("~~~~ Fuzzy Set Operations ~~~~");
        System.out.println();
        System.out.println("----Fuzzy Set 1----");
        printFuzzySet(fuzzyA, fuzzyB, fuzzy1);
        System.out.println();
        System.out.println("----Fuzzy Set 2----");
        printFuzzySet(fuzzyC, fuzzyD, fuzzy2);

        //multi-set representation
        float[] multiA = {4.0f, 8.0f, 1.0f, 6.0f, 0.0f, 9.0f, 3.0f, 7.0f, 2.0f, 5.0f};
        float[] multiB = {7.0f, 2.0f, 9.0f, 0.0f, 4.0f, 6.0f, 1.0f, 8.0f, 5.0f, 3.0f};
        Functions multiset1 = new Functions(multiA, multiB);

        float[] multiC = {1.0f, 5.0f, 3.0f, 8.0f, 7.0f, 0.0f, 4.0f, 2.0f, 9.0f, 6.0f};
        float[] multiD = {9.0f, 0.0f, 6.0f, 3.0f, 2.0f, 8.0f, 5.0f, 1.0f, 7.0f, 4.0f};
        Functions multiset2 = new Functions(multiC, multiD);

        float[] multiE = {2.0f, 7.0f, 4.0f, 9.0f, 1.0f, 5.0f, 8.0f, 3.0f, 6.0f, 0.0f};
        float[] multiF = {6.0f, 3.0f, 0.0f, 5.0f, 9.0f, 2.0f, 7.0f, 4.0f, 1.0f, 8.0f};
        Functions multiset3 = new Functions(multiE, multiF);

        System.out.println("~~~~~~~~ Multi-set Operations ~~~~~~~~");
        System.out.println();
        System.out.println("----Multi-set 1----");
        printMultiSetOperations(multiA, multiB, multiset1);
        System.out.println();
        System.out.println("----Multi-set 2----");
        printMultiSetOperations(multiC, multiD, multiset2);
        System.out.println();
        System.out.println("----Multi-set 3----");
        printMultiSetOperations(multiE, multiF, multiset3);
    }

    private static void printFuzzySet(float[] fuzzyA, float[] fuzzyB, Functions fuzzy1) {
        System.out.println("First subset: " + Arrays.toString(fuzzyA));
        System.out.println("Second subset: " + Arrays.toString(fuzzyB));
        System.out.printf("Complement: \n" + Arrays.toString(fuzzy1.complement(fuzzyA)) + "\n");
        System.out.printf("Union: \n" + Arrays.toString(fuzzy1.union()) + "\n");
        System.out.printf("Intersection: \n" + Arrays.toString(fuzzy1.intersection()) + "\n");
        System.out.println();
    }

    private static void printMultiSetOperations(float[] multiA, float[] multiB, Functions multiset) {
        System.out.println("First subset: " + Arrays.toString(multiA));
        System.out.println("Second subset: " + Arrays.toString(multiB));
        System.out.println();
        System.out.printf("Union: \n" + Arrays.toString(multiset.union()) + "\n");
        System.out.printf("Intersection: \n" + Arrays.toString(multiset.intersection()) + "\n");
        System.out.printf("Difference: \n" + Arrays.toString(multiset.difference()) + "\n");
        System.out.printf("Sum: \n" + Arrays.toString(multiset.sum()) + "\n");
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
