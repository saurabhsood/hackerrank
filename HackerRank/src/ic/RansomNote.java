package ic;

import java.util.Arrays;
import java.util.Scanner;

public class RansomNote {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next().trim();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next().trim();
		}
		boolean chk = false;
		for (int i = 0; i < ransom.length; i++) {
			chk = false;
			outer: for (int j = 0; j < magazine.length; j++) {
				if (magazine[j] != null && magazine[j].equals(ransom[i])) {
					magazine[j] = null;
					chk = true;
					break outer;
				}
			}
			if (!chk) {
				break;
			}

		}
		if (!chk)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}