package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class algotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Character> mstack = new Stack<>();
		ArrayList<String> printAry = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		// String str = "";
		// if (scan.hasNext()) {
		// str = scan.next();
		// }
		// for (int i = 0; i < str.length(); i++) {
		// mstack.push(str.charAt(i));
		// }
		//
		// while (!mstack.isEmpty()) {
		// System.out.print(mstack.pop());
		//
		// }

		System.out.println(solution(scan.nextInt()));

	}

	public static int solution(int N) {
		// write your code in Java SE 8
		System.out.println("입력 : " + N);

		ArrayList<Integer> binaryAry = new ArrayList<>();
		Stack mbinaryStack = new Stack<>();
		ArrayList<Integer> binaryGap = new ArrayList<>();

		int[] binaryGapList;
		while (N / 2 > 0) {
			System.out.println("나머지 : " + (N % 2));
			mbinaryStack.push(N % 2);

			N = N / 2;

		}
		mbinaryStack.push(N);
		int cntZero = 0;
		int cntOne = 0;
		System.out.println(" mbinaryStack.size() : " + mbinaryStack.size());
		int size = mbinaryStack.size();
		for (int i = 0; i < size; i++) {
			
			if ((int) mbinaryStack.pop() == 0) {
				cntZero++;
			} else {

				binaryGap.add(cntZero);
				cntZero = 0;
			}

		}

		int result = 0;
		int temp = 0;
//		binaryGapList = binaryGap.
//		binaryGap.toArray(binaryGapList);
//		Arrays.sort(binaryGap);
		Collections.max(binaryGap);
		if (binaryGap.size() > 0) {
//			// StringBuffer buf = new StringBuffer();
//			for (int i = 0; i < binaryGap.size(); i++) {
//
//				if (temp > binaryGap.get(i)) {
//					if (binaryGap.get(i - 1) > binaryGap.get(i)) {
//						temp = binaryGap.get(i - 1);
//					} else {
//						temp = binaryGap.get(i);
//					}
//				} else {
//					temp = binaryGap.get(i);
//				}
//
//			}

			result = Collections.max(binaryGap);
		}

		return result;

	}

}
