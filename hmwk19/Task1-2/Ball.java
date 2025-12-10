public class Ball {
  private double radius;
  static int ballCounter = 0;

  public Ball() {
    radius = (Math.random() * 11.) + 10.;
    ballCounter++;
  }

  // initially the instructions lead me to believe I need to make a
  // array of Ball[] within makeBall, however, as I'm doing this
  // I am thinking no rather something simpler just Ball instance.
  // And rather showCounter is to show how many have been made up to this point
  // hence why ballCounter is static.
  public static Ball makeBall() {
    Ball result = new Ball();
    return result;
  }

  public double getRadius() {
    return this.radius;
  }

  public static int showCounter() {
    return ballCounter;
  }
}
