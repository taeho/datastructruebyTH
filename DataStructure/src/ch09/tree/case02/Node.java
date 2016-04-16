package ch09.tree.case02;

/*
 * 이진트리 
 * 테스트
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%ACBinaryTree-%ED%8A%B8%EB%A6%AC-%EC%88%9C%ED%9A%8C%EB%B2%95%EC%A0%84%EC%9C%84%EC%A4%91%EC%9C%84%ED%9B%84%EC%9C%84-%EC%88%9C%ED%9A%8C%EB%B2%95
 * */

public class Node {
	private char data;
	private Node left;
	private Node right;
	
	public Node(char data){
		this.data = data;
	}
	
	public void setData(char data) {
		this.data = data;
	}
	public char getData() {
		return data;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getLeft() {
		return left;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getRight() {
		return right;
	}
}
