class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        PriorityQueue <ListNode> q = new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        for(int i=0 ; i<lists.length ; i++){
            ListNode head = lists[i];
            if(head != null) q.add(head);
        }
        while(q.size()>0){
            ListNode curr = q.poll();
            temp.next = curr;
            temp = temp.next;
            if(curr.next != null) q.add(curr.next);
        }
        return dummy.next;
    }
}