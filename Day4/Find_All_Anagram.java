package Day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Anagram {
    public static void main(String[] args){
         String s = "cbaebbcd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);
        for(int i:result){
             System.out.println(i);
        }
    }
   
    public static List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l=0,r= 0;
        int valid=0;
        HashMap<Character,Integer> seen = new HashMap<>();
        while(r<s.length()){
            char ch = s.charAt(r);
            r++;
            // expand
            if(map.containsKey(ch)){
                seen.put(ch,seen.getOrDefault(ch,0)+1);
                if(seen.get(ch).intValue()==map.get(ch).intValue()){
                    valid++;
                }
            }
            //shrink
            while(r-l>=p.length()){
                if(valid==map.size()){
                    res.add(l);
                   
                }
                char leftChar = s.charAt(l);
                 l++;
                if (map.containsKey(leftChar)) {
                    if (seen.get(leftChar).intValue() == map.get(leftChar).intValue()) {
                        valid--; // only reduce valid if we break a match
                    }
                    seen.put(leftChar, seen.get(leftChar) - 1);
                }
            }

            
        }
        return res;
    }
}

