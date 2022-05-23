package hust.soict.it2.aims.media;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
	public static void main(String[] args) {
		List<String> authors = new ArrayList<>();
		authors.add("sad boi");
		Book sadbook = new Book("sad", "sad novel", 100f, authors, "this is a sad story. it really is a sad one");
		sadbook.processContent();
		System.out.println(sadbook.toString());
	}
}
