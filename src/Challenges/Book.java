package Challenges;

public class Book {

	String title;
	String author;
	String isbn;
	static int totalBooks;
	boolean isBorrowed;

	static {
		totalBooks = 0;
	}
	{
		totalBooks++;
	}

	public void borrowBook() {
		if (isBorrowed) {
			System.out.println("Book is already borrowed");
		} else {
			this.isBorrowed = true;
			System.out.println("Enjoy the book");
		}
	}

	public void returnBook() {
		if (isBorrowed) {
			this.isBorrowed = false;
			System.out.println("Hope you enjoyed ");
		}
	}

	Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	Book(String isbn) {
		this(isbn, "unkown", "unkown");
	}

	static int getTotalNoOfBooks() {
		return totalBooks;
	}

	public static void main(String[] args) {
		Book designThings = new Book("1", "Design", "Author");
		Book myBook = new Book("2");
		System.out.println(Book.getTotalNoOfBooks());
		designThings.borrowBook();	
		myBook.borrowBook();
		designThings.borrowBook();
		designThings.returnBook();
		System.out.println(Book.getTotalNoOfBooks());
	}

}
