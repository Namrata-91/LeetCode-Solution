# Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

__Example 1:__

__Input__: str1 = "ABCABC", str2 = "ABC"
__Output:__ "ABC"

__Solution__

str1 + str2 equals "ABCABCABC", and str2 + str1 also equals "ABCABCABC".
The GCD of the lengths of str1 (6) and str2 (3) is 3.
The result is the substring "ABC", which is the largest common divisor string.

__Time Complexity:__
The time complexity of the solution is O(n + m), where n and m are the lengths of str1 and str2, respectively. This comes from string concatenation and the Euclidean algorithm for GCD calculation.
