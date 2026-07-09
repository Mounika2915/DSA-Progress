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
    boolean isTrue = true ; 
    private int check(TreeNode root){
        if(root == null){
            return 0 ; 
        }
        // if(!isTrue ){
        //     return ; 
        // }
        int l = check(root.left) ; 
        int r = check(root.right) ;
        if(Math.abs(r - l ) > 1) {
            isTrue = false ; 
        }

        return Math.max(l , r) + 1 ; 
    }
    public boolean isBalanced(TreeNode root) {
        isTrue = true ; 
        if(root == null){
            return true ; 
        }
        check(root) ; 
        return isTrue ; 
    }
}