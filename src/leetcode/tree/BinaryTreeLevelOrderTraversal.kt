package leetcode.tree

import java.util.*

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {

        val result : MutableList<List<Int>> = mutableListOf()

        if (root == null) {
            return result
        }

        result.add(listOf(root.`val`))

        val queue = LinkedList<TreeNode>().apply {
            add(root)
        }

        while (queue.isNotEmpty()) {
            val list = mutableListOf<Int>()

            repeat(queue.size) {
                val node = queue.removeFirst()

                node.left?.let {
                    queue.add(it)
                    list.add(it.`val`)
                }

                node.right?.let {
                    queue.add(it)
                    list.add(it.`val`)
                }

            }

            if (list.isNotEmpty()) {
                result.add(list)
            }
        }

        return result
    }
}