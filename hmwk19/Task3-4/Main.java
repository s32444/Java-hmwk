public class Main {
  public static void main(String[] args) {
    Cat dadCat = new Cat("Dad Cat", 13, 7, 2020);
    Cat momCat = new Cat("Mom Cat", 25, 2, 2021);
    Cat[] parents = new Cat[] { dadCat, momCat };

    Cat sonCat = new Cat("Son Cat", 6, 12, 2024, parents);
    Cat daughterCat = new Cat("Daughter Cat", 13, 7, 2025, parents);

    System.out.println("Now showing cat objects.");

    dadCat.show();
    momCat.show();

    sonCat.show();
    daughterCat.show();

    System.out.println("Now showing sonCats parent data");
    sonCat.showParents();

    // below here is task4 related stuff

    Cattery coolCats = new Cattery("Cool Cats");
    coolCats.show();

    Cat sonCat2 = new Cat("Second Son", 2, 12, 2026, parents);
    Cat[] someCats = new Cat[] { sonCat, daughterCat, sonCat2 };

    Cat dadCat2 = new Cat("Second Dad Cat", 16, 2, 2018);
    Cat momCat2 = new Cat("Second Mom Cat", 16, 2, 2018);
    Cat[] parents2 = new Cat[] { dadCat2, momCat2 };

    Cat sleepy1 = new Cat("Mr Sleepy", 18, 5, 2020, parents2);
    Cat sleepy2 = new Cat("In Bed", 11, 5, 2020, parents2);
    Cat sleepy3 = new Cat("No Wakey", 18, 5, 2020, parents2);
    Cat sleepy4 = new Cat("Don't Disturb", 18, 5, 2020, parents2);
    Cat sleepy5 = new Cat("Rest", 18, 5, 2020, parents2);

    Cat[] inBedCats = new Cat[] { sleepy1, sleepy2, sleepy3, sleepy4, sleepy5 };
    Cat[] pretendNotSameCats = new Cat[] { sleepy5, sleepy3 };
    Cat[] notSameParentsLitter = new Cat[] {sleepy4, sonCat};
    Cattery sleepyCats = new Cattery("Sleepy Cats");

    System.out.println("Now adding litter to Cool Cats, and sleepy cats");
    coolCats.addLitter(someCats);
    sleepyCats.addLitter(inBedCats);
    sleepyCats.addLitter(pretendNotSameCats);
    sleepyCats.addLitter(notSameParentsLitter);
    coolCats.show();
    sleepyCats.show();
    // ok well everything seems to work as intended, I think I can move on.
    // hopefully I'm not forgetting something.
  }
}
