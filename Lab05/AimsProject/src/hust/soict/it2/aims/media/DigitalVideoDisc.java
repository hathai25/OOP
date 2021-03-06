package hust.soict.it2.aims.media;

import hust.soict.it2.aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable, Comparable {
	//Constructors
	public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
		super(title, category, cost, director);
		this.setLength(length);
		this.setDirector(director);
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
	@Override
	public void play() throws PlayerException {
		if (this.getLength() <= 0) {
			System.err.println("ERROR: DVD length is 0");
			throw (new PlayerException());
		}
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}	
	public int compareTo(Object obj) {
		return this.getTitle().compareTo(((Media) obj).getTitle());
	}
}