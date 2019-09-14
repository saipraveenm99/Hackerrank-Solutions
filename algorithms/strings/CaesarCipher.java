/**
 * 
 * Problem Statement-
 * [Caesar Cipher](https://www.hackerrank.com/challenges/caesar-cipher-1/problem)   
 * 
 */


import java.util.Scanner;

/**
 * @author nagasai praveen
 *
 */
public class CaesarCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int K = sc.nextInt();
		K = K % 26;
		String passwd = "";
		for (int i = 0; i < N; i++) {
			int ch = s.charAt(i);
			int t = (ch + K);

			if (ch >= 97 && ch <= 122) {
				if (t > 122) {
					t = 96 + (t - 122);
				}
				passwd += (char) (t);
			} else if (ch >= 65 && ch <= 90) {
				if (t > 90) {
					t = 64 + (t - 90);
				}
				passwd += (char) (t);
			} else {
				passwd += (char) ch;
			}
		}
		System.out.println(passwd);
		sc.close();
	}
}