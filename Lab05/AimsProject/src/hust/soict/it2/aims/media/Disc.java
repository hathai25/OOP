package hust.soict.it2.aims.media;

public class Disc extends Media {
	//attributes
	private int length;
	private String director;
	//methods
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	//constructor
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		setDirector(director);
	}
}
