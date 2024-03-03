class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode list=new ListNode(-1);
    list.next=head;
    ListNode first=list;
    ListNode second=list;
    for(int i=0;i<n;i++){
      second=second.next;
    }
    while(second.next!=null){
      first=first.next;
      second=second.next;
    }
    first.next=first.next.next;
    return list.next;
    }
}
