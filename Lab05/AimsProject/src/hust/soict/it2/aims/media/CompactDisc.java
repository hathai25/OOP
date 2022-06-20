package hust.soict.it2.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.it2.aims.PlayerException;

public class CompactDisc extends Disc implements Playable, Comparable {
	//fields
	private String artist;
	private int length = 0;
	private List<Track> tracks = new ArrayList<Track>();
	//getters & setters
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	//constructor
	public CompactDisc(String title, String category, float cost,  String director, String artist) {
		super(title, category, cost, director);
		setArtist(artist);
		id++;
	}
	//methods
	public void addTrack(String title, int length) {
		int count = 0;
		for (Track i : tracks) {
			if (i.getTitle() == title) {
				System.out.println("The track is already in the CD!");
				count++;
				break;
			}
		}
		if (count == 0) tracks.add(new Track(title, length));
	}
	public void removeTrack(String title) {
		int count = 0;
		for (Track i : tracks) {
			if (i.getTitle() == title) {
				tracks.remove(i);
				count++;
				break;
			}	
		}
		if (count == 0) {
			System.out.println("No track founded in the CD");
		}
	}
	public int getLength() {
		for (Track i : tracks) {
			this.length += i.getLength();
		}
		return length;
	}
	@Override
	public void play() throws PlayerException {
		if (this.getLength() <= 0) {
			System.err.println("ERROR: CD length is 0");
			throw (new PlayerException());
		}
		System.out.println("Playing " + getTitle() + " by " + getArtist() + ", length: " + getLength());
		for (Track i : tracks) {
			try {
				i.play();
			}	catch (PlayerException e) {
				e.printStackTrace();
			}	
		}
	}
	public int compareTo(Object obj) {
		return this.getTitle().compareTo(((Media) obj).getTitle());
	}
}
