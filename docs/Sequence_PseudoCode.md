
# Sequence / Pseudo Code

## Part 1 - Ordinary Sets

Main program creates three pairs of sets using float arrays with 10 elements.

Each position in the array represents an element. `1` means the element is in the set, and `0` means it is not.

Main program passes A and B to the `Functions` class.

Functions class then does the following:

For each position in the arrays:

- **Complement:** Subtract each value from 1.
- **Union:** Take the higher value from A and B.
- **Intersection:** Take the lower value from A and B.
- **Difference:** Subtract the value in B from A, but don't go below zero.
- **Symmetric Difference:** Find the absolute difference between A and B.
- Store the results in new arrays.
- Check if there are more positions to go through.
- If yes, repeat.
- If no, return the results.

Main program prints the results of each ordinary set operation as arrays containing 0s and 1s.

---

## Part 2 - Multisets

Main program creates three pairs of multisets using float arrays that store how many times each element appears.

Main program passes A and B to the `Functions` class.

Functions class then does the following:

For each position in the arrays:

- **Union:** Take the higher count from A and B.
- **Intersection:** Take the lower count from A and B.
- **Difference:** Subtract the count in B from A, but don't go below zero.
- **Sum:** Add the counts from A and B.
- Store the results in new arrays.
- Check if there are more positions to go through.
- If yes, repeat.
- If no, return the results.

Main program prints the results of each multiset operation.

---

## Part 3 - Fuzzy Sets

Main program creates two pairs of fuzzy sets using float arrays with values between 0.0 and 1.0.

Each position represents an element and its degree of membership.

- `0.0` means the element is not in the set.
- `1.0` means the element has full membership.
- Values between `0.0` and `1.0` mean partial membership.

Main program passes the two arrays to the `Functions` class.

Functions class then does the following:

For each position in the arrays:

- **Complement:** Subtract the membership value in A from 1.
- **Union:** Take the higher membership value from A and B.
- **Intersection:** Take the lower membership value from A and B.
- Store the results in new arrays.
- Check if there are more positions to go through.
- If yes, repeat.
- If no, return the results.

Main program prints the results of each fuzzy set operation.

---

## Testing

`FunctionsTest.java` creates different examples of ordinary sets, multisets, and fuzzy sets.

For each test:

1. Create the sets.
2. Decide what the correct result should be.
3. Run the operation using the `Functions` class.
4. Compare the actual result with the expected result.
5. Use a tolerance of `0.0001` for floating-point comparisons.
6. Check if the test passed or failed.

---

## Final Output

Main program prints to the console:

- Three pairs of ordinary sets and the results of the five required ordinary set operations.
- Two pairs of fuzzy sets and the results of complement, union, and intersection.
- Three pairs of multisets and the results of the four required multiset operations.

All results are labeled so it is easy to tell which operation was used.

