import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        printBoard();

        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.printf("玩家 %c 請輸入位置 (row col)：", currentPlayer);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // 檢查輸入合法性
            if (!isValidMove(row, col)) {
                System.out.println("輸入錯誤：請輸入 0-4 之間的空格位置！");
                continue;
            }

            // 落子
            board[row][col] = currentPlayer;
            System.out.printf("玩家 %c 在位置 (%d, %d) 放置棋子\n", currentPlayer, row, col);
            printBoard();

            // 勝負判定
            if (checkWin(currentPlayer)) {
                System.out.printf("玩家 %c 獲勝！\n", currentPlayer);
                gameEnded = true;
            } else if (isBoardFull()) {
                System.out.println("平手！");
                gameEnded = true;
            } else {
                // 換玩家
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // 初始化棋盤
    static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '.';
            }
        }
    }

    // 列印棋盤
    static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 判斷輸入是否合法
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '.';
    }

    // 判斷是否有勝利條件
    static boolean checkWin(char player) {
        // 檢查行
        for (int i = 0; i < SIZE; i++) {
            boolean win = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // 檢查列
        for (int j = 0; j < SIZE; j++) {
            boolean win = true;
            for (int i = 0; i < SIZE; i++) {
                if (board[i][j] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // 檢查主對角線
        boolean win = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // 檢查反對角線
        win = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][SIZE - 1 - i] != player) {
                win = false;
                break;
            }
        }
        return win;
    }

    // 判斷是否平手
    static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == '.')
                    return false;
        return true;
    }
}

