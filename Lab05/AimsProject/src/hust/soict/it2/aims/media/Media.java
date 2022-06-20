package hust.soict.it2.aims.media;

public abstract class Media implements Comparable {
	
	protected String title;
	protected String category;
	protected float cost;
	private static int counter = 0;
    protected int id;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Media(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		setTitle(title);
		setCategory(category);
		setCost(cost);
		setId(counter++);
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) throw (new NullPointerException());
		if (o.getClass() != this.getClass()) throw (new ClassCastException());
		final Media other = (Media) o;
		if (this.title != other.title) return false;
		return true;
	}
	public int compareTo(Object o) {
		if (o == null) throw (new NullPointerException());
		if (o.getClass() != this.getClass()) throw (new ClassCastException());
		final Media other = (Media) o;
		return Float.compare(this.cost, other.cost);
	}

}
