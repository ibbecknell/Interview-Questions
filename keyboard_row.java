//Given a List of words, return the words that can be typed 
//using letters of alphabet on only one row's of American 
//keyboard.

// Example 1:
// Input: ["Hello", "Alaska", "Dad", "Peace"]
// Output: ["Alaska", "Dad"]

// Note:
// You may use one character in the keyboard more than once.
// You may assume the input string will only contain letters of alphabet.

public class Solution {
    String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
    String[] result;

    public String[] findWords(String[] words) {
        int i = 0;
        String[] temp = new String[words.length];
        
        for(String s : words){
            
            if(checkWord(s, keyboard[0]) || checkWord(s, keyboard[1]) || checkWord(s, keyboard[2])){
               temp[i] = s;
               i++;
            } 
            
        }
        
        result = new String[i];
        for(int j = 0; j < i; j++){
            result[j] = temp[j];
        }
        return result;
    }
    
    public boolean checkWord(String s1, String ks){
        for(int i = 0; i < s1.length(); i++){
            
            if(ks.indexOf(s1.toLowerCase().charAt(i)) == -1){
                return false;
            }
            
        }
        return true;
    }
    
    
}