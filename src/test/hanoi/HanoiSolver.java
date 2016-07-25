
package test.hanoi;


public class HanoiSolver {
    private int[] mStatus;
    private int[] mSecondDay;
    private int[] mThirdDay;
    private boolean isFound = false;
    private boolean isCorrect = false;
    
    public HanoiSolver(int n) {
        mStatus = new int[n];
        for (int i = 0; i < n; i++) {
            mStatus[i] = 1;
        }
    }

    public void solveHanoiWithChecking(int n, int from, int to, int temp) {
        if (n == 1) {
            move(n, to);
            return;
        }

        solveHanoiWithChecking(n-1, from, temp, to);
        move(n, to);
        solveHanoiWithChecking(n-1, temp, to, from);
    }

    private void move(int n, int to) {
        mStatus[n-1] = to;
        if (!isFound && isSame(mStatus, mSecondDay)) {
            isFound = true;
        }
        if (isFound && !isCorrect && isSame(mStatus, mThirdDay)) {
            isCorrect = true;
        }
    }
    
    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    
    public void setCheckValues(int[] secondDay, int[] thirdDay) {
        mSecondDay = secondDay;
        mThirdDay = thirdDay;
    }

    public boolean check() {        
        return isCorrect;
    }
}
