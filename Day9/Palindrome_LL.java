import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Stack;

public class Palindrome_LL {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;
        while(curr !=null){
            st.push(curr.val);
            curr = curr.next;
        }
        while(head !=null){
            if(head.val !=st.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
