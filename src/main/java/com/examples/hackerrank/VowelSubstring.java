package com.examples.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelSubstring {
    


    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

     public static String findSubstring(String s, int k) {
        // Write your code here
            String notfound = "Not found!";
            String result ="";
            Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','o','u','i'));
            int maxVowelsCount =0;
            int maxCount=0;
            for(int i=0; i<s.length()-k+1; i++) {      
                maxVowelsCount=0;                                      
                StringBuilder sb = new StringBuilder();
                for(int j =0; j<k ; j++) {                                        
                    sb.append(s.charAt(i+j));
                    if(vowels.contains(s.charAt(i+j))) {
                        maxVowelsCount+=1;
                    }   
                }
                if(maxVowelsCount==k) {
                    return sb.toString();
                }
                if(maxVowelsCount>maxCount) {
                    maxCount=maxVowelsCount;
                    result = sb.toString();
                }
            }
            if(maxCount>0) 
                return result;
            else
                return notfound;
        }

        public static void main(String[] args) {
            String str = "azerdii";
            String result = findSubstring(str, 5);
            System.out.println(result);
            
            // System.out.println(String.valueOf(new char[]{str.charAt(0),str.charAt(2)}));
        }
}
