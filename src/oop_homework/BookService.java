package oop_homework;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		
		List<Book> finalBooks = new ArrayList<Book>();	
		
		
		for(Book singleBook:books) {
			for(Author author2: singleBook.authors) {
				if (author2==author) {
					finalBooks.add(singleBook);
				}
			}
		}
		Book[] finalList = new Book[ finalBooks.size() ];
		finalBooks.toArray(finalList);
		return finalList;
	}
	
	
	
	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		
		List<Book> finalBooks = new ArrayList<Book>();	
		
		
		for(Book singleBook:books) {
	
			if (singleBook.publisher==publisher) {
					finalBooks.add(singleBook);
			}
			
		}
		Book[] finalList = new Book[ finalBooks.size() ];
		finalBooks.toArray(finalList);
		return finalList;
	}
	
		
		
		
		
	
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		List<Book> finalBooks = new ArrayList<Book>();	
		
		
		for(Book singleBook:books) {
			if(singleBook.publishingYear>=yearFromInclusively) {
			finalBooks.add(singleBook);
			}
			
		}
		Book[] finalList = new Book[ finalBooks.size() ];
		finalBooks.toArray(finalList);
		return finalList;
	}
	
		
		
	}

