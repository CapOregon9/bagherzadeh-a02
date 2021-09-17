package solution;

import java.util.Scanner;

public class Legality {
    private int age;
    private static final int legalAge = 16;
    private static final Scanner in = new Scanner(System.in);

    public void setAge() {
        System.out.println("What is your age?");
        this.age = in.nextInt();
    }

    public String checkLegality() {
        return (age >= legalAge) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }

    @Override
    public String toString() {
        return checkLegality();
    }
}