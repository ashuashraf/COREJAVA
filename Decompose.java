import java.io.*;
import java.util.*;

/** Decomposes a number into sums */
public class Decompose {
	public static final int MAX_NO = 20;

	/**
	 * n - The number to sum up to.
	 * m - The number to start with (to sum up)
	 * s - The current sum. 
	 * d - The numbers used so far.
	 * di - Current index into d;
	 */
	private static void decompose(int n, int m, int s, int [] d, int di) {
		if(s == n) {
			for(int i=0; i < di; i++)
				System.out.print(d[i] + " ");
			System.out.println();
			return;
		} else if (s < n) {
			for(int i=m; i<n; i++) {
				int t = s + i;
				int [] nd = d.clone();
				if(t <= n) {
					nd[di] = i;
				}
				decompose(n, i, t, nd, di + 1);
			}
		}
	}

	private static void printDecompositions(int n) {
		decompose(n, 1, 0, new int[MAX_NO], 0);
	}

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("n = ");
		int n = s.nextInt();
		printDecompositions(n);
	}
}