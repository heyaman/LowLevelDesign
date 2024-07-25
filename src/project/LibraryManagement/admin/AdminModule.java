package project.LibraryManagement.admin;

import project.LibraryManagement.accessor.DBAccessor;
import project.LibraryManagement.data.BookCopy;
import project.LibraryManagement.data.BookDetails;

import java.util.Map;

public class AdminModule {
    public BookCopy issuedBook(String bookname){
        return null;
    }
    public BookCopy addBook(Map<String, String>bookDetails){
        DBAccessor.addBook(bookDetails);
        return new BookCopy(new BookDetails(bookDetails.get("name"), bookDetails.get("authorName")));
    }
}
