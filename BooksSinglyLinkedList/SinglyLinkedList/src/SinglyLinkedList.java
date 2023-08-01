
public class SinglyLinkedList {

	private Books head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public boolean insert(int bookId, String bookTitle, String bookAuthor, double price) {
		Books book = new Books(bookId, bookTitle, bookAuthor, price);

		if (book == null) {
			return false;
		}

		if (head == null) {
			head = book;
			return true;
		}

		Books last = head;
		while (last.getNextBook() != null) {
			last = last.getNextBook();
		}
		last.setNextBook(book);
		return true;
	}

	public boolean insert(int bookId, String bookTitle, String bookAuthor, double price, int position) {
		Books book = new Books(bookId, bookTitle, bookAuthor, price);

		if (book == null) {
			return false;
		}
		
		if(position == 1)
		{
			book.setNextBook(head);
			head=book;
			return true;
		}
		
		Books prev=head;
		for(int i=1; i<position-1; i++)
		{
			prev=prev.getNextBook();
		}
		book.setNextBook(prev.getNextBook());
		prev.setNextBook(book);
		return true;

	}
	
	public void display()
	{
		if(head==null)
		{
			return;
		}
		
		Books temp=head;
		while(temp!=null)
		{
			System.out.println("Book Id:"+temp.getBookId()+"Book Title:"+temp.getBookTitle()
			+"Book Author:"+temp.getBookAuthor()+"Book Price:"+temp.getPrice());
			temp=temp.getNextBook();
		}	
	}
	
	public int displayCount()
	{
		if(head==null)
		{
			return -1;
		}
		int count=0;
		Books temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.getNextBook();
		}
		return count;
	}
	
	public boolean insertAtFront(int bookId, String bookTitle, String bookAuthor, double price)
	{
		Books book = new Books(bookId, bookTitle, bookAuthor, price);

		if (book == null) {
			return false;
		}

		if (head == null) {
			head = book;
			return true;
		}
		book.setNextBook(head);
		head=book;
		return true;
	}
//	public void deleteAtFront()
//	{
//		if(head==null)
//		{
//			return;
//		}
//		head=head.getNextBook();
//	}
}
