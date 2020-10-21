package onlineshopping;

import java.util.Scanner;

public class Product {
	
	     int id ;
	     String name;
	     double price;
	
    Product()
    {
    	id=0;
    	name="null";
    	price=0;
   }
    
    Product(int id,String name,double price)
    {

 	   this.id=id;
 	   this.name=name;
 	   this.price=price;

    }
    
    public void SetCustomer()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter name :"+"\n"+"Enter address :"+"\n"+"Enter phone number :");
    	
    }
    public void display()
	{
		System.out.println("Product id :"+id+" Product name : "+name+" Product price : "+price+"\n");
	}
	
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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