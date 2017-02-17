package com.serv;


import java.util.ArrayList;
import java.util.List;

import com.domain.Product;

public class ProductService {

	private static List<Product> products = new ArrayList<>();
	
	static {
		products.add(new Product("Washing Machine", "Appliance"));
		products.add(new Product("Bed", "Furniture"));
		products.add(new Product("Refrigerator", "Appliance"));
		products.add(new Product("Chair", "Furniture"));
		products.add(new Product("Dish Washer", "Appliance"));
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void deleteProduct(Product product) {
		products.remove(product);
	}
	public void updateProduct(int index, Product product) {
		products.set(index, product);
	}

}