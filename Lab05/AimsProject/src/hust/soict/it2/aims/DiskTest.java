package hust.soict.it2.aims;

import hust.soict.it2.aims.disc.DigitalVideoDisc;
import hust.soict.it2.aims.order.Order;

public class DiskTest {
	public static void main(String[] args ) {
		Order anOrder = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger ALlers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 25.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Em cua ngay hom qua", "Pop", "M-TP", 90, 19.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Con mua ngang qua", "Pop", "M-TP", 90, 19.99f);
		
		anOrder.addDigitalVideoDisc1(dvd4, dvd2, dvd3, dvd5);
		
		anOrder.printOrder();
		System.out.println(dvd2.search("star wars"));
		System.out.println(dvd1.search("King Lion"));
	}
}
