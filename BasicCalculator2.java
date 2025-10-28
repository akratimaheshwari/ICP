import java.util.Stack;

public class BasicCalculator2 {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
      int ans = 0;
      int currno = 0;
      int op = '+';
      for(int i =0;i<s.length();i++){
        char c= s.charAt(i);
        if(Character.isDigit(c)){
            currno = currno*10+(c-'0');
        }
        if((!Character.isDigit(c) && c!=' ' )|| i==s.length()-1){
            if (op=='+'){
                    st.push(currno);
                    currno=0;
                }
                else if (op=='-'){
                    st.push(currno*-1);
                    currno=0;
                }
                else if (op=='*'){
                    st.push(st.pop()*currno);
                    currno=0;
                }
                else if (op=='/'){
                    st.push(st.pop()/currno);
                    currno=0;
                }
                op = c;
        }
            
      }

      int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum; 
    }
}
