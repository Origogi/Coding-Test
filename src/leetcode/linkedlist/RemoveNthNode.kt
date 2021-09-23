package leetcode.linkedlist

private class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        var tail = head
        var targetPrev = head

        repeat(n) {
            tail = tail?.next
        }

        while (tail?.next != null) {
            tail = tail?.next
            targetPrev = targetPrev?.next
        }

        if (tail == null) {
            return head?.next
        }

        targetPrev?.next = targetPrev?.next?.next
        return head

    }
}