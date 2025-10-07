import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Stack;

public class Reorder_list {
    public void reorderList(ListNode head) {
        
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        int len =0;
        while(curr != null){
            st.push(curr);
            curr = curr.next;
            len++;
        }
        curr = head;
        for(int i=0;i<len/2;i++){
            ListNode tail = st.pop();
            ListNode next = curr.next;
            curr.next = tail;
            tail.next = next;
            curr = next;
        }
        curr.next = null;    
        
    }
}
