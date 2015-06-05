package exercise1_ArrayStack_AND_LinkedStack;

public class ArrayStack<T> implements StackADT<T> {

	private T[] array;
	private int count;
	private static int DEFAULT_CAPACITY = 100;

	public ArrayStack() {
		array = (T[]) new Object[DEFAULT_CAPACITY];
		this.count = 0;
	}

	public ArrayStack(int capacity) {
		array = (T[]) new Object[capacity];
		this.count = 0;
	}

	@Override
	public void push(T newEntry) {
		if (count == array.length) {
			this.expandCapcity();
		}
		array[count] = newEntry;
		count++;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			return null;
		}

		T temp = array[count - 1];
		array[count - 1] = null;
		count--;

		return temp;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		}

		T temp = array[count - 1];
		return temp;

	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void clear() {
		for (int i = count - 1; i <= 0; i--) {
			array[i] = null;
		}
		count = 0;
	}

	public void expandCapcity() {
		T[] temp = (T[]) new Object[DEFAULT_CAPACITY * 2];

		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}

		array = temp;
	}

}
