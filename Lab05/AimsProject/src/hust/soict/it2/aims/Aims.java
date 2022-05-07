package hust.soict.it2.aims;

import hust.soict.it2.aims.media.DigitalVideoDisc;
import hust.soict.it2.aims.media.Media;
import hust.soict.it2.aims.order.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
	private static List<Media> storeMedia = new ArrayList<>();
	private static List<Order> orders = new ArrayList<>();
	
	public static void showMenu() {
		storeMedia.add(new Media("The Lion King", "Animation", 19.95f));
		storeMedia.add(new Media("Star Wars", "Science Fiction", 25.95f));
		storeMedia.add(new Media("Aladdin", "Animation", 18.99f));		
		storeMedia.add(new Media("Em cua ngay hom qua", "Pop", 19.99f));
		storeMedia.add(new Media("Con mua ngang qua", "Pop", 19.99f));
		System. out .println("Order Management Application: ");
		System. out .println("--------------------------------");
		System. out .println("1. Create new order");
		System. out .println("2. Add item to the order");
		System. out .println("3. Delete item by id");
		System. out .println("4. Display the items list of order");
		System. out .println("0. Exit");
		System. out .println("--------------------------------");
		System. out .println("Please choose a number: 0-1-2-3-4");
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			String choice = keyboard.nextLine();
			switch(choice) {
				case "1":
					orders.add(new Order());
					break;
				case "2":
					String mediaInput = "";
					mediaInput += keyboard.nextLine();
					for (Media media : storeMedia) {
						if (media.getTitle().equals(mediaInput)) {
							orders.get(orders.size()-1).addMedia(media);
							break;
						}
					}
					break;
				case "3":
					int idInput = keyboard.nextInt();
					for (Media media : storeMedia) {
						if (media.getId() == idInput) {
							orders.get(orders.size()-1).removeMedia(media);
							break;
						}
					}
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
		// Create a new dvd object and set the fields
		
		showMenu();

		
	}

}
