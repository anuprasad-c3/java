class Students {
    int rollNo;
    String name;
    int marks;

    void checkEligibility() {
        if (marks >= 40) {
            System.out.println(name + " is eligible for the exam.");
        } else {
            System.out.println(name + " is NOT eligible for the exam.");
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();

        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.marks = 75;

        s2.rollNo = 102;
        s2.name = "Anita";
        s2.marks = 35;

        s1.checkEligibility();
        s2.checkEligibility();
    }
}
