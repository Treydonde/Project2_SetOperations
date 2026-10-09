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
| Paulina Cruz | TBD | TBD |
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
- 
---

## Planned Java Classes

---

# Task Plan

## Project Setup

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Create GitHub repository | Gustavo | Done | Repository |
| Add all team members to repository | Gustavo| Done | Repository |
| Confirm instructor repository access | Gustavo | Not Started| - |
| Assign team roles | Team | Done | `docs/ProjectPlan.md` |
| Create `/docs` folder | Gustavo | Done | `docs/` |
| Create Project Plan | Camila/Gustavo | In Progress | `docs/ProjectPlan.md` |
| Create design artifacts | TBD | Not Started | - |
| Create `README.md` | Gustavo | Done | `README.md` |
| Create `CONTRIBUTIONS.md` | Gustavo | Done | `docs/CONTRIBUTIONS.md` |

---

# Part 1 - Ordinary Set Operations

| Task | Owner | Status | Evidence |
|---|---|---|---|
| NOT(A) – complement of A with respect to the universal set | Gustavo |---|---|
| A ∪ B – union | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A ∩ B – intersection | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A − B – set difference | Ben | Done | [Commit 7d03e15](https://github.com/Treydonde/Project2_SetOperations/commit/7d03e15d5c8aa78e24d8639faf35137ec6639d66) |
| A ⊕ B – symmetric difference, defined as (A − B) ∪ (B − A) | Gustavo |---|---|

---

# Part 2 - Multiset Operations

| Task | Owner | Status | Evidence |
|---|---|---|---|
| Choose a structure to store element counts | TBD |Not started|---|
| Implement multiset representation | TBD | Not started | --- |
| Implement multiset union | TBD | ot started| --- |
| Implement multiset intersection| TBD |ot started| --- |
| Implement multiset difference | TBD |ot started|---|
| Implement multiset sum | TBD |ot started|---|
| Display elements and their counts | TBD |ot started|---|

---

## Testing


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

**Status:** In progress

