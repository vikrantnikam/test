package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendDelete {

	// Complete the appendAndDelete function below.
	static String appendAndDelete(String s, String t, int k) {
		int i;
		int check = 0;
		for (i = 0; i < s.length() && i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			}
		}

		int d = s.length() - i;
		int a = t.length() - i;

		int p = k - d - a;
		if (p == 0) {
			return "Yes";
		} else if (p < 0) {
			return "No";
		} else {
			if (p % 2 == 0) {
				return "Yes";
			} else {
				if (p >= (2 * i)) {
					return "Yes";
				} else {
					return "No";
				}

			}
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String t = scanner.nextLine();

		int k = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = appendAndDelete(s, t, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
