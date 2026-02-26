# Two Pointer Technique

## 📌 What is Two Pointer?
Two pointer is an approach where we use two indices to traverse an array (or list) instead of using nested loops.

It helps reduce time complexity from **O(n²) → O(n)**.

---

## 🧠 When should we think of Two Pointer?

You should immediately think of two pointer when:

### 1. Array is Sorted
- If problem says "sorted array" → Strong hint
- Example:
  - Find pair with given sum
  - Remove duplicates
  - Merge sorted arrays

👉 Sorted array + pair problem = Two Pointer

---

### 2. Finding Pair / Triplet
- Two numbers sum = target
- Three numbers sum = target

👉 Replace nested loop with two pointer

---

### 3. Need to Reduce Time Complexity
- Brute force: O(n²)
- Required: O(n)

👉 Two pointer often optimizes this

---

### 4. Working from Both Ends
- Palindrome checking
- Container with most water
- Trapping rain water

👉 Use left and right pointer

---

### 5. Subarray / Continuous Segment Problems
- Sliding window (variation of two pointer)

---

## 🔥 How to Identify in Interview?

If you see:
- "Find pair"
- "Sorted array"
- "Target sum"
- "Minimize / maximize something"
- "Continuous segment"

👉 Try Two Pointer

---

## ⚙️ Basic Pattern

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int sum = arr[left] + arr[right];

    if (sum == target) {
        // found answer
    } else if (sum < target) {
        left++;  // increase sum
    } else {
        right--; // decrease sum
    }
}
