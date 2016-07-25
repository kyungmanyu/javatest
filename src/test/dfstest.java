package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class dfstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.currentTimeMillis();
		// Read input
		InputStream inputStream;
		try {
			inputStream = new FileInputStream("dfs.in");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		Scanner scanner = new Scanner(inputStream);

		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream("dfs.out");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		PrintWriter out = new PrintWriter(outputStream);

		int caseCnt = 0;

		try {

			// Scanner sc = new Scanner(System.in);
			caseCnt = scanner.nextInt();

			System.out.println("caseCnt : " + caseCnt);
			for (int i = 0; i < caseCnt; i++) {

				 out.println(getCity(scanner));
				
			}
		
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		System.out.println("end!!");
		out.close();

	}

	public static ArrayList<Integer> getCity(Scanner scan) {
		int cityCnt = scan.nextInt();
		int line = scan.nextInt();
		ArrayList<Integer> citys = new ArrayList<>();
//		makeCityData(cityCnt , line);
		citys.add(findCity());

		return citys;
	}
	public static int findCity(){
		
		return 0;
	}
	
	class LinkedCity{
		
		void addCity(City city){
			
		}
	}
	
	class City implements Comparable<City>{
		City parent = null;
		int depth;
		int value;
		boolean checked = false;
		boolean uniqueCity = false;
		ArrayList<City> childs = new ArrayList<>();
		
		public City() {
			// TODO Auto-generated constructor stub
			
		}
		
		void addChild(City child){
			childs.add(child);
			if(childs.size() > 1){
				uniqueCity = true;
				for(City childCity : childs){
					childCity.uniqueCity = false;
				}
			}
		}

		@Override
		public int compareTo(City o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

}
