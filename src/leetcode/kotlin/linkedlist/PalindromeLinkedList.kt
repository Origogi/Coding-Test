package leetcode.string

import leetcode.linkedlist.ListNode

private class Solution {
    fun isPalindrome(head: ListNode?): Boolean {

        var slower = head
        var faster = head

        var half : ListNode? = null

        while (faster?.next != null) {
            slower = slower?.next
            faster = faster?.next?.next
        }


        var current = head
        var halfCurrent = reverseList(slower)

        while (halfCurrent != null) {
            if (current?.`val` != halfCurrent?.`val`) {
                return false
            }

            current = current?.next
            halfCurrent = halfCurrent?.next
        }

        return true

    }

    fun reverseList(head: ListNode?): ListNode? {

        var reverseHead : ListNode? = null

        var current = head

        while (current != null) {
            val nextNode = current?.next
            current?.next = reverseHead
            reverseHead = current
            current = nextNode

        }
        return reverseHead
    }
}