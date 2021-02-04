package com.product.collections;

import java.util.LinkedList;

public class DoubleLinkedList<T> {

	public Node<T> head;

	public void addFirst(T data) {

		Node<T> newNode = new Node<>(data);
		newNode.previous = null;
		newNode.next = head;

		if (head != null) {
			head.previous = newNode;
		}
		head = newNode;
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.next = null;
		if (head == null) {
			newNode.previous = null;
			head = newNode;
			return;
		}
		Node last = head;

		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.previous = last;
	}

	public void add(int index, T data) {
		Node<T> prevNode = head;
		if (prevNode != null) {
			if (prevNode.next != null) {
				for (int i = 0; i < index-1; i++) {
					prevNode = prevNode.next;
				}
			}
		} else {
			throw new IndexOutOfBoundsException();
		}

		Node<T> newNode = new Node<>(data);
		newNode.next = prevNode.next;
		newNode.previous = prevNode;
		prevNode.next = newNode;

		if (newNode.next != null)
			newNode.next.previous = newNode;
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Please add atleast one element");
			return;
		}
		if (head.next != null) {
			head.next.previous = null;
		}
		head = head.next;
	}

	public void removeLast() {
		if (head == null) {
			System.out.println("Please add atleast one element");
			return;
		}
		Node<T> last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.previous.next = null;
	}

	public void remove(int index) {
		if (head == null) {
			System.out.println("Please add atleast one element");
			return;
		}
		Node<T> node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		node.previous.next = node.next;
		node.next.previous = node.previous;
	}

	public T get(int index) {
		Node<T> node = head;
		for (int i = 0; i <= index; i++) {
			node = node.next;
		}
		return node.data;
	}

	public void print() {
		Node<T> node = head;
		System.out.println("=========================");
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println("=========================");
	}
}
