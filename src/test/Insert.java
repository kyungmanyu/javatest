package test;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arry = { 5, 2, 4, 6, 1, 3 };
		int[] arry2 = insertSort(arry);
		for (int i : arry2) {
			System.out.print(" " + i);
		}
	}

	private static int[] insertSort(int[] arry) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 1; i < arry.length; i++) {
			System.out.print("i " + i);
			System.out.println("");
			for (int j = i; j > 0; j--) {
				
				System.out.print("j " + j);
				if (arry[j] < arry[j - 1]) {
					temp = arry[j];
					arry[j] = arry[j - 1];
					arry[j - 1] = temp;
				}
			}
			System.out.println("");
		}
		return arry;
	}

}
