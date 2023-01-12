package com.examples.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountSpecialSubStr {
    

    // public static long substrCount(int n, String s) {
    // }
    
    public static boolean isSpecial(String str){
        if(str.length()==1)
            return true;
        else { 
            Set cset = new HashSet<> (Arrays.asList(str.toCharArray()));
            if(cset.size()==1)
                return true;
            else {
                for (int i = 0; i < str.length()/2; i++) {
                    if(str.charAt(i)!=str.charAt(str.length()-i-1) )
                        return false;
                }
                return true;
            }
        }
    }

    public static void main(String[] args) {
        String temp = "acbaa";
        // Stream s = Stream.of(temp.toCharArray());
        // System.out.println(s.count());
        Stream.of(temp.toCharArray()).collect(Collectors.toSet());
        System.out.println(isSpecial(temp));
    }
}
