package exercise4_PostfixEvaluator;

public class PostfixEvaluator {

	public static void main(String[] args) {

		int result = PostfixEvaluator.evaluate("24+5+");
		System.out.println(result);
	}

	public static int evaluate(String s) {

		ArrayStack<Character> stack = new ArrayStack<Character>();

		int result = -1;
		int first;
		int second;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				switch (c) {
				case ('0'):
				case ('1'):
				case ('2'):
				case ('3'):
				case ('4'):
				case ('5'):
				case ('6'):
				case ('7'):
				case ('8'):
				case ('9'):
					stack.push(c);
					break;
				case ('+'):
					second = Integer.parseInt("" + stack.pop());
					first = Integer.parseInt("" + stack.pop());
					stack.push((char) (first + second));
					break;
				case ('-'):
					second = Integer.parseInt("" + stack.pop());
					first = Integer.parseInt("" + stack.pop());
					stack.push((char) (second - first));
					break;
				case ('/'):
					second = Integer.parseInt("" + stack.pop());
					first = Integer.parseInt("" + stack.pop());
					stack.push((char) (second / first));
					break;
				case ('*'):
					second = Integer.parseInt("" + stack.pop());
					first = Integer.parseInt("" + stack.pop());
					stack.push((char) (first * second));
					break;

				// int tempResult = first + currentChar + second;
				// stack.push(tempResult);

				default:
					break;
				}
			}

		}
		result = Integer.parseInt("" + stack.pop());
		return result;
	}

}
