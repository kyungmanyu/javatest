package test;

import java.util.Random;
import java.util.Scanner;

public class pickuptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		getMoneyAmount(scan.nextInt());
	}

	public static int getMoneyAmount(int n) {

//		Random rand = new Random();
//		int point = rand.nextInt(n);
//		System.out.println("point is :" + point);
		int result = 0;
		
		
		
//		boolean end = false;
//
//		// Scanner scan = new Scanner(System.in);
//
//		int cnt = 0;
//		while (!end) {
//
//			if (cnt == 3) {
//				// Game over. 8 is the number I picked.
//				//
//				// You end up paying $5 + $7 + $9 = $21
//				System.out.println("Game over. " + point + " is the number I picked");
//				System.out.println("You end up paying " + result);
//				break;
//			}
//			cnt++;
//			System.out.println("guess what?");
//			Scanner scan = new Scanner(System.in);
//			int guess = scan.nextInt();
//			if (point == guess) {
//				System.out.println("right");
//				end = true;
//			} else if (point > guess) {
//				System.out.println("You guess" + guess + ", I tell you that it's higher. You pay $ " + guess);
//				result = result + guess;
//			} else {
//				System.out.println("You guess" + guess + ", I tell you that it's lower. You pay $ " + guess);
//				result = result + guess;
//			}
//		}

		return n-3 + n-2 + n -1;
	}
}
