package by.training.javabasics27.mainTask_2;

import java.util.ArrayList;

// Создайте класс Payment (покупка), сформируйте покупку из нескольких товаров.

public class L8T2_Payment {

	public L8T2_Payment() {

		ArrayList<Product> payment = new ArrayList<Product>();

		payment.add(new Product("Ice Cream", 5.5));
		payment.add(new Product("Milk", 2.3));
		payment.add(new Product("Cheese", 7.9));
		payment.add(new Product("Bread", 0.8));
		payment.add(new Product("Waffles", 3.5));
	}
}

class Product {
	
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
