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

            // 輸入合法性判斷
            if (!isValidMove(row, col)) {
                System.out.println("輸入錯誤：請輸入 0~4 的空格位置！");
                continue;
            }

            // 落子
            board[row][col] = currentPlayer;
            System.out.printf("玩家 %c 在位置 (%d, %d) 放置棋子\n", currentPlayer, row, col);
            printBoard();

            // 勝負檢查
            if (checkWin(currentPlayer)) {
                System.out.printf("玩家 %c 獲勝！\n", currentPlayer);
                gameEnded = true;
            } else if (isBoardFull()) {
                System.out.println("平手！");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    // 初始化棋盤為 '.'
    static void initializeBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = '.';
    }

    // 顯示棋盤含索引
    static void printBoard() {
        System.out.print("  ");
        for (int j = 0; j < SIZE; j++)
            System.out.print(j + " ");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    // 檢查是否為合法落子位置
    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == '.';
    }

    // 判斷是否連續 5 個相同符號
    static boolean checkWin(char player) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkDirection(i, j, 0, 1, player)) return true; // →
                if (checkDirection(i, j, 1, 0, player)) return true; // ↓
                if (checkDirection(i, j, 1, 1, player)) return true; // ↘
                if (checkDirection(i, j, 1, -1, player)) return true; // ↙
            }
        }
        return false;
    }

    // 往某一方向檢查是否連續5個相同符號
    static boolean checkDirection(int x, int y, int dx, int dy, char player) {
        for (int i = 0; i < 5; i++) {
            int nx = x + i * dx;
            int ny = y + i * dy;
            if (nx < 0 || nx >= SIZE || ny < 0 || ny >= SIZE || board[nx][ny] != player)
                return false;
        }
        return true;
    }

    // 判斷棋盤是否已滿
    static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (board[i][j] == '.')
                    return false;
        return true;
    }
}
