package Library.Model.Controller;

import Library.Model.Book;
import Library.Model.View.LibraryView;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.List;

public class LibraryController {

    private List<Book> books = new ArrayList<>();
    private LibraryView view;



    public LibraryController(LibraryView view) {
        this.view = view;
    }

    public void addBook(int id,String name,String author){
        Book book = new Book(id,name,author);
        books.add(book);
        view.showMessage("Book Added SuccessFully");
    }



    public void viewBooks(){
        view.showBooks(books);
    }


}

