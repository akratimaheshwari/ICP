import java.util.Stack;

public class RemoveAllAdjacentDuplicates1209 {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(char c :s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch == c){
                st.peek().count++;
                if(st.peek().count==k) st.pop();
            }
            else{
                st.push(new Pair(c,1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            sb.append(String.valueOf(p.ch).repeat(p.count));
        }

        return sb.toString();
    }
    static class Pair {
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
            }
        }
    
}
