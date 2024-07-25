package project.LibraryManagement.api;
import project.LibraryManagement.data.BookCopy;
import project.LibraryManagement.searcher.BookSearcher;

import java.util.*;

public class BookSearchAPI {
    private final BookSearcher bookSearcher;

    public BookSearchAPI(BookSearcher bookSearcher) {
        this.bookSearcher = bookSearcher;
    }

    public List<BookCopy>searchByBookName(String bookName){
        if(bookName==null){
            throw new IllegalArgumentException("book name need");
        }
        return this.bookSearcher.search(bookName);

    }

    public List<BookCopy>searchByAuthor(String authorName){
        if(authorName==null){
            throw new IllegalArgumentException("author name need");
        }
        return this.bookSearcher.search(authorName);
    }

}
