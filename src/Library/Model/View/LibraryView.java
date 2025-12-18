package Library.Model.View;

import Library.Model.Book;

import java.util.List;

public class LibraryView {

    public void showMenu(){
        System.out.println("1.Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Exit");
    }


    public void showBooks(List<Book> books ){

        System.out.println("\nLibrary Books");

        for(Book b : books){
            System.out.println(
                    b.getId() + " | " + b.getName() + " | " + b.getAuthor()
            );
        }

    }

    public void showMessage(String msg){
        System.out.println(msg);
    }

}
