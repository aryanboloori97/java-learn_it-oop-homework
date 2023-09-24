package oop_homework;

import java.math.BigDecimal;
import java.util.Arrays;

import oop_homework_2.Cookie;
import oop_homework_2.Present;
import oop_homework_2.Sweet;

public class demo {
	public static void main(String[] args) {
		
//		Author author1 = new Author(1, null, null);
//		Author author2 = new Author(2, null, null);
//		Author author3 = new Author(3, null, null);
//		Author author4 = new Author(4, null, null);
//		
//		Author[] authors1 = {author1, author3};
//		Author[] authors2 = {author2, author4};
//		Author[] authors3 = {author1, author3, author2};
//		Author[] authors4 = {author1, author3, author2, author4};
//
//		Book book1 = new Book(1, null, authors1, null, 1970, 0, null, null);
//		Book book2 = new Book(2, null, authors3, null, 2010, 0, null, null);
//		Book book3 = new Book(3, null, authors2, null, 1960, 0, null, null);
//		Book book4 = new Book(4, null, authors4, null, 2023, 0, null, null);
//		
//		Book[] books = {book1, book2};
		
		Book[] books = new Book[] {
		new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

		new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

		new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),

		new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };

		
		
		
		BookService bookService1 = new BookService();
		
		
		Present present1 = new Present();
		Sweet sweet1 = new Cookie("TWIX", 100, 60);
		Sweet sweet2 = new Cookie("SNIKERS", 140, 85);
		Sweet sweet3 = new Cookie("TOBLERON", 90, 35);
		present1.addSweet(sweet3);
		present1.addSweet(sweet2);
		
		System.out.println(present1.calculateTotalWeight());
		System.out.println(Arrays.toString(present1.filterSweetsBySugarRange(35, 90)));
	}
}
