package test.hanoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // Read input
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("B-small.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(inputStream);
        

        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream("B-small.out");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        PrintWriter out = new PrintWriter(outputStream);

        int caseNum = scanner.nextInt();
        for (int i = 0; i < caseNum; i++) {
            int n = scanner.nextInt();
            HanoiSolver solver = new HanoiSolver(n);
            
            int[] secondDay = getStatusArray(scanner, n);
            int[] thirdDay = getStatusArray(scanner, n);
            
            solver.setCheckValues(secondDay, thirdDay);
            solver.solveHanoiWithChecking(n, 1, 2, 3);
            out.println(solver.check() == true ? "1" : "0");
        }

        out.close();
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
        System.out.println("end!!");
    }
    
    static private int[] getStatusArray(Scanner scanner, int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[n-i-1] = scanner.nextInt();
        }
        return ret;
    }
}
