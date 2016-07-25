
package test.algo1;

import java.util.Scanner;

public class Tree {
    private static final int ROOT = 0;
    private int[] mTree;

    public Tree(int nodeNum, Scanner scanner) {
        mTree = new int[nodeNum];
        buildTree(nodeNum, scanner);
    }

    private void buildTree(int nodeNum, Scanner scanner) {
        for (int i = 0; i < nodeNum - 1; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            mTree[child - 1] = parent;
        }
    }

    public boolean checkCanGo(int from, int to) {
        int child = to;
        int parent = from;

        while (mTree[child - 1] != ROOT) {
            if (mTree[child - 1] == parent) {
                return true;
            }
            child = mTree[child - 1];
        }
        return false;
    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
