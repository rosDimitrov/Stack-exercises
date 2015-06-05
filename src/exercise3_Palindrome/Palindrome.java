package exercise3_Palindrome;

public class Palindrome {

	public static void main(String[] args) {

		boolean palindrome = Palindrome.isPalindrome("ABCDEFGGFEDCBA");
		System.out.println("The string is palindrome :" + palindrome);
	}

	public static boolean isPalindrome(String s) {
		boolean isPalindrome = false;
		ArrayStack<Character> stack = new ArrayStack<>();

		if (s.equals(null) || s.length() == 1) {
			return false;
		} else if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length(); i++) {
				if (i < s.length() / 2) {
					stack.push(s.charAt(i));
				} else {
					if (s.charAt(i) == stack.pop()) {
						isPalindrome = true;
					} else {
						isPalindrome = false;
						break;
					}
				}
			}
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (i < s.length() / 2) {
					stack.push(s.charAt(i));
				}

				if (i > (s.length() / 2)) {
					if (s.charAt(i) == stack.pop()) {
						isPalindrome = true;
					} else {
						isPalindrome = false;
						break;
					}
				}

			}

		}
		return isPalindrome;
	}
}
