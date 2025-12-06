public class Path2D {
  private Point2D[] points;
  private int count = 0;

  public Path2D(int length) {
    this.points = new Point2D[length];
  }
  ;

  public void addPointToPath(Point2D input) {
    if (count < points.length) {
      points[count] = input;
      ++count;
    } else {
      System.out.println("YOU'RE OUT OF SPACE, TIME TO PANIC!!!");
    }
  }
  ;

  public void printPathPoints() {
    for (int i = 0; i < this.points.length; ++i) {
      if (this.points[i] != null) {
        // this feels increndibly dumb, I can't help but think
        // I'm doing this wrong;
        System.out.print("(");
        for (double c : this.points[i].getCoord()) {
          System.out.print(c + " ");
        }
        System.out.print(")");
        System.out.println();
      } else {
        System.out.println("Null/Empty space");
      }
    }
  }

  // "static method"?
  // for reference this is instruction part 6
  public static void staticPrint2D(Path2D input) {
    for (int i = 0; i < input.points.length; ++i) {
      if (input.points[i] != null) {
        System.out.print("(");
        for (double c : input.points[i].getCoord()) {
          System.out.print(c + " ");
        }
        System.out.print(")");
        System.out.println();
      } else {
        System.out.println("Null/Empty Space");
      }
    }
  }

  // I made this to print out what the final values of splitting a path into two paths
  // it is very likely that at this point there is some brain dead stuff going on
  // because its the final part/area of this whole operation.
  public static void staticPrint2D(Path2D[] input) {
    for (int i = 0; i < input.length; ++i) {
      Path2D path = input[i];

      System.out.println("Parent Path: " + i + "\n");

      for (int j = 0; j < path.points.length; ++j) {
        if (path.points[j] != null) {
          System.out.print("(");

          System.out.print("(" + path.points[j].getCoord()[0] + " , ");
          System.out.print(path.points[j].getCoord()[1] + ")\n");

        } else {
          System.out.println("Null/Empty Space");
        }
      }
      System.out.println();
    }
  }

  public static void pathSort(Path2D input) {
    Point2D origin = new Point2D(0., 0.);

    for (int i = 0; i < input.points.length - 1; ++i) {
      int minIndex = i;
      for (int j = i + 1; j < input.points.length; ++j) {
        if (
        // I am wondering if these null checks can be simplified in some manner.
        // the null checks are checking for any "empty" space
        // otherwise its just the classic select sort
        // I keep forgetting that i need to input.points[j] rather than input[j]
        input.points[j] != null
            && input.points[minIndex] != null
            // my formatter is complaining about over 100 character lines here
            // so some of this is broken up because of that.
            && Point2D.distance(input.points[j], origin)
                < Point2D.distance(input.points[minIndex], origin)) {
          minIndex = j;
        }
      }
      Point2D temp = input.points[i];
      input.points[i] = input.points[minIndex];
      input.points[minIndex] = temp;
    }
  }

  public void scaleAllPoints(double scale) {
    for (Point2D i : this.points) {
      // null checker again...
      if (i != null) {
        double[] result = i.getCoord();
        // almost... at... end!!
        i.setCoords(result[0] * scale, result[1] * scale);
      }
    }
  }

  // DON'T GIVE IN RAH!!!
  // I'm thinking, I already have Path2D object already
  // naturally in an array setup
  public static Path2D[] splitPath(Path2D input) {

    int size1 = input.points.length / 2;
    int size2 = input.points.length - size1;

    Path2D half1 = new Path2D(size1);
    Path2D half2 = new Path2D(size2);

    // I guess I should have two seperate loops to fill two potentially
    // different sized arrays, I am questioning EVERYTHING NOW.
    for (int i = 0; i < size1; ++i) {
      // NULL CHECKERS OMG!!!!!
      if (input.points[i] != null) {
        half1.addPointToPath(input.points[i]);
      }
    }

    for (int i = 0; i < size2; ++i) {
      if (input.points[i + size1] != null) {
        half2.addPointToPath(input.points[i + size1]);
      }
    }

    return new Path2D[]{half1, half2};
  }
}
