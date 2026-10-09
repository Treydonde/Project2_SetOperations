# Programming Project 2 - Sets and Multisets

## Overview

This project focuses on implementing ordinary set and multiset operations using Java.

The project is divided into two parts:

**Part 1 - Ordinary Sets:** Uses Boolean arrays to represent sets and perform operations.
**Part 2 - Multisets:** Uses arrays to keep track of how many times each element appears and perform operations.

The project also explores the differences between sets and multisets and how natural-language questions can make it difficult to determine which type of set should be used.

## Ordinary Set Operations 

Ordinary sets are represented using Boolean arrays. Each position in the array represents an element in the universal set.

- true means the element belongs to the set.
- false means the element does not belong to the set.

The universal set contains at least 10 elements.

The program performs the following operations:

- **Complement (NOT A):** Finds the elements that are not in set A.
- **Union (A ∪ B):** Combines the elements from A and B without duplicates.
- **Intersection (A ∩ B):** Finds the elements that A and B have in common.
- **Difference (A − B):** Finds the elements that belong to A but not B.
- **Symmetric Difference (A ⊕ B):** Finds the elements that belong to A or B, but not both.

The program displays the results as Boolean arrays or bit strings and lists the elements in each resulting set.

## Multiset Operations

Unlike ordinary sets, multisets allow elements to appear more than once.

For this part, the proposed implementation uses integer arrays to store the number of times each element appears.

The program performs the following operations:

- **Multiset Union:** Uses the higher count of each element from A and B.
- **Multiset Intersection:** Uses the lower count of each element from A and B.
- **Multiset Difference:** Subtracts the count in B from the count in A, without going below zero.
- **Multiset Sum:** Adds the counts of each element from A and B.

Both multisets include at least two elements that appear more than once.

The results are clearly labeled to separate multiset operations from ordinary set operations.

## Running the Project
The program is intended to run from Main.java.

To run the project in Eclipse:

1. Open Main.java in the project package.
2. Right-click anywhere inside the file.
3. Select **Run As → Java Application**.
4. View the results in the Eclipse Console.

The program is designed to display:

- The original sets A and B
- The results of all ordinary set operations
- The original multisets A and B with their element counts
- The results of all multiset operations

The results will also be used in the final report to explain how each operation works.

## Project Structure 


## Testing 

JUnit 5 is planned for automated testing of the ordinary set and multiset operations.

The tests will check that each operation produces the expected results.

The project will include tests for:

- Ordinary set operations
- Multiset operations
- Sets with no common elements
- Empty sets or multisets
- Repeated elements in multisets
- Other representative and edge cases

To run the tests in Eclipse:

1. Open a test class.
2. Right-click the test file.
3. Select **Run As → JUnit Test**.
4. View the test results in Eclipse.


## Documentation 

Additional project documentation is located in the `docs` folder:

- `ProjectPlan.md` - project tasks, ownership, milestones, and progress
- `UML.md` - current class design
- `Sequence_PseudoCode.md` - algorithm and design pseudocode
- `CONTRIBUTIONS.md` - team member contributions and evidence
- Additional project documentation is located in the docs folder
- The final report will include the implementation methods, testing results, and a discussion of how natural-language queries can relate to ordinary sets, multisets, and fuzzy sets.

## Contributors

**Group 2**

- Benjamin Shaw
- Camilla Feitosa Nunes
- Gustavo Cabral
- Paulina Cruz

**Course:** CS 2430, Section 002 - Fall 2026
