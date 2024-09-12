public class Solution  
{
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;
        // Iterate through both strings while both have characters
        while (i < word1.length() || j < word2.length())
         {
            if (i < word1.length())
             {
                mergedString.append(word1.charAt(i)); // Append from word1
                i++;
            }
            if (j < word2.length()) {
                mergedString.append(word2.charAt(j)); // Append from word2
                j++;
            }
        }
        return mergedString.toString();
    }
}
