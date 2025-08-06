// Problem Link : https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i=arr.length-1 ; i>=0 ; i--) {

            if(arr[i].length() == 0) continue;

            result.append(arr[i]);

            result.append(" ");
        }

        return result.toString().trim();
        
    }
}
