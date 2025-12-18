package Library.Model;

import Library.Model.Controller.LibraryController;
import Library.Model.View.LibraryView;

import java.util.Scanner;

public class Main {
    static void main() {


        Scanner sc = new Scanner(System.in);
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(view);

        while (true) {
            view.showMenu();
            System.out.println("Choose an option");

            int choice = sc.nextInt();


            if (choice == 1) {
                System.out.println("Enter the book Id");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the book name");
                String name = sc.nextLine();

                System.out.println("Enter the book author");
                String author = sc.nextLine();

                controller.addBook(id,name,author);

            } else if (choice == 2) {
                controller.viewBooks();
            } else if (choice==3) {

                System.out.println("Thank you");
                break;

            }
        }
        sc.close();
    }
}
