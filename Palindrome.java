package Labs;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		boolean repeat = true;
		while (repeat) {
			System.out.println("Please enter a string:");
			String phrase = in.nextLine();
			phrase = phrase.toLowerCase();

			if (phrase.equalsIgnoreCase("exit")) {
				System.out.println("Done!");
				repeat = false;
			}
			else if (isPalindrome(phrase)) {
				System.out.println(phrase + " is a palindrome");
			}
			else {
				System.out.println(phrase + " is not a palindrome :(");
			}
		}


	}
	private static boolean isPalindrome(String phrase, int startIndex, int endIndex) {
		boolean result = true;

		while (endIndex - startIndex >= 1) {
			if (!Character.isLetter(phrase.charAt(startIndex))) {
				startIndex++;
				return isPalindrome(phrase, startIndex, endIndex);
			}
			else if (!Character.isLetter(phrase.charAt(endIndex))) {
				endIndex--;
				return isPalindrome(phrase, startIndex, endIndex);
			}

			else if (phrase.charAt(startIndex) == phrase.charAt(endIndex)) {
				startIndex++;
				endIndex--;
				return isPalindrome(phrase, startIndex, endIndex);
			}
			else  {
				result = false;
				break;
			}


		}
		return result;
	}


	public static boolean isPalindrome(String phrase) {
		boolean answer = true;

		if (phrase.length() == 1 || phrase.length() == 0) {
			return true;
		}
		else if (phrase.length() == 2) {
			if (phrase.charAt(0) != phrase.charAt(phrase.length()-1)) {
				answer = false;
			}
		}
		if (phrase.length() > 2) {
			return isPalindrome(phrase, 0, phrase.length() - 1);
		}



		return answer;

	}
}
