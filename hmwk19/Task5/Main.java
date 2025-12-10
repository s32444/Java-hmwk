public class Main {
    public static void main(String[] args) {
        Person megatron = new Person("Megatron", 2001);
        Person soundwave = new Person("Soundwave", 2002);
        Person trypticon = new Person("Trypticon");
        Person brawl = new Person("Brawl", 2004);

        Person[] Decepticons = new Person[] { megatron, soundwave, trypticon, brawl };

        int currentYear = 2025;

        Person ageCheck1 = Person.getOlder(brawl, soundwave, currentYear);
        Person ageCheck2 = Person.getOlder(megatron, megatron, currentYear);

        System.out.println(ageCheck1.getName() + " Age: " + ageCheck1.getAge(currentYear));
        System.out.println(ageCheck2.getName() + " Age: " + ageCheck1.getAge(currentYear));

        Person oldestCheck = Person.getOldest(Decepticons, currentYear);

        System.out.println(oldestCheck.getName() + " Age: " + oldestCheck.getAge(currentYear));

        // yeah I don't know... these problems, esepcially this last Task 5 seemed way
        // easier as I
        // progressed through them, especcially when comparing to last homework 18
        // problems? I am
        // curious about these difficulty fluctiations.
        //
        //
        // anyways... I believe I've got these problems solved as desired.
    }
}
