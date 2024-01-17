package comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Create a class Book that implements Comparable and compares books based on their titles.
 */
class Book implements Comparable<Book>{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}
	
}
public class BokkComprable {
	public static void main(String[] args) {
		ArrayList<Book> ar=new ArrayList<>();
		ar.add(new Book("Think and grow rich"));
		ar.add(new Book("ikigai:japanese secrte to happy life"));
		ar.add(new Book("Alchemist"));
		ar.add(new Book("animal farm"));
		System.out.println("*******Given data********");
		System.out.println(ar);
		System.out.println();
		System.out.println("*******sorted by book title********");
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
	}

}
