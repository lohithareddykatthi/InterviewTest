package com.product.collections;

public class UseCase {
	
	
	public static void main(String[] args) {
		
		DoubleLinkedList<Integer> dll = new DoubleLinkedList<>();
		dll.addFirst(1);
		System.out.println("Printing after added ");
		dll.print();
		
		dll.add(1, 2);
		System.out.println("Printing after added at index 1 ");
		dll.print();
		
		dll.addLast(3);
		dll.addLast(4);
		dll.addLast(5);
		dll.addLast(6);
		dll.addLast(7);
		dll.addLast(8);
		System.out.println("Printing after added at last ");
		dll.print();
		
		dll.addFirst(9);
		dll.addFirst(10);
		dll.addFirst(11);
		
		System.out.println("Printing after added some element at first ");
		dll.print();
		dll.add(2, 12);
		dll.add(5, 13);
		System.out.println("Printing after added ");
		dll.print();
		dll.remove(1);
		System.out.println("Printing after removed at index 1 ");
		dll.print();
		
		dll.removeFirst();
		System.out.println("Printing after removed first element ");
		dll.print();
		
		dll.removeLast();
		System.out.println("Printing after removed at Last element ");
		dll.print();
		
		
	}

}
