import java.util.Scanner;

class TextReverse{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String sentence = s.nextLine();
		sentence = reverseSentence(sentence);
		System.out.println("Reversed string = " + sentence);
	}

	public static String reverseSentence(String sentence) {
		char [] array = sentence.toCharArray();
		reverse(array, 0, sentence.length()	 - 1);
		int lastIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				reverse(array, lastIndex, i - 1);
				lastIndex = i + 1;
			}
		}
		return new String(array);
	}

	public static void reverse(char[] str, int start, int end) {
		while (end > start) {
			char charStart = str[start];
			str[start] = str[end];
			str[end] = charStart;
			end--;
			start++;
		}
	}

	}
	