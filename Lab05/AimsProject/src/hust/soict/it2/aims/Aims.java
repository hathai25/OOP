package hust.soict.it2.aims;

import hust.soict.it2.aims.media.Book;
import hust.soict.it2.aims.media.CompactDisc;
import hust.soict.it2.aims.media.DigitalVideoDisc;
import hust.soict.it2.aims.order.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
	private static List<Order> orders = new ArrayList<>();
	
	public static void showMenu() {
		System. out .println("Order Management Application: ");
		System. out .println("--------------------------------");
		System. out .println("1. Create new order");
		System. out .println("2. Add item to the order");
		System. out .println("3. Delete item by id");
		System. out .println("4. Display the items list of order");
		System. out .println("0. Exit");
		System. out .println("--------------------------------");
		Scanner input = new Scanner(System.in);
		while(true) {
			System. out .println("Please choose a number: 0-1-2-3-4");
			String choice = input.nextLine();
			switch(choice) {
				case "1":
					orders.add(new Order());
					break;
				case "2":
					System.out.println("Choose the media type to add: \n1. Book \n2. Compact Disc \n3. Digital Video Disc");
					String type = input.nextLine();
					switch (type) {
						case "1":
							System.out.println("Enter book title: ");
							String title1 = input.nextLine();
							System.out.println("Enter book category: ");
							String category1 = input.nextLine();
							System.out.println("Enter book cost: ");
							float cost1 = Float.parseFloat(input.nextLine());
							System.out.println("Enter book authors: ");
							String author1 = input.nextLine();
							List<String> authors = new ArrayList<>();
							authors.add(author1);
							orders.get(orders.size()-1).addMedia(new Book(title1, category1, cost1, authors));
							break;
						case "2":
							System.out.println("Enter CD title: ");
							String title2 = input.nextLine();
							System.out.println("Enter CD category: ");
							String category2 = input.nextLine();
							System.out.println("Enter CD cost: ");
							float cost2 = Float.parseFloat(input.nextLine());
							System.out.println("Enter CD director: ");
							String director2 = input.nextLine();
							System.out.println("Enter CD artist: ");
							String artist2 = input.nextLine();
							orders.get(orders.size()-1).addMedia(new CompactDisc(title2, category2, cost2, director2, artist2));
							CompactDisc temp = new CompactDisc(title2, category2, cost2, director2, artist2);
							while(true) {
								System.out.println("Add your tracks? \n1. Yes\n2. No");
								int ans = Integer.parseInt(input.nextLine());
								if (ans == 1) {
									System.out.println("Enter track title: ");
									String title = input.nextLine();
									System.out.println("Enter track length: ");
									int length = Integer.parseInt(input.nextLine());
									temp.addTrack(title, length);
								}	else break;
							}
							System.out.println("Would you like to play it?\n1. Yes\n2. No");
							int choice2 = Integer.parseInt(input.nextLine());
							if (choice2 == 1) temp.play();
							break;
						case "3":
							System.out.println("Enter DVD title: ");
							String title3 = input.nextLine();
							System.out.println("Enter DVD category: ");
							String category3 = input.nextLine();
							System.out.println("Enter DVD cost: ");
							float cost3 = Float.parseFloat(input.nextLine());
							System.out.println("Enter DVD length: ");
							int length3 = Integer.parseInt(input.nextLine());
							System.out.println("Enter DVD director: ");
							String director3 = input.nextLine();
							orders.get(orders.size()-1).addMedia(new DigitalVideoDisc(title3, category3, cost3, length3, director3));
							System.out.println("Would you like to play it?\n1. Yes\n2. No");
							int choice3 = Integer.parseInt(input.nextLine());
							if (choice3 == 1) new DigitalVideoDisc(title3, category3, cost3, length3, director3).play();
							break;
					}
					break;
				case "3":
					System.out.print("Enter the media id to delete: ");
					int idInput = Integer.parseInt(input.nextLine());
					orders.get(orders.size()-1).removeMedia(idInput);
					break;
				case "4":
					orders.get(orders.size()-1).printOrder();
					break;
				case "0":
					System.out.println("Exiting...");
					System.exit(0);
				default:
					System.out.println("Invalid input!");
			}
		}
	}
	
	public static void main(String[] args) {	
		MemoryDaemon thread = new MemoryDaemon();
		Thread wtf = new Thread(thread);
		wtf.setDaemon(true);
		wtf.start();
		showMenu();	
	}

}
