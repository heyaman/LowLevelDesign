package project.LibraryManagement.searcher;

import project.LibraryManagement.data.BookCopy;

import java.util.List;

public interface BookSearcher {
    List<BookCopy> search(String str);
}
