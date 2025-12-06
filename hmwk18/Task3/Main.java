public class Main {
  public static void main(String[] args) {
    Point2D firstCoord = new Point2D(-5., 1.);
    Point2D secondCoord = new Point2D(3., 4.);

//   System.out.println(Point2D.distance(firstCoord, secondCoord));
    // 8.5
    Point2D example1 = new Point2D(-2, 6);
    Point2D example2 = new Point2D(5, -4);
//   System.out.println(Point2D.distance(example1, example2));
    // 12.2
    
    Point2D random1 = Point2D.randomPoint2D();
  // System.out.println(random1.getCoord()[0]);
  //  System.out.println(random1.getCoord()[1]);
  
    Point2D point1 = new Point2D(3, 10);
    Point2D point2 = new Point2D(4, 2);
    Point2D point3 = new Point2D(-3, 4);

    System.out.println("Distance of p1 and p2 is: " + Point2D.distance(point1, point2));
    System.out.println("Distance of p1 and p3 is: " + Point2D.distance(point1, point3));
    System.out.println("Distance of p2 and p3 is: " + Point2D.distance(point2, point3));

    Point2D point4 = Point2D.randomPoint2D();

    Path2D path = new Path2D(10);

    path.addPointToPath(point1);
    path.addPointToPath(point2);
    path.addPointToPath(point3);
    path.addPointToPath(point4);

    System.out.println("\n\nPrinting all available points in Path2D object 'path':");
    path.printPathPoints();

    System.out.println("\n\nPRINTING THE STATIC VERSION!!!------------");
    Path2D.staticPrint2D(path);

    System.out.println("\n\n Ok now sorting (distance) and then printing new output");
    Path2D.pathSort(path);
    path.printPathPoints();

    System.out.println("\n\n Scaling all given points in path with scale method");
    path.scaleAllPoints(2.);
    path.printPathPoints();

    // currently an "even" path length before split
    Path2D path2 = path;

    System.out.println("\n\nAttempted split stuff");
    Path2D[] splitPath = Path2D.splitPath(path);
    Path2D.staticPrint2D(splitPath);

    // ok look I could just do some function or loop or whatever
    // BUT HAVE MERCY LET ME BE STUPID HERE
    // I promise to look into it later this weekend this is good study material.
    //
    path2.addPointToPath(Point2D.randomPoint2D());
    path2.addPointToPath(Point2D.randomPoint2D());
    path2.addPointToPath(Point2D.randomPoint2D());
    path2.addPointToPath(Point2D.randomPoint2D());
    path2.addPointToPath(Point2D.randomPoint2D());
    path2.addPointToPath(Point2D.randomPoint2D());
    // at this point "out of space should pop up more or less"
    path2.addPointToPath(Point2D.randomPoint2D());

    Path2D[] splitPath2 = Path2D.splitPath(path2);
    Path2D.staticPrint2D(splitPath2);

  }
}
