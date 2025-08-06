//Problem Link : https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {

    // This can also be used to check vowel

    // public boolean isVowel(char ch) {

    //     String s = "aeiouAEIOU";

    //     if(s.indexOf(ch) == -1) return false;

    //     return true;
    // }

    public boolean isVowel(char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
 
        return false;
    }

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;

        int right = arr.length - 1;

        while(left < right) {

            while(left < right && isVowel(arr[left]) == false) left++;

            while(left < right && isVowel(arr[right]) == false) right--;

            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;

            right--;
        }

        return new String(arr);
        
    }
}
