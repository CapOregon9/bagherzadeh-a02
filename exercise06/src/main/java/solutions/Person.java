package solutions;

import java.util.Calendar;

public class Person {
    private int currentAge;
    private int retireAge;

    public Person(int currentAge, int retireAge) {
        this.currentAge = currentAge;
        this.retireAge = retireAge;
    }

    public void retirementTime() {
        int retirement = retireAge - currentAge;
        System.out.printf("You have %d years left until you can retire.",retirement);
        System.out.println();
        int currentYear =  Calendar.getInstance().get(Calendar.YEAR);
        int retirementYear = currentYear + retirement;
        System.out.printf("It's %d, so you can retire in %d",currentYear,retirementYear);
    }
}
