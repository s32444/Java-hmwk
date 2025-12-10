public class Student{

    private int indexNumber;
    private static int counter = 10000;

    public Student(){
        indexNumber = counter++;
    }

    public int getIndexNumber() {
        return indexNumber;
    }
}
