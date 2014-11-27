package validateBST;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
public class Solution {
    public boolean isValidBST(TreeNode root) {
    	if (root == null) 
    		return true;
        return (isValidBST(root.left) && isValidBST(root.right) && compThreeNodes(maxNode(root.left), minNode(root.right), root));
    }
    
    TreeNode maxNode(TreeNode root){
    	if (root != null)
    		if (root.right != null)
    			return maxNode(root.right);
    		else
    			return root;
    	return null;
    }
    
    TreeNode minNode(TreeNode root){
    	if (root != null)
    		if (root.left != null)
    			return minNode(root.left);
    		else
    			return root;
    	return null;
    }
    
    boolean compThreeNodes(TreeNode left, TreeNode right, TreeNode mid){
    	boolean val = true;
    	if(left != null && mid != null)
    		val = val && (left.val < mid.val);
    	if(right != null && mid != null)
    		val = val && (mid.val < right.val);
    	if(left != null && right != null)
    		val = val && (left.val < right.val);
    	return val;
    }
}