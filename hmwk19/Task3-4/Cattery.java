public class Cattery {
  private Cat[][] litters;
  private String name;
  private int ID;
  private static int counter = 1000;

  public Cattery(String name) {
    this.name = name;
    ID = counter++;
    this.litters = new Cat[0][0];
  }

  public void addLitter(Cat[] litter) {
    boolean canAddLitter = true;

    // So at first glance this looks like a lot
    // but I have to remind myself not to take shortcuts here and make it look
    // "simpler". This is really good practice for getting comftorable with objects.
    // I must remain with this style of writing Java.

    for (int i = 0; i < litter.length - 1; ++i) {
      for (int j = i + 1; j < litter.length; ++j) {
        if (litter[i].getParents()[0] != litter[j].getParents()[0]
            || litter[i].getParents()[1] != litter[j].getParents()[1]) {
          System.out.println("Can't add litter. Parents of cats don't match");
          canAddLitter = false;
          break;
        }
      }
    }
    if (canAddLitter) {

      // oh yeah I guess rectangular and overwrite if I declare size on second
      // array...
      Cat[][] newLitter = new Cat[this.litters.length + 1][];

      for (int i = 0; i < this.litters.length; ++i) {
        newLitter[i] = this.litters[i];
      }

      newLitter[newLitter.length - 1] = litter;
      this.litters = newLitter;
    }
  }

  public void show() {
    System.out.println(
        "The Cattery name is: " + this.name + "\nand the ID of said Cattery is: " + this.ID + "\n");
    for (int i = 0; i < this.litters.length; ++i) {
      System.out.print("Litter index: " + i + " ... contains the following cats: (\n");
      for (int j = 0; j < this.litters[i].length; ++j) {
        this.litters[i][j].show();
      }
      System.out.print(")\n");
    }
  }
}
