package leetcode.linkedlist

fun hasCycle(head: ListNode?): Boolean {
    var faster = head
    var slower = head

    while (faster?.next?.next != null) {
        faster = faster?.next?.next
        slower = slower?.next

        if (faster == slower) {
            return true
        }
    }
    return false
}