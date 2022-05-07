package hust.soict.it2.aims.order;

import hust.soict.it2.aims.media.Media;
import java.util.ArrayList;
import java.util.Calendar;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
	public String dateOrdered;
	protected int id = 0;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
			id++;
			Calendar orderDate = Calendar.getInstance();
			setDateOrdered(orderDate.get(Calendar.DATE) + "/" + orderDate.get(Calendar.MONTH) + "/" + orderDate.get(Calendar.YEAR) + " - " + orderDate.get(Calendar.HOUR_OF_DAY) + ":" + orderDate.get(Calendar.MINUTE));
			System.out.println("Order #" + nbOrders + " created!");
		}	else {
			System.out.println("You've reached maximum orders!");
		}
	}
	//add media
	public void addMedia(Media ... args) {
		for (Media newMedia : args) {
			if (itemsOrdered.size() < 10) {
				itemsOrdered.add(newMedia);
				System.out.println(newMedia.getTitle() + " added!");
			}	else {
				System.out.println(newMedia.getTitle() + " can't be added. You've reached your maximum media!");
			}
		}	
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public void removeMedia(Media delMedia) {
		if (itemsOrdered.contains(delMedia)) {
			itemsOrdered.remove(delMedia);
			System.out.println(delMedia.getTitle() + " removed!");
		}	else {
			System.out.println(delMedia.getTitle() + " not found in your order");
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
		for (Media i : itemsOrdered) {
			int x = 0;
			System.out.println(x+1 + ". DVD - " + i.getTitle() + " - " + i.getCategory() + ": " + i.getCost() + " $");
			x++;
		}
		Media freeItem = getALuckyItem();
		System.out.println("Congratulation! You can get the " + freeItem.getTitle() + " for free!");
		System.out.println("Total cost: " + (totalCost() - freeItem.getCost()));
		System.out.println("*******************************************************************");
	}	
}
