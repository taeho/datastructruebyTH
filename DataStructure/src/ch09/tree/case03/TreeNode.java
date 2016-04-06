package ch09.tree.case03;

/*
 * 이진탐색트리 bst
 * http://songeunjung92.tistory.com/31
 * 
 * */

public class TreeNode {
	char data;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(){
        this.left = null;
        this.right = null;
    }
    
    public TreeNode(char data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public Object getData(){
        return data;
    }
	
}
