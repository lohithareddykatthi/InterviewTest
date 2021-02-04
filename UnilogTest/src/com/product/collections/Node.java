package com.product.collections;

public class Node<T> {
	
	T data;
	Node<T> previous;
	Node<T> next;
	
	public Node(T data){
		this.data=data;
	}
}
