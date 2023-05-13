package com.labsessionproject.Dao;
import java.util.List;

import org.hibernate.*;
import com.labsessionproject.model.Book;
import com.labsessionproject.util.HibernateUtil;
import com.maven.model.Student;


public class BookDao {
	//save the book
	public void saveBook(Book book) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession())//Hibernateutil is the file and its connected
        {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(book);

            // commit the transaction and is used for save the changes
            transaction.commit();
        }
        catch (Exception e) 
        {
            if (transaction != null) 
            {
                transaction.rollback();// roll back is the what are the  last entries that are shown
            }
        }
    }
	//update the book
	public void updateBook(Book book) 
	{
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.saveOrUpdate(book);

            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
    }
	public Book getBookById(long id) 
	{
        Transaction transaction = null;
        Book book = null; //?*
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start the transaction
            transaction = session.beginTransaction();

            // get student object
            book= session.get(Book.class, id);
            //book = session.load(Book.class, id);
            // commit the transaction
            transaction.commit();
        } 
        catch (Exception e)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
        }
        return book;
    }
	//indicates the named complier warning should be suppressed
		@SuppressWarnings("unchecked")
	    public List < Book > getAllBook1() 
		{
	        Transaction transaction = null;
	        List < Book > books = null; //*
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            // get students
	            books = session.createQuery("from Book").list();
	            //student = session.load(Student.class, id);
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
	        return books;
	    }
		public void deletebook(long id) {
	        Transaction transaction = null;
	        Book book = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            book = session.get(Book.class, id);
	            // get student object
	            session.delete(book);
	            //student = session.load(Student.class, id);
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	               // transaction.rollback();
	            }
	        }
		}
		public void deletebook(int id) {
			Transaction transaction = null;
	        Book book = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start the transaction
	            transaction = session.beginTransaction();

	            book = session.get(Book.class, id);
	            // get student object
	            session.delete(book);
	            //student = session.load(Student.class, id);
	            // commit the transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	               // transaction.rollback();
	            }
	        }
			
		}

}