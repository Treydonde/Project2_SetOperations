# Programming Project 2 - Project Plan

## Project Information

- **Course:** CS 2430, Section 002 - Fall 2026
- **Project:** Programming Project 2 - Set Operations
- **Team:** Group 2
- **Start Date:** 2026-10-05
- **Due Date:** 2026-10-23
- **Checkpoint Date:** 2026-10-16

---

## Team Members and Roles

| Team Member | Role | Main Responsibilities |
|---|---|---|
| Benjamin Shaw | Implementation Lead | Core implementation, integration, and main branch health |
| Gustavo Cabral | Verification Lead | Test plan, edge cases, testing, and verification evidence |
| Camilla Feitosa Nunes | Communications Lead | Report assembly, run instructions, documentation, and deliverable packaging |
---

## Project Goal
The goal of this project is to create a Java program that performs operations on ordinary sets and multisets.

Part 1 – Ordinary Sets

Use bit strings or Boolean arrays to represent sets and perform:

- Complement: NOT(A)
- Union: A ∪ B
- Intersection: A ∩ B
- Difference: A − B
- Symmetric Difference: A ⊕ B

Part 2 – Multisets

Use a data structure that keeps track of how many times each element appears and perform:

- Multiset Union (maximum count)
- Multiset Intersection (minimum count)
- Multiset Difference (subtract counts, not below zero)
- Multiset Sum (add counts)

Part 3 – Fuzzy Sets

Use float arrays with membership values between 0.0 and 1.0 to represent fuzzy sets and perform:

- **Complement:** Subtract the membership value from 1.
- **Union:** Use the maximum membership value.
- **Intersection:** Use the minimum membership value.

The program will display the results of each operation with clear labels.


Programming Requirements

- Use a universal set with at least 10 elements for Part 1.
- Display ordinary set results as bit strings or Boolean arrays and element-name listings.
- Use at least two elements with repeated occurrences in both multisets.
- Include at least 2–3 representative test cases and at least one edge case.
- Clearly separate ordinary set, multiset, and fuzzy set results.
- Use membership values between 0.0 and 1.0 for fuzzy sets.
- Test fuzzy sets using values of 0.0, 1.0, and values between them.
- Handle missing elements and invalid membership values.
- Use a small tolerance when comparing floating-point results.
- Re-run ordinary set and multiset tests after adding fuzzy sets.
- Include comments explaining the major sections of code.
- Make sure the program runs without modifications in a standard Java environment.
  
---

## Planned Java Classes

Our original plan was to create separate Java classes for the different ordinary set operations. After receiving the fuzzy-set change order, we changed our approach and decided to use one shared class for the operations.

The final project uses the following classes:

- **Main.java:** Creates the arrays, runs the different operations, and displays the results.
- **Functions.java:** Contains the methods for ordinary set, multiset, and fuzzy set operations.
- **FunctionsTest.java:** Uses JUnit 5 to test the operations and compare expected and actual results.

This structure allows us to use the same methods for different types of sets instead of creating separate classes for every operation.

---

# Task Plan

## Project Setup

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Create GitHub repository | Gustavo | Done | [Repository](https://github.com/Treydonde/Project2_SetOperations) |
| Add all team members to repository | Gustavo| Done | [Repository](https://github.com/Treydonde/Project2_SetOperations) |
| Confirm instructor repository access | Gustavo | Invite sent/ Project made public | [Repository](https://github.com/Treydonde/Project2_SetOperations) |
| Assign team roles | Team | Done | `docs/ProjectPlan.md` |
| Create `/docs` folder | Gustavo | Done | `docs/` |
| Create Project Plan | Camila/Gustavo | In Progress | `docs/ProjectPlan.md` |
| Create UML Diagram | Gustavo | Done | [CS2430_Project2_UML.png](https://github.com/Treydonde/Project2_SetOperations/blob/main/docs/CS2430_Project2_UML.png) |
| Create PsuedoCode | Camilla | Done | [Sequence_PsuedoCode.md](https://github.com/Treydonde/Project2_SetOperations/blob/main/docs/Sequence_PseudoCode.md) |
| Create `README.md` | Gustavo | Done | `README.md` |
| Create `CONTRIBUTIONS.md` | Gustavo | Done | `docs/CONTRIBUTIONS.md` |

---

# Part 1 - Ordinary Set Operations

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Define universal set with at least 10 elements | Gustavo |Done |[b16db52](https://github.com/Treydonde/Project2_SetOperations/commit/b16db52), [ad1f4bf](https://github.com/Treydonde/Project2_SetOperations/commit/ad1f4bf)|
|Implement Boolean array representation for ordinary sets | Ben/ Gustavo helped with other original classes | Done in earlier version; final code uses float arrays | [6483ce1](https://github.com/Treydonde/Project2_SetOperations/commit/6483ce1), [f715583](https://github.com/Treydonde/Project2_SetOperations/commit/f715583) 
| NOT(A) – complement of A with respect to the universal set | Gustavo |Done| [99acf4d](https://github.com/Treydonde/Project2_SetOperations/commit/99acf4d6fb6b17ecd30fb55f76aa58eb258331d9) |
| A ∪ B – union | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A ∩ B – intersection | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A − B – set difference | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A ⊕ B – symmetric difference, defined as (A − B) ∪ (B − A) | Gustavo | Done | [f125476](https://github.com/Treydonde/Project2_SetOperations/commit/f125476448d928bb1e599b43f6bd6eca2f4a5a49) |

---

## Part 2 - Multiset Operations

| Task | Owner | Status | Evidence (Commit) |
|---|---|---|---|
| Choose structure to store element counts | Benjamin | Done (float arrays) | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4) |
| Implement multiset representation | Ben/Gustavo  | Done | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4), [5cf5006](https://github.com/Treydonde/Project2_SetOperations/commit/5cf5006) |
| Implement multiset union | Ben | Done | [03a621d](https://github.com/Treydonde/Project2_SetOperations/commit/03a621d) |
| Implement multiset intersection | Ben | Done | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4) |
| Implement multiset difference | Ben | Done | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4) |
| Implement multiset sum | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Display elements and their counts | Gustavo | Done  | [5cf5006](https://github.com/Treydonde/Project2_SetOperations/commit/5cf5006) |
| Use repeated occurrences in both multisets | Gustavo | Done | [5cf5006](https://github.com/Treydonde/Project2_SetOperations/commit/5cf5006) |

## Part 3 - Fuzzy Set / Multiset Change Request

| Task | Owner | Status | Evidence (Commit) |
|---|---|---|---|
| Use float membership degrees between 0.0 and 1.0 | Ben/Gustavo | Done for hard-coded examples | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4), [f5a3813](https://github.com/Treydonde/Project2_SetOperations/commit/f5a3813) |
| Implement fuzzy complement | Gustavo/Ben | Done | [22be3bc](https://github.com/Treydonde/Project2_SetOperations/commit/22be3bc) |
| Implement fuzzy union | Ben | Done | [03a621d](https://github.com/Treydonde/Project2_SetOperations/commit/03a621d) |
| Implement fuzzy intersection | Ben | Done | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4) |
| Include two fuzzy-set examples in Main | Gustavo | Done | [87748e1](https://github.com/Treydonde/Project2_SetOperations/commit/87748e1), [f5a3813](https://github.com/Treydonde/Project2_SetOperations/commit/f5a3813) |
| Test fuzzy operations including zero, full and partial membership | Gustavo | Done| [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Combine old classes into one shared Functions class | Ben/Gustavo | Done | [36e80d4](https://github.com/Treydonde/Project2_SetOperations/commit/36e80d4), [f715583](https://github.com/Treydonde/Project2_SetOperations/commit/f715583) |

## Testing

| Task | Owner | Status | Evidence (Commit) |
|---|---|---|---|
| Create test plan and JUnit cases | Gustavo | Done | [b16db52](https://github.com/Treydonde/Project2_SetOperations/commit/b16db52), [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Test ordinary set operations | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Test multiset operations | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Test fuzzy set operations | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Test sets with no common elements | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Test empty sets or multisets | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Test repeated counts in multisets | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
| Use tolerance for floating-point values | Gustavo | Done | [104b151](https://github.com/Treydonde/Project2_SetOperations/commit/104b151) |
---

## Report and Final Deliverables

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Write introduction – explain the problem and why it is interesting/relevant. | Camilla | Done |  |
| Write Implementation / Methods – describe the data structures you used for ordinary sets and for multisets, and why. | Ben | Done |  |
| Write Verification Approach – explain how you tested (include at least 2–3 representative cases + at least one edge case). | Gustavo | Done |  |
| Create tables with program results for all ordinary set operations| Camilla | Done |  |
| Create tables with program results for all multiset operations| Camilla | Done |  |
| Complete `README.md` | Camilla | Done |  |
| Complete `CONTRIBUTIONS.md` | Team | Done |  |
| Record team screencast | Team | Done |  |
| Each team member must participate (voice or captions) and explain their contribution (what they owned and how to find it in the zip/repo). | Team | Done |
| Edit team screencast | Gustavo/Camilla | Done |  |
| 1- If you used different arrays/structures/classes to represent the different types of sets, would it be possible to have overloaded methods or operations that would provide the correct functionality regardless of whether you were using sets or multisets? Why or why not? | Camilla |  Done  |
| 2- Would it be possible to use the same data set/structure/class to store sets and multisets? Why or why not? | Camilla | Done |
| 3- How easy or difficult is it to determine the type of set that you need to use based on the user’s natural-language query? Why? | Gustavo | Done |
| 4- Is it possible to store the data from one type of set (plain sets or multisets) in another type? Would you need to lose data in order to do so? Why? | Camilla | Done |
| 5- Discuss what implications your answers to questions 1–4 have for someone trying to code an interface which would allow users to type in natural-language queries. | Camilla | Done |
| 6- Discuss what implications your answers to questions 1–5 have for someone trying to code an interface which would allow users to access arbitrary types of data using natural language. | Gustavo | Done |
| Write Conclusion – what you learned about mapping mathematical structures to code and why user queries complicate things| Gustavo | Done |  |
| Write Summary of Work Done / Lessons Learned – one short paragraph reflecting on problems, tools, and what you’d improve.| Camilla | Done |  |
| Write sources | Team | Done |  |
| Assemble final report | Camilla | Done |  |
| Review final submission package | Team | Done |  |


## The Change Impact Analysis - Report

| Task | Owner | Status | Evidence |
|---|---|---|---|
| What changed: Identify the classes, functions, modules, or data representations you added or modified, and explain why. | Ben | Done|  |
| What did not change: Identify components you reused without modification and explain what allowed that reuse. | Ben | Done |  |
| Refactoring: Describe any restructuring of existing code. Explain how it supported the new functionality and how you verified existing Set and Multiset behavior. | Ben | Done |  |
| Design strengths and weaknesses: Identify original assumptions or design choices that made the extension easier or more difficult. | Ben | Done |  |
| Lessons learned: Explain what you would design differently if starting again and connect that lesson to this change order. | Ben | Done |  |
---

# Milestones

## Milestone 1 - Project Setup and Checkpoint - Target: 2026-10-16

- Repository created
- Team members added
- Instructor access confirmed
- Team roles assigned
- Project Plan updated
- 2 Design artifacts included in `/docs`

**Status:** Done

## Milestone 2 - Core Implementation - Target: 10-19-2026

- Ordinary set operations completed
- Multiset operations completed
- Main program integrated
- Outputs clearly labeled

**Status:** Done

## Milestone 3 - Testing and Data Collection - Target: 10-21-2026

- Set operations tested
- Multiset operations tested
- Edge cases verified
- Representative test results collected
- Results ready for report

**Status:** Done

## Milestone 4 - Final Report and Submission - Target: 2026-10-23

- Report and discussion completed
- README completed
- CONTRIBUTIONS.md completed
- Team screencast recorded
- Repository exported as ZIP
- Final submission reviewed

**Status:** Not Started

