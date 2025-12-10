public class Person {
  private String name;
  private int birthYear;

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  };

  public Person(String name) {
    // so i'm not sure why its stating "use the this keyword to call previously
    // created constructor"
    // oh wild this is how it works.
    // perhaps this was mentioned during class somewhere... oops
    this(name, 1990);
  };

  public String getName() {
    return this.name;
  }

  public int getAge(int year) {
    return year - this.birthYear;
  }

  public static Person getOlder(Person person1, Person person2, int year) {
    if (person1.getAge(year) > person2.getAge(year)) {
      return person1;
    } else if (person2.getAge(year) > person1.getAge(year)) {
      return person2;
    } else {
      // I don't think we've learned about exception handling yet, so I don't think I
      // can use it.
      // I suppose just returning the first option is satisfactory for this stage of
      // learning.
      return person1;
    }
  }

  public static Person getOldest(Person[] inputArray, int year) {
    Person oldest = inputArray[0];
    for (int i = 0; i < inputArray.length; ++i) {
      if (inputArray[i].getAge(year) > oldest.getAge(year)) {
        oldest = inputArray[i];
      }
    }
    return oldest;
  }
}
