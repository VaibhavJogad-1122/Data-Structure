
public class Books {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private double price;
	private Books nextBook;
	
	public Books(int bookId, String bookTitle, String bookAuthor, double price) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.nextBook=null;
	}

	public Books getNextBook() {
		return nextBook;
	}

	public void setNextBook(Books nextBook) {
		this.nextBook = nextBook;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
