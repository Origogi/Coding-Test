package leetcode.linkedlist

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {

    var mergedListHead : ListNode? = null

    var currentL1 = l1
    var currentL2 = l2

    if (currentL1 == null) {
        return currentL2
    } else if (currentL2 == null) {
        return currentL1
    } else {
        if (currentL1?.`val` < currentL2?.`val`) {
            mergedListHead = currentL1
            currentL1 = currentL1?.next
        } else {
            mergedListHead = currentL2
            currentL2 = currentL2?.next
        }
    }

    var current = mergedListHead

    while (currentL1 != null && currentL2 != null) {

        if (currentL1?.`val` < currentL2?.`val`) {
            current?.next = currentL1
            currentL1 = currentL1?.next
        } else {
            current?.next = currentL2
            currentL2 = currentL2?.next
        }

        current = current?.next
    }

    if (currentL1 == null) {
        current?.next = currentL2
    } else {
        current?.next = currentL1
    }

    return mergedListHead
}