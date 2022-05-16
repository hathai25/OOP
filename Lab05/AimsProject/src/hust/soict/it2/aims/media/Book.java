package hust.soict.it2.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("The author is already in the list!");
		}	else {
			authors.add(authorName);
			System.out.println("Author added successfully!");
		}
	}
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("The author is removed!");
		}	else {
			System.out.println(authorName + " not not found!");
		}
	}
	
	public Book(String title, String category, float cost, List<String> authors) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		this.authors = authors;
		id++;
	}

}
