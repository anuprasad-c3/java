import java.util.Scanner;

class Student {
    int academic;

    void getAcademic(int a) {
        academic = a;
    }
}

class Sports {
    int sports;

    void getSports(int s) {
        sports = s;
    }
}

class Result extends Student {
    Sports sp = new Sports();

    void display() {
        System.out.println("Academic Score: " + academic);
        System.out.println("Sports Score: " + sp.sports);
    }
}

public class pgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Academic Score: ");
        int a = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int s = sc.nextInt();

        r.getAcademic(a);
        r.sp.getSports(s);

        r.display();
    }
}
