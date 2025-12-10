public class Cat {

  private String name;
  // currently we have not learned about "String Methods"
  private int day;
  private int month;
  private int year;

  private Cat[] parents = new Cat[2];
  private int ID;
  private static int counter = 1000;

  public Cat(String name, int day, int month, int year, Cat[] parents) {
    this.name = name;
    this.day = day;
    this.month = month;
    this.year = year;
    this.parents = parents;
    ID = counter++;
  }

  public Cat(String name, int day, int month, int year) {
    this.name = name;
    this.day = day;
    this.month = month;
    this.year = year;
    ID = counter++;
  }

  public boolean isAdult(int day, int month, int year) {

    return year > this.year ? month >= this.month ? day >= this.day ? true : false : false : false;
  }

  // I would like to confirm this thought with the teacher at some point...
  // void and return "type" are for methods/statics... not having one simply
  // assumes its a
  // constructor or invalid? I should just look this up instead.
  public void show() {
    System.out.println(
        "(name: "
            + this.name
            + ", Date of Birth: M:"
            + this.month
            + " D:"
            + this.day
            + " Y:"
            + this.year
            + ", Dad:"
            + (this.parents[0] == null ? "no data" : this.parents[0].name)
            + " Mom:"
            + (this.parents[1] == null ? "no data" : this.parents[1].name)
            + " ID:"
            + this.ID
            + ")");
  }

  public void showParents() {
    if (this.parents[0] != null && this.parents[1] != null) {
      this.parents[0].show();
      this.parents[1].show();
    }
  }

  public Cat[] getParents(){
    return this.parents;
  }
}
