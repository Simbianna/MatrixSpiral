import java.util.Scanner;

/**
 * JetBrains Academy task solution. Spiral
 * Output the matrix of size n \times nn×n, filled by the integers from 1 to n^n in a spiral,
 * coming from the top left corner and twisted clockwise, as shown in the example (here n=5).
 * <p>
 * Sample Input 1:
 * 5
 * <p>
 * Sample Output 1:
 * 1 2 3 4 5
 * 16 17 18 19 6
 * 15 24 25 20 7
 * 14 23 22 21 8
 * 13 12 11 10 9
 **/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixUtil util = new MatrixUtil();
        int n = scanner.nextInt();
        if (!util.checkMatrixExists(n)) {
            System.out.println("Size cant be less than 1");
        } else {
            int[][] result = util.getResultMatrix(n);
            util.printMatrix(result);
        }
    }
}

