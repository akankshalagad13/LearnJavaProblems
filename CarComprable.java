package comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Create a Car class that implements Comparable and compares cars based on their top speed.
 */
class Car implements Comparable<Car>{
	private String name;
	private int speed;
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + "]";
	}

	public Car(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.speed-o.speed;
	}
	
	
}
public class CarComprable {
	public static void main(String[] args) {
		ArrayList<Car> ar=new ArrayList<>();
		ar.add(new Car("Toyota Camry", 420));
		ar.add(new Car("Honda Accord", 320));
		ar.add(new Car("Ford Mustang", 250));
		ar.add(new Car("BMW 3 Series", 270));
		System.out.println("given data");
		System.out.println(ar);
		System.out.println();
		System.out.println("sort car by their speed");
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
	}

}
