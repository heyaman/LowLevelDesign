package LibraryManagement.api;

import LibraryManagement.admin.AdminModule;
import LibraryManagement.auth.UserAuthenticator;
import LibraryManagement.data.BookCopy;

import java.util.*;

public class AdminAPI {
    public AdminAPI(AdminModule adminModule) {
        this.adminModule = adminModule;
    }

    private final AdminModule adminModule;
    public BookCopy issueBook(String accessToken, String bookName) throws Exception {
        if(bookName==null){
            throw new IllegalArgumentException("book name not found");
        }
        if(!UserAuthenticator.validateAccessToken(accessToken)){
            throw new IllegalAccessException("access token expire");
        }
        return this.adminModule.issuedBook(bookName);

    }
    public  void addBook(Map<String,String> bookDetails){
        if(bookDetails==null){
            throw new IllegalArgumentException("book detials missing");
        }

    }
    public void removeBook(){

    }
    public void blockMember(){}
    public void returnBook(){}
}
