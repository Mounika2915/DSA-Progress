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
    private void reverse(List<TreeNode> list){
        int i = 0 , j = list.size()-1 ; 
        while(i < j){
            int temp = list.get(i).val ;
            list.get(i).val = list.get(j).val ; 
            list.get(j).val = temp ; 
            i++;
            j--;
        }
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode head = root ; 
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return root ; 
        }
        q.add(root) ; 
        int level = 0 ; 
        while(!q.isEmpty()){
            int size = q.size() ; 
            List<TreeNode> list = new ArrayList<>(); 
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = q.remove() ; 
                if(level %2 != 0){
                    list.add(curr) ; 
                }
                if(curr.left != null){
                    q.add(curr.left) ; 
                }
                if(curr.right != null){
                    q.add(curr.right) ; 
                }
            }
            if(level % 2 != 0){
                reverse(list) ;
                list.clear() ; 
            }
            level++;
        }
        return head ; 
    }
}