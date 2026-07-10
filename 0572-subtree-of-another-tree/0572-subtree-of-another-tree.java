/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean isTrue = false ; 
    private void isContains(TreeNode root , TreeNode subRoot){
        if(isTrue){
            return ; 
        }
        if(root == null){
            return ; 
        }

        if(root.val == subRoot.val){
            isTrue = isSame(root , subRoot) ; 
        }

        isContains(root.left , subRoot) ; 
        isContains(root.right , subRoot) ; 
        
    }
    private boolean isSame(TreeNode root,  TreeNode sub){
        if(root == null && sub == null){
            return true ; 
        }
        if(root == null || sub == null){
            return false ; 
        }

        if(root.val != sub.val){
            return false; 
        }
        return isSame(root.left , sub.left) && isSame(root.right , sub.right) ; 
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        isTrue = false ; 
        isContains(root , subRoot) ;
        return isTrue ; 
    }
}