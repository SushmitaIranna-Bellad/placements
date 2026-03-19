package Assignments.Assignment4.Module9.RecursionAndBackTracking;
// LeetCode 51 - N Queens
import java.util.*;
class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        backtrack(res, board, 0);
        return res;
    }
    private void backtrack(List<List<String>> res, char[][] board, int row) {
        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) temp.add(new String(r));
            res.add(temp);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(res, board, row + 1);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) if (board[i][col] == 'Q') return false;
        for (int i = row-1, j = col-1; i>=0 && j>=0; i--, j--) if (board[i][j] == 'Q') return false;
        for (int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++) if (board[i][j] == 'Q') return false;
        return true;
    }

    public static void main(String[] args) {
        NQueens obj = new NQueens();
        System.out.println(obj.solveNQueens(4));
    }
}

