
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger ALlers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 25.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Em cua ngay hom qua", "Pop", "M-TP", 90, 19.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Con mua ngang qua", "Pop", "M-TP", 90, 19.99f);
		//add & remove the dvd to the order 
		DigitalVideoDisc[] discs = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd1, dvd2, dvd3, dvd4, dvd5, dvd1};
		anOrder.addDigitalVideoDisc(discs);
		anOrder.removeDigitalVideoDisc(dvd5);
		anOrder.addDigitalVideoDisc(dvd3, dvd4);
		anOrder.addDigitalVideoDisc1(dvd1, dvd2);
		//print cost
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}

}

