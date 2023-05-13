package com.labsessionproject;

import java.util.*;


import com.labsessionproject.Dao.BookDao;
import com.labsessionproject.model.Book;
public class App 
{
  

 public static void main( String[] args )
    {
    	BookDao bookDao = new BookDao();

        // test savebook
       
    	  Book book =new Book(0, "A Passage to India","E.M. Foster","A Woman's Life");
          Book book1 =new Book(1,"David Copperfield","Amrita Pritam","A Suitable Boy");
          Book book2 =new Book(2,"Oliver Twist","Charles Darwin","Pinjar");
          
        
        //passing value in parameterized constructor
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        bookDao.saveBook(book);
        bookDao.saveBook(book1);
        bookDao.saveBook(book2);
       
        // test updateBooks
        book1.setBookName("fly tree");
        bookDao.updateBook(book1);
        
        

        // test getAllBooks
        List < Book > books = bookDao.getAllBook1();
        System.out.println("List of the Books:");
        books.forEach(book3 -> System.out.println(book3.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deletebooks
        bookDao.deletebook(1);
        
        

    }
}




