package LibraryManagement.data;

import LibraryManagement.util.IdGenerator;

public class BookCopy {
    private final BookDetails bookDetails;
    private String id;

    public BookCopy(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
        this.id= IdGenerator.generateId();
    }


}
