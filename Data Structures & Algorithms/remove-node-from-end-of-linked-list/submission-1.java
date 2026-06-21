/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> nodes = new ArrayList<>();

    ListNode curr = head;

    while (curr != null) {
        nodes.add(curr);
        curr = curr.next;
    }

    int nodeToDelete = nodes.size() - n;

    // deleting head
    if (nodeToDelete == 0) {
        return head.next;
    }

    int prevNode = nodeToDelete - 1;

    nodes.get(prevNode).next = nodes.get(nodeToDelete).next;

    return head;
    }
}
