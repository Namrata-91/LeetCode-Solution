class Solution {
    public String reverseWords(String s) {

        // Trim leading and trailing spaces, and split by one or more spaces
        String[] words=s.trim().split("\\s+");

        // Reverse the array of words
        StringBuilder result= new StringBuilder();
        for(int i=words.length-1; i >= 0; i--)
        {
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
     return result.toString();
    }
}
