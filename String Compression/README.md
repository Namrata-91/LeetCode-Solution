# String Compression
Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of __consecutive repeating characters__ in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s __should not be returned separately,__ but instead, be stored __in the input character array chars.__ Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done __modifying the input array,__ return the new length of the __array.__

You must write an algorithm that uses only constant extra space.

 

__Example 1:__

__Input:__ chars = ["a","a","b","b","c","c","c"]

__Output:__ Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

__Explanation:__ The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
