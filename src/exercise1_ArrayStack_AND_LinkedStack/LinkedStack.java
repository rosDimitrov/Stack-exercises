package exercise1_ArrayStack_AND_LinkedStack;

public class LinkedStack<T> implements StackADT<T> {

	private Node<T> firstNode;

	public LinkedStack() {
		firstNode = null;
	}

	@Override
	public void push(T newEntry) {
		Node<T> newNode = new Node<T>(newEntry);
		newNode.next = firstNode;
		firstNode = newNode;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		}

		Node<T> temp = firstNode;

		firstNode = firstNode.next;
		return temp.data;

	}

	@Override
	public T peek() {
		T first = null;
		if (firstNode != null) {
			first = firstNode.getData();
		}
		return first;
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null;
	}

	@Override
	public void clear() {
		firstNode = null;
	}

	private static class Node<T> {
		private T data; // entry in bag
		private Node<T> next; // link to next node

		public Node(T data) {
			this(data, null);
		}

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public Node<T> getNext() {
			return next;
		}
	}

}
