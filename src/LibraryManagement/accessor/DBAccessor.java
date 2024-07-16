package LibraryManagement.accessor;

import LibraryManagement.data.BookCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DBAccessor {
    private DBAccessor(){}
    public static List<BookCopy> findBookByName(String Name){
        return new ArrayList<>();
    }
    public static void addBook(Map<String,String>map){
        return;
    }
}
