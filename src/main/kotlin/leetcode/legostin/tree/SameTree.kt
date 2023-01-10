package leetcode.legostin.tree

import leetcode.legostin.model.TreeNode

class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }
        if (p == null || q == null) {
            return false
        }
        if (p.value == q.value) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
        return false
    }
}
