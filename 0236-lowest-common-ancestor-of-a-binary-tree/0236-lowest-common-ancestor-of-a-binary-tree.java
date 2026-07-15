/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean findNode(TreeNode root , TreeNode p , ArrayList<TreeNode> list){
        if(root == null){
            return false ; 
        }
        
        list.add(root) ; 
        if(root == p){
            return true ; 
        }
        if(findNode(root.left , p , list) || findNode(root.right , p , list)){
            return true ; 
        } 
        list.remove(list.size()-1) ; 
        return false ; 
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> pList = new ArrayList<>() ; 
        findNode(root , p , pList) ; 
 
        ArrayList<TreeNode> qList = new ArrayList<>() ; 
        findNode(root , q, qList) ; 
        TreeNode ans = null ; 
        for(int i = 0 ; i < pList.size() && i < qList.size() ; i++){
            if(pList.get(i).val == qList.get(i).val){
                ans = pList.get(i);
            }
        }
        return ans ; 
    }
}