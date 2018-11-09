/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA; ListNode b = headB;
        while(headA != null) {
            while(headB != null) {
                if(headA != headB) headB = headB.next;
                else return headA;
            }
            headB = b;
            headA = headA.next;
        }
        return null;
    }
}




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA; ListNode b = headB;
        int lengthA = 0; int lengthB = 0;
        
        while(headA != null) {
            lengthA++;
            headA = headA.next;
        }
        headA = a;
        
        while(headB != null) {
            lengthB++;
            headB = headB.next;
        }
        headB = b;
        
        while(lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }
        
        while(lengthA < lengthB) {
            headB = headB.next;
            lengthB--;
        }
        
        while(headA != null) {
            if(headA == headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return headA;
        
    }
}




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode a = headA; 
        ListNode b = headB;
        
        while(a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        
        return a;
    }
}