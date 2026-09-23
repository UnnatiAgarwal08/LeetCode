class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return ;

        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.next;
        }
        int n=st.size();
        ListNode current=head;
        for(int i=0;i<n/2;i++)
        {
            ListNode last=st.pop();
            last.next=current.next;
            current.next=last;

            current=last.next;
        }
        current.next=null;
    }
}