class Solution {
     Map<Node,Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
         if(head==null)
          return null;
        Node t=new Node(head.val);
        map.put(head,t);
        t.next=copyRandomList(head.next);
        t.random=map.get(head.random);
        return t;   
    }
}
