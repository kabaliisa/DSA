public class Reverse {

    public static void main(String[] args) {
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(4);
        nodeThree.next = nodeFour;
        ListNode nodeFive = new ListNode(5);
        nodeFour.next = nodeFive;

        Solution2 sol = new Solution2();

        System.out.println(sol.reverseList(nodeOne));
    }

}



class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }
}
