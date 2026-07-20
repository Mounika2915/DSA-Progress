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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>() ; 
        List<Integer> list = new ArrayList<>() ; 
        q.add(root) ; 
        //root.val = 0 ; 
        while(!q.isEmpty()){
            int size = q.size() ;  
            int sum = 0 ; 
            for(int i =  0 ; i < size ; i++){
                TreeNode curr = q.remove() ; 
                if(curr.left != null) {
                    q.add(curr.left ) ; 
                 }
                 if(curr.right != null){
                    q.add(curr.right) ; 
                 }
                 sum += curr.val ; 
            }
            list.add(sum) ; 
        }
        int j = 1 ; 
        q.clear() ; 
        q.add(root) ; 
        root.val = 0 ; 
        while(!q.isEmpty()){
            int size = q.size() ; 
            
            for(int i =  0 ; i < size ; i++){
                TreeNode curr = q.remove() ; 
                int sum = 0 ; 
                if(curr.left != null) {
                   
                    sum += curr.left.val ;  
                 }
                 if(curr.right != null){
                    
                    sum += curr.right.val ; 
                 }
                 int diff = list.size() > j ? list.get(j) - sum : -1; 
                 if(curr.left != null){
                    curr.left.val = diff ; 
                     q.add(curr.left ) ;
                 }
                 if(curr.right != null){
                    curr.right.val = diff;
                    q.add(curr.right) ; 
                 }
                 
             }
             j++;
           
        }
        return root ; 
    }
}