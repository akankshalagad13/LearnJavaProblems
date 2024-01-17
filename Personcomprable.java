package comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Implement the Comparable interface for a Person class that compares instances based on their age.
 */
class Person implements Comparable<Person>{
	private int height;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Person(int height) {
		super();
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [height=" + height + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.height-o.height;
	}

	
}
public class Personcomprable {
	public static void main(String[] args) {
		ArrayList<Person> ar=new ArrayList<>();
		ar.add(new Person(153));
		ar.add(new Person(144));
		ar.add(new Person(178));
		ar.add(new Person(96));
		ar.add(new Person(50));
		ar.add(new Person(170));
		ar.add(new Person(150));
		System.out.println("**********Given data*********");
		System.out.println(ar);
		System.out.println();
		System.out.println("**********sorted by height***********");
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
	}

}
