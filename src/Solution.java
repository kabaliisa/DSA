public class Solution {
    public static void main(String[] args) {
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(0);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(1);
        nodeTwo.next = nodeThree;
        ListNode nodeFour = new ListNode(0);
        nodeThree.next = nodeFour;
        ListNode nodeFive = new ListNode(1);
        nodeFour.next = nodeFive;
        ListNode nodeSix = new ListNode(0);
        nodeFive.next = nodeSix;

        System.out.println(getDecimalValue(nodeOne));
    }
    public static int getDecimalValue(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println(prev);
        return convertToDecimal(prev);

    }

    private static int convertToDecimal(ListNode head) {
        ListNode current = head;
        int sum =0;
        int power =0;
        while(current != null){
            sum += current.val * Math.pow(2,power++);
            current = current.next;
        }
        return sum;

    }
}