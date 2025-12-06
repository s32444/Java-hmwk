public class Point2D {
  private int x, y;

  public Point2D(int x, int y) {
    this.x = x;
    this.y = y;
  }
  ;

  public static Point2D randPoint2D() {
    int randomX = (int) (Math.random() * 101 - 50);
    int randomY = (int) (Math.random() * 101 - 50);

    Point2D result = new Point2D(randomX, randomY);

    return result;
  }

  public int getCoordX() {
    return this.x;
  }

  public int getCoordY() {
    return this.y;
  }
}
