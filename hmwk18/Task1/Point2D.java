public class Point2D {
  private double x, y;

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }
  ;

  public double[] getCoord() {
    double[] arrSet = new double[] {this.x, this.y};
    return arrSet;
  }
}
