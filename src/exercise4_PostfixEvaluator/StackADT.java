package exercise4_PostfixEvaluator;

public interface StackADT<T> {

	/**
	 * Adds a new entry to the top of this stack.
	 * 
	 * @param newEntry
	 *            an object to be added to the stack
	 */
	public void push(T newEntry);

	/**
	 * Removes and returns this stack’s top entry.
	 * 
	 * @return either the object at the top of the stack or, if the stack is
	 *         empty before the operation, null
	 */
	public T pop();

	/**
	 * Retrieves this stack’s top entry.
	 * 
	 * @return either the object at the top of the stack or null if the stack is
	 *         empty
	 */
	public T peek();

	/**
	 * Detects whether this stack is empty.
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmptry();

	/** Removes all entries from this stack */
	public void clear();
}
