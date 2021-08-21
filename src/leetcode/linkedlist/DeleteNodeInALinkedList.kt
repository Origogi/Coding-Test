package leetcode.linkedlist

class ListNode(var `val`: Int?) {
    var next: ListNode? = null
}

fun deleteNode(node: ListNode?) {
    node?.`val` = node?.next?.`val`
    node?.next = node?.next?.next
}