package ch09.tree.case01;

/*
 * 트리 
 * 테스트
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%ED%8A%B8%EB%A6%ACTree
 * */

public class Node {
	private char data;
	private Node leftChild;
	private Node rightSibling;
	
	public Node(char data){
		this.data = data;
	}
	
	public void setData(char data) {
		this.data = data;
	}
	public char getData() {
		return data;
	}
	
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	
	public void setRightSibling(Node rightSibling) {
		this.rightSibling = rightSibling;
	}
	public Node getRightSibling() {
		return rightSibling;
	}

}
