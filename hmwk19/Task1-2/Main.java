public class Main {
  public static void main(String[] args) {
    Student[] students = new Student[10];

    for (int i = 0; i < students.length; ++i) {
      students[i] = new Student();
    }

    for (Student s : students) {
      System.out.println(s.getIndexNumber());
    }

    // Task2... wow I'd love to be more descriptive but people will think I'm a.i.
    // or something if I just comment on own damn code as I go along, sad days man.
    System.out.println(Ball.showCounter());

    Ball[] arr = new Ball[10];

    for (int i = 0; i < arr.length; ++i) {
      arr[i] = Ball.makeBall();
      // I'm going to shorten the result a little here
      // just to make it easier to read the results
      double shortened = (int) (arr[i].getRadius() * 1000.) / 1000.0;
      System.out.print(shortened + " ");
    }
    System.out.println();

    System.out.println(Ball.showCounter());
  }
}
