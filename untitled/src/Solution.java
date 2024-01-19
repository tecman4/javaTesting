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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        int stNum1 = 0;
        int stNum2 = 0;
        while(l1.next!=null){
            stack1.push(l1.val);
            stNum1+=l1.next;
        }
        while(l2.next!=null){
            stack2.push(l2.val);
            stNum2+=l2.next;
        }
        for (int st1 :stack1){
            stNum1+=l1.pop;
        }
        for (int st2 :stack1){
            stNum2+=l2.pop;
        }
        System.out.println(stNum1+stNum2);



    }
}
