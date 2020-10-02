public class Point {
   private int vertical;
   private int horizontal;

    Point(){

    }

    public Point(int vertical, int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    void moveLeft(){
        horizontal--;
    }

    void  moveRight(){
        horizontal++;
    }

    void  moveUp(){
        vertical--;
    }

    void  moveDown(){
        vertical++;
    }

    int getVertical() {
        return vertical;
    }

    void setVertical(int vertical) {
        this.vertical = vertical;
    }

    int getHorizontal() {
        return horizontal;
    }

    void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }
}
