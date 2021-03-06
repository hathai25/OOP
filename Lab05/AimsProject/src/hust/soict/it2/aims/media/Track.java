package hust.soict.it2.aims.media;

import hust.soict.it2.aims.PlayerException;

public class Track implements Playable, Comparable {
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		setTitle(title);
		setLength(length);
	}

	@Override
	public void play() throws PlayerException {
		if (this.getLength() <= 0) {
			System.err.println("ERROR: Track length is 0");
			throw (new PlayerException());
		}
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public int compareTo(Object obj) {
		return this.getTitle().compareTo(((Media) obj).getTitle());
	}
}
