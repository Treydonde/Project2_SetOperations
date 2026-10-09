# Sequence / Pseudo Code

## Part 1 - Ordinary Sets

Main program creates a universal set with at least 10 elements.

Main program creates two sets, A and B, using Boolean arrays.

Each position in the array represents an element. `true` means the element is in the set, and `false` means it is not.

Main program passes A and B to the Ordinary Set class.

Ordinary Set class then does the following:

For each position in the arrays:

- **Complement:** Find the elements that are not in A.
- **Union:** Find the elements that are in A or B, or both.
- **Intersection:** Find the elements that are in both A and B.
- **Difference:** Find the elements that are in A but not B.
- **Symmetric Difference:** Find the elements that are in A or B, but not both.
- Store the results in new Boolean arrays.
- Check if there are more positions to go through.
- If yes, repeat.
- If no, return the results.

Main program prints the results as Boolean arrays and lists the elements in each set.

---

## Part 2 - Multisets

Main program creates two multisets, A and B, using arrays that store how many times each element appears.

Main program passes A and B to the Multiset class.

Multiset class then does the following:

For each element:

- **Union:** Take the higher count from A and B.
- **Intersection:** Take the lower count from A and B.
- **Difference:** Subtract the count in B from A, but don't go below zero.
- **Sum:** Add the counts from A and B.
- Store the results.
- Check if there are more elements.
- If yes, repeat.
- If no, return the results.

Main program prints the results of each multiset operation.

---

## Testing

Test classes create different examples of sets and multisets.

For each test:

- Create the sets.
- Decide what the correct result should be.
- Run the operation.
- Compare the actual result with the expected result.
- Check if the test passed or failed.

---

## Final Output

Main program prints to the console:

- Original sets A and B
- Results of the five ordinary set operations
- Original multisets A and B
- Results of the four multiset operations

All results are labeled so it is easy to tell which operation was used.
