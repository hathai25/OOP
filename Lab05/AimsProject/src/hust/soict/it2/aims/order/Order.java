package hust.soict.it2.aims.order;

import hust.soict.it2.aims.disc.*;
import java.util.Calendar;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	
	public String dateOrdered;
	
	public String getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	
	public static final int MAX_LIMITED_ORDERS = 5;
	
	private static int nbOrders = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
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
	//method
	//add single disc
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int tempQty = getQtyOrdered();
		if (tempQty >= 10) {
			System.out.println(disc.getTitle() + " can't be added. The order is already full!");
		}	else {
			itemsOrdered[tempQty] = disc;
			setQtyOrdered(++qtyOrdered);
		}
	}
	//add an array disc
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int tempQty = getQtyOrdered();
		for (int i = 0; i < dvdList.length; i++) {
			if (tempQty < 10) {
				addDigitalVideoDisc(dvdList[i]);
				tempQty += 1;
				setQtyOrdered(tempQty);
			}	else {
				System.out.println(dvdList[i].getTitle() + " can't be added. The order is already full!");
			}		
		}
	}
	//add arbitrary disc
	public void addDigitalVideoDisc1(DigitalVideoDisc ... args) {
		int tempQty = getQtyOrdered();
		for (DigitalVideoDisc disc: args) {
			if (tempQty < 10) {
				addDigitalVideoDisc(disc);
				tempQty += 1;
				setQtyOrdered(tempQty);
			}	else {
				System.out.println(disc.getTitle() + " can't be added. The order is already full!");
			}		
		}
	}
	//add dvd1, dvd2
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc1(dvd1,dvd2);
	}
	//remove disc
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int tempQty = getQtyOrdered();
		int count = 0;
		for (int i = 0; i<tempQty; i++) {
			if (disc.getTitle() == itemsOrdered[i].getTitle()) {
				count++;
				for (int j = i; j<tempQty-1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				setQtyOrdered(--qtyOrdered);
				System.out.println(qtyOrdered + ". '" + disc.getTitle() + "'" + " has been removed");
				break;

			}
		}
		if (count == 0) System.out.println("'" + disc.getTitle() + "'" + " not found");
	}
	//get lucky item
	public DigitalVideoDisc getALuckyItem() {
		return itemsOrdered[(int)(Math.random()*qtyOrdered)+1];
	}
	//total bill
	public float totalCost() {
		int order = getQtyOrdered();
		float total = 0;
		for (int i = 0; i < order; i++) {
			total += itemsOrdered[i].getCost();
		}		
		return total;
	}
	//print Order
	public void printOrder() {
		System.out.println("\n*****************************Order*********************************");
		System.out.println("Date: " + getDateOrdered());
		System.out.println("Ordered Items: ");
		for (int i = 0; i<getQtyOrdered(); i++) {
			System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "+ itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + " $");
		}
		DigitalVideoDisc freeItem = getALuckyItem();
		System.out.println("Congratulation! You can get the " + freeItem.getTitle() + " for free!");
		System.out.println("Total cost: " + (totalCost() - freeItem.getCost()));
		System.out.println("*******************************************************************");
	}	
}
