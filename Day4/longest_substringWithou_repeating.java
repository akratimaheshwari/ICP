package Day4;
import java.util.*;
public class longest_substringWithou_repeating {
    public static void main(String[] args){
        String  s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0,r=0;
        int len =0;
        while(r<s.length()){
            char c= s.charAt(r);
            if(!set.contains(c)){
                set.add(c);
                len = Math.max(len,r-l+1);
                r++;
            }
            else{
                char ch = s.charAt(l);
                set.remove(ch);
                l++;
            }
            
        }
        return len;
    }
}
    

