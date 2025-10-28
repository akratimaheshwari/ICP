import java.util.ArrayDeque;

public class AsteriodCollision {
    
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0;i< asteroids.length;i++){
            boolean flag = false;
            while(!st.isEmpty() && st.peek()>0 &&  asteroids[i]<0){
               
                if( Math.abs(asteroids[i])>st.peek()){
                    st.pop();
                }
                else if(Math.abs(asteroids[i])==st.peek()){
                st.pop();
                flag = true;
                break;
                }
                else{
                    flag = true;

                    break;

                }
            }
            if(!flag){
                st.push(asteroids[i]);
            }
        }
        int[] res = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
}

