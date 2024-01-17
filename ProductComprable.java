package comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Implement Comparable for a Product class considering their prices.
 */
class Product implements Comparable<Product>{
	private String product_name;
	private int price;
	private int qauntity;
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQauntity() {
		return qauntity;
	}
	public void setQauntity(int qauntity) {
		this.qauntity = qauntity;
	}
	public Product(String product_name, int price, int qauntity) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.qauntity = qauntity;
	}
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", price=" + price + ", qauntity=" + qauntity + "]";
	}
	@Override
	public int compareTo(Product o) {
		
		return this.price-o.price;
	}
	
	
}
public class ProductComprable {
	public static void main(String[] args) {
		ArrayList<Product> ar=new ArrayList<>();
		ar.add(new Product("pen", 20, 5));
		ar.add(new Product("notebook", 70, 10));
		ar.add(new Product("laptop", 50000, 2));
		ar.add(new Product("mobile",30000, 5));
		ar.add(new Product("pencil", 70, 8));
		ar.add(new Product("bottles",100,1));
		System.out.println("*********given data*********");
		System.out.println(ar);
		System.out.println();
		System.out.println("*********data sorted by price of book********");
		Collections.sort(ar);
		System.out.println(ar);

		
		
		
	}

}
