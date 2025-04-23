import java.util.Scanner;

class Publisher {
    String publishername;

    Publisher(String publishername) {
        this.publishername = publishername;
    }

    void display() {
        System.out.println("Publisher: " + publishername);
    }
}

class Book extends Publisher {
    String booktitle;
    Book(String publishername, String booktitle) {
        super(publishername);
        this.booktitle = booktitle;
    }
    void display() {
        super.display();
        System.out.println("Book Title: " + booktitle);
    }
}
class Literature extends Book {
    String genre = "Literature";
    Literature(String publishername, String booktitle) {
        super(publishername, booktitle);
    }
    void display() {
        System.out.println("\nCategory: " + genre);
        super.display();
    }
}
class Fiction extends Book {
    String genre = "Fiction";
    Fiction(String publishername, String booktitle) {
        super(publishername, booktitle);
    }

    void display() {
        System.out.println("\nCategory: " + genre);
        super.display();
    }
}

class BookDetails {
    public static void main(String args[]) {
    int i,n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        n = sc.nextInt();
        sc.nextLine(); 

        Book[] books = new Book[n];

        for (i = 0; i < n; i++) {
            System.out.println("\nEnter the details of Book " + (i + 1) + ":");

            System.out.print("Enter publisher name: ");
            String publisher = sc.nextLine();  

            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter category (Literature/Fiction): ");
            String category = sc.nextLine();

            if (category.equalsIgnoreCase("Literature")) {
                books[i] = new Literature(publisher, title);
            } else if (category.equalsIgnoreCase("Fiction")) {
                books[i] = new Fiction(publisher, title);
            } else {
                System.out.println("Invalid category. Skipping this book.");
                i--; 
            }
        }

        System.out.println("\n-- Book Details --");
        for (Book book : books) {
            book.display();
        }

        sc.close();
    }
}

