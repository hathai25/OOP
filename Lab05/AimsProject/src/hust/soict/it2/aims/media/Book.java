package hust.soict.it2.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable {
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
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
	
	public Book(String title, String category, float cost, List<String> authors, String content) {
		// TODO Auto-generated constructor stub
		super(title, category, cost);
		setAuthors(authors);
		setContent(content);
		id++;
	}
	public int compareTo(Object obj) {
		return this.getTitle().compareTo(((Media) obj).getTitle());
	}
	public void processContent() {
		if (getContent() != "") {
			String tokens[] = content.split(" ");
			for (String token : tokens) {
				contentTokens.add(token);
			}
			Collections.sort(contentTokens);
			for (String token : contentTokens) {
				Integer count = wordFrequency.get(token);
				if (count == null) {
					count = 0;
				}
				wordFrequency.put(token, count + 1);
			}
		}		
	}
	@Override
	public String toString() {		
		return this.title + " " + this.category + " " + this.cost + " " + this.content + " " + contentTokens.toString() + " " + wordFrequency.toString();
	}


}
