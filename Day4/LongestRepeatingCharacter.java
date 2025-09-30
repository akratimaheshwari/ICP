package Day4;

public class LongestRepeatingCharacter {
    public static void main(String[] args){
        String s = "AABAAB";
        int k= 2;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {
        int l=0,r=0,maxCount =0;
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int[] freq = new int[26];

        while(r<n){
            char c = s.charAt(r);
            freq[c-'A']++;

            maxCount = Math.max(maxCount,freq[c-'A']);

            //invalid
            while((r-l+1)-maxCount>k){
                char left = s.charAt(l);
                freq[left-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
