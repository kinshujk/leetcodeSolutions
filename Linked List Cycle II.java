public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        do
        {
            if(fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        }while(slow != fast);
        
        ListNode intersection = slow;
        slow = head;
        
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
