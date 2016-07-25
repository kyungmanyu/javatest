package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import test.algo1.Tree;

public class beakjoon1002 {

//	public static final String FILE_PATH = "D:/eclipse_project/workspace/AcmicpcTest/";
	
//	public static final String PRO = "3"
//			+ "0 0 13 40 0 37"
//			+ "0 0 3 0 7 4"
//			+ "1 1 1 1 1 5";

	public static void main(String[] args) {
//		File file = new File("test1002.txt");

		 long start = System.currentTimeMillis();
	        // Read input
	        InputStream inputStream;
	        try {
	            inputStream = new FileInputStream("1002input.in");
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	        Scanner scanner = new Scanner(inputStream);

	        OutputStream outputStream;
	        try {
	            outputStream = new FileOutputStream("1002output.out");
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	        
	        PrintWriter out = new PrintWriter(outputStream);

	    	int caseCnt = 0;

			int x1, y1, r1, x2, y2, r2;

			try {

//				Scanner sc = new Scanner(System.in);
				caseCnt = scanner.nextInt();

				while (scanner.hasNextLine()) {
					x1 = scanner.nextInt();
					y1 = scanner.nextInt();
					r1 = scanner.nextInt();
					x2 = scanner.nextInt();
					y2 = scanner.nextInt();
					r2 = scanner.nextInt();

					System.out.println(getResult(x1, y1, r1, x2, y2, r2));
					out.println(getResult(x1, y1, r1, x2, y2, r2));

				}
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	        
	        
//	        int caseNum = scanner.nextInt();
//	        for (int i = 0; i < caseNum; i++) {
//	            int nodeNum = scanner.nextInt();
//	            int questionNum = scanner.nextInt();
//	            Tree tree = new Tree(nodeNum, scanner);
//	            
//	            for (int j = 0; j < questionNum; j++) {
//	                int nodeA = scanner.nextInt();
//	                int nodeB = scanner.nextInt();
//	                boolean canGoA2B = tree.checkCanGo(nodeA, nodeB);
//	                boolean canGoB2A = tree.checkCanGo(nodeB, nodeA);
//	                out.println(canGoA2B || canGoB2A ? "1" : "0");
//	            }
//	        }

	        long end = System.currentTimeMillis();
	        System.out.println((end - start) + "ms");
	        System.out.println("end!!");
	        out.close();
		
	

	}
	
//	private static void makeFile() {
//		try
//        {
//            FileWriter fw = new FileWriter("test1002.txt"); // 절대주소 경로 가능
//            BufferedWriter bw = new BufferedWriter(fw);
// 
//            bw.write("3");
//            bw.newLine();
//            bw.write("0 0 13 40 0 37");
//            bw.newLine();
//            bw.write("0 0 3 0 7 4");
//            bw.newLine();
//            bw.write("1 1 1 1 1 5");
//             
//            bw.close();
//        }
//        catch (IOException e)
//        {
//            System.err.println(e); // 에러가 있다면 메시지 출력
//            System.exit(1);
//        }
//		
//	}

	public static int getResult(int x1, int y1, int r1, int x2, int y2, int r2) {
		boolean isAsc = (r2 >= r1);
		int small = (x2 * x2) + (y2 * y2);
		int smallR = r2;
		int big = (x1 * x1) + (y1 * y1);
		int bigR = r1;
		if (isAsc) {
			small = (x1 * x1) + (y1 * y1);
			smallR = r1;
			big = (x2 * x2) + (y2 * y2);
			bigR = r2;
		}

		double dis = Math.sqrt(big) - Math.sqrt(small);

		if ((dis + bigR > smallR) && (dis - bigR < -smallR)) {
			return 0;
		} else if (dis == (smallR + bigR)) {
			return 1;
		} else {
			return 2;
		}
	}

}