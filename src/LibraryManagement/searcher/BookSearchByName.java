package LibraryManagement.searcher;

import LibraryManagement.accessor.DBAccessor;
import LibraryManagement.data.BookCopy;

import java.util.*;

public class BookSearchByName implements BookSearcher{
    @Override
    public List<BookCopy> search(String str) {
        return DBAccessor.findBookByName(str);
    }
}
