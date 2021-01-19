package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}


	private Node last;
	private int i;

	/**
	 * Dodaje element na koniec listy
	 * @param i wartość elementu, który zostanie dodany na koniec listy
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Sprawdza czy lista jest pusta
	 * @return true jeżeli lista jest pusta, w przeciwnym wypadku false
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * Sprawdza, czy lista jest pełna
	 * @return true jeżeli lista jest pełna, w przeciwnym wypadku false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Zwraca wartość elementu znajdującego się na końcu listy
	 * @return wartość ostatniego elementu na liście
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	/**
	 * Usuwa ostatni element z listy
	 * @return wartość usuwanego elementu listy
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
