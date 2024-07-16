package LibraryManagement.searcher;

import LibraryManagement.data.BookCopy;

import java.util.List;

public interface BookSearcher {
    List<BookCopy> search(String str);
}
