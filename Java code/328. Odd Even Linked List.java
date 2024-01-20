class Solution {
    public ListNode oddEvenList(ListNode head) {
    if(head==null)
       return head;
    ListNode o=head,e=head.next,p=e;      
        while(e!=null && e.next!=null){
            o.next=e.next;
            o=o.next;
            e.next=o.next;
            e=e.next;
        }
        o.next=p;
        return head;
    }
}
