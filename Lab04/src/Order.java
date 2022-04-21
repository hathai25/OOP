
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
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
			System.out.println(qtyOrdered + ". '" + disc.getTitle() + "'" + " has been added");
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
	//total bill
	public float totalCost() {
		int order = getQtyOrdered();
		float total = 0;
		for (int i = 0; i < order; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}	
}
