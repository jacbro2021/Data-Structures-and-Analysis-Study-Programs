package Midterm1.ArrayStudy;

public class Main {
    public static void main(String[] args) {
        ArrList run = new ArrList();
        run.insert("Jacob", "Brown", "study for MT1");
        run.insert("Jakob", "Cisco", "be an academic weapon");
        run.insert("Sam", "Martin", "drink vodka");
        run.insert("Joe", "Lamb", "study for neuroscience");

        run.show();

        run.delete("Sam");

        run.show();
    }
}
