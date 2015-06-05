package exercise2_MatchingBrackets;

public class TestClass {

	public static void main(String[] args) {

		String expression = "a {b [c (d + e)/2 - f] + 1}";
		ClassForBrackectMethod myClass = new ClassForBrackectMethod();
		boolean match = myClass.containsMatchingBrackets(expression);
		if (match) {
			System.out.println(expression + " is balanced");
		} else {
			System.out.println(expression + " is not balanced");
		}

	}

}
