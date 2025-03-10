 //T(N)=O(N)
//S(N)=O(1)

class Solution {
    int gl=0;	// Global Sum
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return gl;
        
    }
    
    public void helper(TreeNode root, int val)
    {
        //Base
        if(root==null) return;
        
        val=val*10+root.val;
        if(root.left==null&&root.right==null) gl+=val;	//if leaf Update the Sum
        
        helper(root.left,val);	//Left Tree
        helper(root.right,val); 	//Right Tree
        
        
        
        
        //Logic
    }
}