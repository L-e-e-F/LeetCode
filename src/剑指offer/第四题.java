package 剑指offer;

import java.util.Stack;

public class 第四题 {
    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * 示例 1：
     *
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<Integer>  list = new Stack<Integer>();
            while(head != null){
                list.push(head.val);
                head = head.next;
            }
            int[] print = new int[list.size()];
            for(int i=0; i<print.length; i++){
                print[i] = list.pop();
            }
            return print;
        }
    }
}
