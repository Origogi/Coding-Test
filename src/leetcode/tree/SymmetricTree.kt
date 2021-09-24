package leetcode.tree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

private class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return checkSymmetric(root, root)
    }

    fun checkSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null || right == null) {
            return left == right
        }

        return left.`val` == right.`val` &&
                checkSymmetric(left.left, right.right) &&
                checkSymmetric(left.right, right.left)
    }
}