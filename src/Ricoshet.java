import java.util.Scanner;

public class Ricoshet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int m = Integer.parseInt(dimensions[0]);
        int n = Integer.parseInt(dimensions[1]);

        long[][] matrix = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (long) Math.pow(2, i + j);
            }
        }

        int row = 0;
        int col = 0;
        int dr = 1;
        int dc = 1;
        long totalSum = 0;

        while (true) {
            totalSum += matrix[row][col];

            int nextRow = row + dr;
            int nextCol = col + dc;

            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) {
                if (nextRow < 0) {
                    dr = 1;
                } else if (nextRow >= m) {
                    dr = -1;
                }

                if (nextCol < 0) {
                    dc = 1;
                } else if (nextCol >= n) {
                    dc = -1;
                }

                nextRow = row + dr;
                nextCol = col + dc;
            }

            row = nextRow;
            col = nextCol;

            if ((row == 0 && col == 0) ||
                    (row == m - 1 && col == n - 1) ||
                    (row == 0 && col == n - 1) ||
                    (row == m - 1 && col == 0)) {
                totalSum += matrix[row][col];
                break;
            }
        }

        System.out.println(totalSum);
    }
}
