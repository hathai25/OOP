
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		//add the dvd to the order 
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(25.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		//add the dvd to the order 
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		//add the dvd to the order 
		anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Em cua ngay hom qua");
		dvd4.setCategory("Pop");
		dvd4.setCost(19.99f);
		dvd4.setDirector("M-TP");
		dvd4.setLength(90);
		//add the dvd to the order 
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Con mua ngang qua");
		dvd5.setCategory("Pop");
		dvd5.setCost(19.99f);
		dvd5.setDirector("M-TP");
		dvd5.setLength(90);
		//remove dvd out of the order
		anOrder.removeDigitalVideoDisc(dvd4);
		
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}

}