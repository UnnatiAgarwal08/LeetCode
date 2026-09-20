class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode start = dummy;
        
        while (start.next != null) {
            
            if (start.next.val == val) {
                start.next = start.next.next;
            } 
            else {
                start = start.next;
            }
        }
        
        return dummy.next;
    }
}