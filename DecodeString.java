import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<StringBuilder> curr = new Stack<>();
        Stack<Integer> count = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int k =0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10 +(c-'0');
            }
            else if(c=='['){
                count.push(k);
                curr.push(sb);
                sb = new StringBuilder();
                k=0;

            }
            else if(c==']'){
                StringBuilder decoded =curr.pop();
                int repeat = count.pop();
                while (repeat-- > 0) decoded.append(sb);
                sb = decoded;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
