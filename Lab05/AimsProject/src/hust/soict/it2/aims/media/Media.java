package hust.soict.it2.aims.media;

public class Media {
	
	protected String title;
	protected String category;
	protected float cost;
	protected int id = 0;
	
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
		id++;
	}
	
}
