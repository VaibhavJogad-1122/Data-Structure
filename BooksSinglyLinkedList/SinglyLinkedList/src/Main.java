import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();

		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int choice;
		boolean exit = false;

		do {
			System.out.println("Enter your choice. "
							+ "1.Insertion at end by value."
							+ "2.Display."
							+ "3 Display count."
							+ "4.Insertion at Front by value." + "5.Deletion at front by value."
							+ "6.Insertion by position." + "7.Deletion by position. " + "8.Exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter book deatails, Id, Title, Author, Price");
				System.out.println(sll.insert(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
				// sll.insert(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
				break;
			case 2:
				sll.display();
				break;
			case 3:
				System.out.println("No. of books in the list:"+sll.displayCount());
				break;
			case 4:
				System.out.println("Enter book deatails, Id, Title, Author, Price to be inserted at front.");
				System.out.println(sll.insertAtFront(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()));
				break;
//			case 5:
//				sll.deleteAtFront();
			case 6:
				System.out.println("Enter book deatails, Id, Title, Author, Price and position");
				System.out.println(sll.insert(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt()));
				break;
			case 8:
				exit = true;
				break;
			default:
				break;
			}
		} while (!exit);
	}

}
