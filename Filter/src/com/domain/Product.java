package com.domain;

public class Product {
	
	private String productName;
	private String productCategory;
	public String getProductName() {
		return productName;
	}
	public Product(String productName, String productCategory)
	{
		this.productName=productName;
		this.productCategory=productCategory;
		
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCategory=" + productCategory + "]";
	}
	
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}
	
	
	
	

}
