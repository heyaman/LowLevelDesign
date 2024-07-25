package project.LibraryManagement.searcher;

import project.LibraryManagement.accessor.DBAccessor;
import project.LibraryManagement.data.BookCopy;

import java.util.*;

public class BookSearchByName implements BookSearcher{
    @Override
    public List<BookCopy> search(String str) {
        return DBAccessor.findBookByName(str);
    }
}
