package Day4;

public class PermutationOfString {
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "ebnbc";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        //first window
        for(int i=0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }
        if(matchs(freq1,freq2)) return true;

        for(int i= s1.length();i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;// add
            freq2[s2.charAt(i - s1.length()) - 'a']--;  // delete

            if(matchs(freq1,freq2)) return true;
        }
        return false;
    }
    public static boolean matchs(int[] freq1,int[] freq2){
        for(int i=0;i<26;i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}
