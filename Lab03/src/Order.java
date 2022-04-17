
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
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		int tempQty = getQtyOrdered();
		if (tempQty >= 10) {
			System.out.println("The order is already full");
		}	else {
			itemsOrdered[tempQty] = disc;
			setQtyOrdered(++qtyOrdered);
			System.out.println("'" + disc.getTitle() + "'" + " has been added");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int tempQty = getQtyOrdered();
		int count = 0;
		for (int i = 0; i<tempQty; i++) {
			if (disc.getTitle() == itemsOrdered[i].getTitle()) {
				count++;
				for (int j = i; j<tempQty; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				setQtyOrdered(--qtyOrdered);
				System.out.println("'" + disc.getTitle() + "'" + " has been removed");
				break;
			}
		}
		if (count == 0) System.out.println("'" + disc.getTitle() + "'" + " not found");
	}
	public float totalCost() {
		int order = getQtyOrdered();
		float total = 0;
		for (int i = 0; i < order; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}	
}
