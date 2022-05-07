package hust.soict.it2.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//Constructors
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(director, director, cost);
		this.director = director;
		this.length = length;
		id++;
	}
	//method
	public boolean search(String title) {
		String[] split = title.split(" ");
		for (String x : split) {
			if (this.title.contains(x)) return true;
		}	
		return false;
	}	
}