
# Programming Project 2 - Sets Operations

## Overview

This project focuses on implementing ordinary set, multiset, and fuzzy set operations using Java.

The project is divided into three parts:

**Part 1 - Ordinary Sets:** Uses arrays with 0s and 1s to represent sets and perform operations.

**Part 2 - Multisets:** Uses arrays to keep track of how many times each element appears and perform operations.

**Part 3 - Fuzzy Sets:** Uses arrays with values between 0.0 and 1.0 to represent different degrees of membership.

The project also explores the differences between these types of sets and how natural-language questions can make it difficult to determine which type should be used.

## Ordinary Set Operations

Ordinary sets are represented using arrays with 0s and 1s in the Main class. Each position in the array represents an element in the universal set.

- 1 means the element belongs to the set.
- 0 means the element does not belong to the set.

The universal set contains 10 elements.

The program performs the following operations:

- **Complement (NOT A):** Finds the elements that are not in set A.
- **Union (A ∪ B):** Combines the elements from A and B without duplicates.
- **Intersection (A ∩ B):** Finds the elements that A and B have in common.
- **Difference (A − B):** Finds the elements that belong to A but not B.
- **Symmetric Difference (A ⊕ B):** Finds the elements that belong to A or B, but not both.

The Main class displays the results as arrays containing 0s and 1s.

## Multiset Operations

Unlike ordinary sets, multisets allow elements to appear more than once.

For this part, we used float arrays to store the number of times each element appears.

The program performs the following operations:

- **Multiset Union:** Uses the higher count of each element from A and B.
- **Multiset Intersection:** Uses the lower count of each element from A and B.
- **Multiset Difference:** Subtracts the count in B from the count in A, without going below zero.
- **Multiset Sum:** Adds the counts of each element from A and B.

Both multisets include at least two elements that appear more than once.

The results are clearly labeled to separate multiset operations from ordinary set operations.

## Fuzzy Set Operations

Fuzzy sets allow elements to have different degrees of membership instead of only being present or absent.

For this part, we used float arrays with values between 0.0 and 1.0.

- 0.0 means the element is not a member of the set.
- 1.0 means the element is a full member of the set.
- Values between 0.0 and 1.0 represent partial membership.

The program performs the following operations:

- **Complement:** Subtracts the membership value from 1.
- **Union:** Uses the higher membership value from A and B.
- **Intersection:** Uses the lower membership value from A and B.

The fuzzy set operations use the same Functions class as the multiset operations.

## Running the Project

The program runs from Main.java.

To run the project in Eclipse:

1. Open Main.java in the project package.
2. Right-click anywhere inside the file.
3. Select **Run As → Java Application**.
4. View the results in the Eclipse Console.

The program displays:

- The original ordinary sets and their operations.
- The original fuzzy sets and their operations.
- The original multisets and their operations.

The results are also used in the final report to explain how each operation works.

## Project Structure

The project contains the following folders and files:

**src folder:**

- Main.java - Runs the program and displays the results.
- Functions.java - Contains the methods used for the set operations.

**test folder:**

- FunctionsTest.java - Tests ordinary set, multiset, and fuzzy set operations.

**docs folder:**

Contains the project plan and design documents.

## Testing

We used JUnit 5 to test the ordinary set, multiset, and fuzzy set operations.

The tests compare the expected results with the actual results.

We tested:

- Ordinary set operations.
- Multiset operations.
- Fuzzy set operations.
- Sets with no common elements.
- Empty sets.
- Repeated elements in multisets.
- Different membership values in fuzzy sets.

For floating-point values, we used a tolerance of 0.0001 to account for small differences in calculations.

To run the tests in Eclipse:

1. Open a test class.
2. Right-click the test file.
3. Select **Run As → JUnit Test**.
4. View the test results in Eclipse.

## Documentation

Additional project documentation is located in the `docs` folder:

- `ProjectPlan.md` - Project tasks, ownership, milestones, and progress.
- `UML.md` - Current class design.
- `Sequence_PseudoCode.md` - Algorithm and design pseudocode.
- `CONTRIBUTIONS.md` - Team member contributions and evidence.

The final report includes the implementation methods, testing results, discussion of natural-language queries, and fuzzy set Change Impact Analysis.

## Contributors

**Group 2**

- Benjamin Shaw
- Camilla Feitosa Nunes
- Gustavo Cabral

**Course:** CS 2430, Section 002 - Fall 2026

