package meatshop_java_basics.entities;

public class Product {

private String name;
private String meatType;
private double price;
private int code;

public Product() {
	
}

public Product(String name, String meatType, double price, int code) {
	this.name = name;
	this.meatType = meatType;
	this.price = price;
	this.code = code;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMeatType() {
	return meatType;
}

public void setMeatType(String meatType) {
	this.meatType = meatType;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

@Override
public String toString() {
	return "Product [name=" + name + ", meatType=" + meatType + ", price=" + price + ", code=" + code + "]";
}


}
