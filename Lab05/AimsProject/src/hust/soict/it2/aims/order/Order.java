package hust.soict.it2.aims.order;

import hust.soict.it2.aims.media.Media;
import java.util.ArrayList;
import java.util.Calendar;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
	public String dateOrdered;
	protected int id;
	public String getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	
	public static final int MAX_LIMITED_ORDERS = 5;
	
	private static int nbOrders = 0;

	//constructor
	public Order() {
		super();
		if (nbOrders < MAX_LIMITED_ORDERS) {
			nbOrders++;
			Calendar orderDate = Calendar.getInstance();
			setDateOrdered(orderDate.get(Calendar.DATE) + "/" + orderDate.get(Calendar.MONTH) + "/" + orderDate.get(Calendar.YEAR) + " - " + orderDate.get(Calendar.HOUR_OF_DAY) + ":" + orderDate.get(Calendar.MINUTE));
			System.out.println("Order #" + nbOrders + " created!");
		}	else {
			System.out.println("You've reached maximum orders!");
		}
	}
	//add media
	public void addMedia(Media newMedia) {
			if (itemsOrdered.size() < 10) {
				itemsOrdered.add(newMedia);
				System.out.println(newMedia.getTitle() + " - ID: " + newMedia.getId() + " added!");
			}	else {
				System.out.println(newMedia.getTitle() + " can't be added. You've reached your maximum media!");
			}
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public void removeMedia(int id) {
		int count = 0;
		for (Media i : itemsOrdered) {
			if (i.getId() == id) {
				count++;
				itemsOrdered.remove(i);
				System.out.println(i.getTitle() + " removed!");
				break;
			}
		}	
		if (count == 0) {
			System.out.println("ID " + id + " not found in your order");
		}
	}

	//get lucky item
	public Media getALuckyItem() {
		return itemsOrdered.get((int)(Math.random()*itemsOrdered.size()));
	}
	//total bill
	public float totalCost() {
		float total = 0;
		for (Media i : itemsOrdered) {
			total += i.getCost();
		}		
		return total;
	}
	//print Order
	public void printOrder() {
		System.out.println("\n*****************************Order*********************************");
		System.out.println("Date: " + getDateOrdered());
		System.out.println("Ordered Items: ");
		if (itemsOrdered.isEmpty()) {
			System.out.println("No items added!");
		}	else {
			int x = 0;
			for (Media i : itemsOrdered) {
				System.out.println(x+1 + ". " + i.getTitle() + " - " + i.getCategory() + ": " + i.getCost() + " $");
				x++;
			}
			Media freeItem = getALuckyItem();
			System.out.println("Congratulation! You can get the " + freeItem.getTitle() + " for free!");
			System.out.println("Total cost: " + (totalCost() - freeItem.getCost()));
			System.out.println("*******************************************************************");

		}
	}	
}
