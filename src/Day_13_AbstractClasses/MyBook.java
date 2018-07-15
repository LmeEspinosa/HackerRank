package Day_13_AbstractClasses;

import java.util.Scanner;

class MyBook extends Book {
	int price;
    
	MyBook(String title, String author,int price) {
		super(title, author);
		this.price=price;	
	}

	@Override
	void display() {
		System.out.println("Title: "+super.title);
		System.out.println("Author: "+super.author);
		System.out.println("Price: "+this.price);
		
	}
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String title = scanner.nextLine();
	        String author = scanner.nextLine();
	        int price = scanner.nextInt();
	        scanner.close();

	        Book book = new MyBook(title, author, price);
	        book.display();
	    }	
	

}
