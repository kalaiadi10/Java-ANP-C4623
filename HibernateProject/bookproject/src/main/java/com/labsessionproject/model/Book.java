package com.labsessionproject.model;


import javax.persistence.*;
@Entity  
@Table(name = "book")
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

          @Column(name = "Book_name")
          private String BookName;

           @Column(name = "Authors_name")
           private String AuthorName;

           @Column(name = "title")
           private String title;
           
        //default constructor   
           public Book() 
       	{
       		
       	}
        

         //parameterized constructor
		public Book(int id, String bookName, String authorName, String title) {
			
			BookName = bookName;
			AuthorName = authorName;
			this.title = title;
		}
        //getter and setter method

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getBookName() {
			return BookName;
		}


		public void setBookName(String bookName) {
			BookName = bookName;
		}


		public String getAuthorName() {
			return AuthorName;
		}


		public void setAuthorName(String authorName) {
			AuthorName = authorName;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		@Override
		public String toString() {
			return "Book [id=" + id + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", title=" + title
					+ "]";
		}


	

		



		
		
		


}