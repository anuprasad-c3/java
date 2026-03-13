import java.util.*;

class Publisher {
    String publisherName;
    int year;

    Publisher(String publisherName, int year) {
        this.publisherName = publisherName;
        this.year = year;
    }
}

class Book extends Publisher {
    String title;
    String author;

    Book(String publisherName, int year, String title, String author) {
        super(publisherName, year);
        this.title = title;
        this.author = author;
    }
}

class Literature extends Book {
    Literature(String publisherName, int year, String title, String author) {
        super(publisherName, year, title, author);
    }

    void display() {
        System.out.println("Category: Literature");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Year: " + year);
    }
}

class Fiction extends Book {
    Fiction(String publisherName, int year, String title, String author) {
        super(publisherName, year, title, author);
    }

    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String publisher = sc.nextLine();
        int year = sc.nextInt();
        sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        String category = sc.nextLine();

        if (category.equalsIgnoreCase("literature")) {
            Literature l = new Literature(publisher, year, title, author);
            l.display();
        } else if (category.equalsIgnoreCase("fiction")) {
            Fiction f = new Fiction(publisher, year, title, author);
            f.display();
        }
    }
}
