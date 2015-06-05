package exercise2_MatchingBrackets;

public class ClassForBrackectMethod {

	private ArrayStack<Character> stack;

	public ClassForBrackectMethod() {
		this.stack = new ArrayStack<Character>();
	}

	public boolean containsMatchingBrackets(String s) {

		boolean isMatching = true;
		char character = ' ';

		for (int i = 0; isMatching && (i < s.length()); i++) {
			character = s.charAt(i);
			switch (character) {
			case '(':
			case '[':
			case '{':
				stack.push(character);
				break;

			case ')':
			case ']':
			case '}':
				if (stack.isEmptry()) {
					isMatching = false;
				} else {
					char opening = stack.pop();
					isMatching = isPaired(opening, character);
				}
				break;
			default:
				break;
			}
		}
		if (!stack.isEmptry()) {
			isMatching = false;
		}
		return isMatching;
	}

	private static boolean isPaired(char open, char close) {
		return (open == '(' && close == ')') || (open == '[' && close == ']')
				|| (open == '{' && close == '}');
	}

}
