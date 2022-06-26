package leetcode.linkedlist

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