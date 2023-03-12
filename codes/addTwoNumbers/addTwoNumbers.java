class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode currNode = answer;
        int carry = 0;
        while (true) {
            Integer sum = carry;
            carry = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (sum >= 10) {
                sum -= 10;
                carry = 1;
            }
            currNode.val = sum;
            if (l1 == null && l2 == null & carry == 0) {
                break;
            }
            currNode.next = new ListNode();
            currNode = currNode.next;
        }
        return answer;
    }
}
