

class Solution {
    private void traversal(Node root , List<Integer> list){
        if(root == null){
            return ; 
        }
        for(Node curr : root.children){
            traversal(curr , list) ; 
        }
        list.add(root.val) ; 
    }
     
    public List<Integer> postorder(Node root) {

        List<Integer> list = new ArrayList<>() ; 
        if(root == null){
            return list ; 
        }
        traversal(root , list) ; 
        return list; 
    }
}















