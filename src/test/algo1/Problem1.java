package test.algo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // Read input
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("A-small.in");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(inputStream);

        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream("A-small.out");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        PrintWriter out = new PrintWriter(outputStream);

        int caseNum = scanner.nextInt();
        for (int i = 0; i < caseNum; i++) {
            int nodeNum = scanner.nextInt();
            int questionNum = scanner.nextInt();
            Tree tree = new Tree(nodeNum, scanner);
            
            for (int j = 0; j < questionNum; j++) {
                int nodeA = scanner.nextInt();
                int nodeB = scanner.nextInt();
                boolean canGoA2B = tree.checkCanGo(nodeA, nodeB);
                boolean canGoB2A = tree.checkCanGo(nodeB, nodeA);
                out.println(canGoA2B || canGoB2A ? "1" : "0");
            }
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
        System.out.println("end!!");
        out.close();
    }
}
