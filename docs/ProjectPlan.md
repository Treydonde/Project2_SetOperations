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

The program will display the results of each operation with clear labels.

Programming Requirements

- Use a universal set with at least 10 elements for Part 1.
- Display ordinary set results as bit strings or Boolean arrays and element-name listings.
- Use at least two elements with repeated occurrences in both multisets.
- Include at least 2–3 representative test cases and at least one edge case.
- Clearly separate ordinary set results from multiset results.
- Include comments explaining the major sections of code.
- Make sure the program runs without modifications in a standard Java environment.
  
---

## Planned Java Classes

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
| Define universal set with at least 10 elements | TBD |---|---|
|Implement Boolean array representation for ordinary sets | Team | --- |---|
| NOT(A) – complement of A with respect to the universal set | Gustavo |Done| [99acf4d](https://github.com/Treydonde/Project2_SetOperations/commit/99acf4d6fb6b17ecd30fb55f76aa58eb258331d9) |
| A ∪ B – union | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A ∩ B – intersection | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A − B – set difference | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A ⊕ B – symmetric difference, defined as (A − B) ∪ (B − A) | Gustavo | Done | [f125476](https://github.com/Treydonde/Project2_SetOperations/commit/f125476448d928bb1e599b43f6bd6eca2f4a5a49) |

---

# Part 2 - Multiset Operations

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Choose a structure to store element counts | TBD |Not started|---|
| Implement multiset representation | TBD | Not started | --- |
| Implement multiset union | Gustavo | Not started| --- |
| Implement multiset intersection| TBD |Not started| --- |
| Implement multiset difference | TBD |Not started|---|
| Implement multiset sum | Gustavo |Not started|---|
| Display elements and their counts | TBD |Not started|---|

---

# Fuzzy Set/Multiset Change Request

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Implement fuzzy union | Ben | Done| --- |
| Implement fuzzy complement | Ben | Done| --- |
| Implement fuzzy intersect | Ben | Done|---|

## Testing 

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Create test plan | Gustavo | In Progress |  |
| Test ordinary set operations | Gustavo | In Progress | [Union_tests](https://github.com/Treydonde/Project2_SetOperations/tree/tests/Union_tests), [intersection_tests](https://github.com/Treydonde/Project2_SetOperations/tree/tests/intersection_tests),  |
| Test multiset operations | TBD | Not started| --- |
| Test sets with no common elements| TBD |Not started| --- |
| Test empty sets or multisets | TBD |Not started|---|
| Test repeated elements in multisets | TBD |Not started|---|

---

## Report and Final Deliverables

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Write introduction – explain the problem and why it is interesting/relevant. | TBD | Not Started |  |
| Write Implementation / Methods – describe the data structures you used for ordinary sets and for multisets, and why. | TBD | Not Started |  |
| Write Verification Approach – explain how you tested (include at least 2–3 representative cases + at least one edge case). | TBD | Not Started |  |
| Create tables with program results for all ordinary set operations| TBD | Not Started |  |
| Create tables with program results for all multiset operations| TBD | Not Started |  |
| Complete `README.md` | TBD | Not Started |  |
| Complete `CONTRIBUTIONS.md` | Team | Not Started |  |
| Record team screencast | Team | Not Started|  |
| Each team member must participate (voice or captions) and explain their contribution (what they owned and how to find it in the zip/repo). | Team | Not Started |
| Edit team screencast | Gustavo | Not Started |  |
| If you used different arrays/structures/classes to represent the different types of sets, would it be possible to have overloaded methods or operations that would provide the correct functionality regardless of whether you were using sets or multisets? Why or why not? | Gustavo |  Not Started  |
| Would it be possible to use the same data set/structure/class to store sets and multisets? Why or why not? | Gustavo | Not Started |
| How easy or difficult is it to determine the type of set that you need to use based on the user’s natural-language query? Why? | TBD | Not Started |
| Is it possible to store the data from one type of set (plain sets or multisets) in another type? Would you need to lose data in order to do so? Why? | TBD | Not Started |
| Discuss what implications your answers to questions 1–4 have for someone trying to code an interface which would allow users to type in natural-language queries. | TBD | Not Started |
| Discuss what implications your answers to questions 1–5 have for someone trying to code an interface which would allow users to access arbitrary types of data using natural language. | TBD | Not Started |
| Write Conclusion – what you learned about mapping mathematical structures to code and why user queries complicate things| TBD | Not Started |  |
| Write Summary of Work Done / Lessons Learned – one short paragraph reflecting on problems, tools, and what you’d improve.| TBD | Not Started |  |
| Write sources | Gustavo | Not Started |  |
| Assemble final report | TBD | Not Started |  |
| Review final submission package | TBD | Not Started |  |


## The Change Impact Analysis - Report

| Task | Owner | Status | Evidence |
|---|---|---|---|
| What changed: Identify the classes, functions, modules, or data representations you added or modified, and explain why. | TBD | Not Started |  |
| What did not change: Identify components you reused without modification and explain what allowed that reuse. | TBD | Not Started |  |
| Refactoring: Describe any restructuring of existing code. Explain how it supported the new functionality and how you verified existing Set and Multiset behavior. | TBD | Not Started |  |
| Design strengths and weaknesses: Identify original assumptions or design choices that made the extension easier or more difficult. | TBD | Not Started |  |
| Lessons learned: Explain what you would design differently if starting again and connect that lesson to this change order. | TBD | Not Started |  |
---

# Milestones

## Milestone 1 - Project Setup and Checkpoint - Target: 2026-10-16

- Repository created
- Team members added
- Instructor access confirmed
- Team roles assigned
- Project Plan updated
- 2 Design artifacts included in `/docs`

**Status:** Started

## Milestone 2 - Core Implementation - Target: 10-19-2026

- Ordinary set operations completed
- Multiset operations completed
- Main program integrated
- Outputs clearly labeled

**Status:** Not started

## Milestone 3 - Testing and Data Collection - Target: 10-21-2026

- Set operations tested
- Multiset operations tested
- Edge cases verified
- Representative test results collected
- Results ready for report

**Status:** Not started

## Milestone 4 - Final Report and Submission - Target: 2026-10-23

- Report and discussion completed
- README completed
- CONTRIBUTIONS.md completed
- Team screencast recorded
- Repository exported as ZIP
- Final submission reviewed

**Status:** Not Started

