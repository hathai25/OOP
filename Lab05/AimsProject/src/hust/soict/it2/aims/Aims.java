package hust.soict.it2.aims;

import hust.soict.it2.aims.disc.*;
import hust.soict.aims.order.*;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		Order anOrder2 = new Order();
		Order anOrder3 = new Order();
		Order anOrder4 = new Order();
		Order anOrder5 = new Order();
		Order anOrder6 = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger ALlers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 25.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Em cua ngay hom qua", "Pop", "M-TP", 90, 19.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Con mua ngang qua", "Pop", "M-TP", 90, 19.99f);
		//add & remove the dvd to the order 
		anOrder.addDigitalVideoDisc1(dvd1, dvd2, dvd3);
		anOrder2.addDigitalVideoDisc1(dvd1, dvd2, dvd3);
		anOrder3.addDigitalVideoDisc1(dvd1, dvd2, dvd3);
		anOrder4.addDigitalVideoDisc1(dvd1, dvd2, dvd3);
		anOrder5.addDigitalVideoDisc1(dvd4, dvd2, dvd3, dvd5);
		//print cost
		anOrder.printOrder();
		anOrder2.printOrder();
		anOrder3.printOrder();
		anOrder4.printOrder();
		anOrder5.printOrder();
	}

}
