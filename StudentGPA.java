package comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Make a Student class Comparable based on their GPA.
 */
class Student implements Comparable<Student>{
	private String name;
	private double gpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int) (this.gpa-o.gpa);
	}	
}
public class StudentGPA {
	public static void main(String[] args) {
		ArrayList<Student> ar=new ArrayList<>();
		ar.add(new Student("neha", 3.2));
		ar.add(new Student("namrata",4.5));
		ar.add(new Student("hema",8.9));
		ar.add(new Student("tina",2.3));
		ar.add(new Student("Rutuja",5.5));
		ar.add(new Student("ishwari",6.6));
		System.out.println("*****Given data*******");
		System.out.println(ar);
		System.out.println();
		System.out.println("sorted data by student GPA");
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
	}

}
