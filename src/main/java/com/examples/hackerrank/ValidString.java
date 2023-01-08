package com.examples.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidString {
    
    public static String isValid(String s) {
        // Write your code here
            // create a-z map to store frequencies of each character
            Map<Character, Integer> asciimap = new HashMap<>();
            //s.chars().map(x->asciimap.put(x, arg1))
            for(int i=0; i<s.length(); i++) {
                int count = !asciimap.containsKey(s.charAt(i)) ? 1 : (asciimap.get(s.charAt(i))+1);         
                asciimap.put(s.charAt(i), count);
            }

            Set<Integer> values = asciimap.values().stream().collect(Collectors.toSet());            

            if(values.size()>2){
                return "NO";
            }if (values.size()==1){
                return "YES";
            } if(values.size()==2) {
                Integer[] valueArray = values.stream().toArray(Integer[]::new);
                if(Math.abs(valueArray[0]-valueArray[1])>1)
                    return "NO";
                else {
                    List<Integer> valuelist = asciimap.values().stream().collect(Collectors.toList());
                    Map<Integer,Long> map2 = valuelist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                    Boolean one = false;
                    for (Map.Entry<Integer,Long> el : map2.entrySet()) {
                        if(el.getValue()==1l)
                            one=true;
                    }
                    if(!one)
                        return "NO";
                }
            }

            // if(values.size()==0 || values.size()==1)
            //     return "YES";
            // else if (values.size()>2)
            //     return "NO";
            // else {

            // }

            // boolean oneChance = false;            
            // if(asciimap.size()>0){
            //     int firstCount = asciimap.get(asciimap.keySet().toArray()[0]);
            //     for (Map.Entry<Character,Integer> item : asciimap.entrySet()) {
            //         if(item.getValue()!=firstCount && oneChance){
            //             return "NO";
            //         }
            //         else if (item.getValue()!=firstCount && !oneChance){
            //             oneChance=true;
            //         }
            //         firstCount=item.getValue();
            //     }
            // }
            // return "YES";

            // int oneDifference = 0; 
            // int commonFreq=0;
            // if (asciimap.size()>0) {
            //     Character firstKey = (Character) asciimap.keySet().toArray()[0];
            //     commonFreq = asciimap.get(firstKey);
            // }
                            
            // for(Entry<Character, Integer> item: asciimap.entrySet()) {
            //     if(Math.abs(item.getValue()-commonFreq)>1)
            //         return "NO";
            //     else if(Math.abs(item.getValue()-commonFreq)>1 && oneDifference==0)
            //         oneDifference+=1;
            //     else if (Math.abs(item.getValue()-commonFreq)>1 && oneDifference>0)
            //         return "NO";
            //     else 
            //         continue;    
            // }
            // return oneDifference>1 ? "NO" : "YES";
            return "YES";
        }
    

        public static void main(String[] args) {
            String str = "aabbcd";
            System.out.println(isValid(str));
        }
}
