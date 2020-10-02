public class MatrixUtil {

    private int move = 1;
    private int counter = 0;
    private int performed = 0;

    public MatrixUtil() {
    }

    public int[][] getResultMatrix(int size) {
        int[][] matrix = new int[size][size];
        int square = getSquare(size);
        Point point = new Point();
        int remainder = getRemainder(size);
        Direction direction;

        if (remainder == 1) {
            int half = size / 2;
            point.setHorizontal(half);
            point.setVertical(half);
            direction = Direction.LEFT;
        } else {
            int half = size / 2;
            point.setVertical(half);
            point.setHorizontal(half - 1);
            direction = Direction.RIGHT;
        }

        if (size > 1) {
            while (!checkPointIsLast(point.getVertical(), point.getHorizontal())) {
                while (counter <= move) {
                    if (checkPointIsLast(point.getVertical(), point.getHorizontal())) break;
                    matrix[point.getVertical()][point.getHorizontal()] = square;
                    square--;
                    counter++;
                    movePoint(point, direction);
                    if (counter == move) {
                        performed++;
                        direction = getNextDirection(direction);
                        counter = 0;
                    }
                    if (performed == 2) {
                        move++;
                        performed = 0;
                    }
                    if (counter == 0) break;
                }
            }
        }
        matrix[0][0] = 1;
        serDefaults();
        return matrix;
    }

    private Direction getNextDirection(Direction direction) {
        Direction nextDirection;
        if (direction == Direction.LEFT) {
            nextDirection = Direction.DOWN;
        } else if (direction == Direction.DOWN) {
            nextDirection = Direction.RIGHT;
        } else if (direction == Direction.RIGHT) {
            nextDirection = Direction.UP;
        } else nextDirection = Direction.LEFT;
        return nextDirection;
    }

    private void movePoint(Point point, Direction currentDirection) {
        if (currentDirection == Direction.LEFT) {
            point.moveLeft();
        } else if (currentDirection == Direction.RIGHT) {
            point.moveRight();
        } else if (currentDirection == Direction.UP) {
            point.moveUp();
        } else if (currentDirection == Direction.DOWN) {
            point.moveDown();
        }
    }

    public boolean checkMatrixExists(int size) {
        return size > 0;
    }

    private boolean checkPointIsLast(int vertical, int horizontal) {
        boolean result = false;
        if (vertical == 0) {
            if (horizontal == 0) {
                result = true;
            }
        }
        return result;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private int getSquare(int number) {
        return number * number;
    }

    private int getRemainder(int number) {
        return number % 2;
    }

    private void serDefaults() {
        move = 1;
        counter = 0;
        performed = 0;
    }

}
