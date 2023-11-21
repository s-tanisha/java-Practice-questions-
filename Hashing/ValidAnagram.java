/*Given two strings. The task is to check whether the given strings are anagrams 
of each other or not. An anagram of a string is another string that contains the same 
characters, only the order of characters
 can be different. For example, “abcd” and “dabc” are an anagram 
of each other. */

import java.util.*;

public class ValidAnagram {
    public static boolean ISvalid(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> check = new HashMap<>();

        for(Character C: str1.toCharArray()){
                check.put(C, check.getOrDefault(C, 0) + 1);
            }
        
        for(Character S: str2.toCharArray()){
            if(check.containsKey(S)){
                check.put(S, check.get(S)-1);
            }else{
                // System.out.println("S");
                return false;
            }
        }
        
        for(int count : check.values()){
            
            if(count!= 0){
                //  System.out.println("0");
                return false;
            }
        }
        return true;

    }
    public static void main(String []s){
        String str1= "listent";
        String str2 = "silentt";

        if(ISvalid(str1, str2)){
            System.out.println("The string is a valid anagram");

        }else{
            System.out.println("The string is not anagram");
        }
    }
}
