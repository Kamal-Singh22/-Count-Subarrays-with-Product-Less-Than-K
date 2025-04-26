# Count-Subarrays-with-Product-Less-Than-K
Given an array of positive integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
Approach: Sliding Window (Two Pointers)
Since the array contains positive integers, we can use a sliding window approach:

We maintain a window [start, end] where the product of elements is less than k.

If the product becomes ≥ k, we move start to the right until the product becomes < k.

For each valid window, the number of subarrays ending at end is (end - start + 1).

Time Complexity:
O(n) — where n is the length of the array.
