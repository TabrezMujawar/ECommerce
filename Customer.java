package onlineshopping;

import java.util.Scanner;

public class Customer {
	
	public static void main (String[] args)
	{
      Product p =new Product();
       
     Product p1= new Product(01,"Mobile",10000);
     Product p2= new Product(02,"Laptop",40000);
     Product p3= new Product(03,"T.V",20000);
     Product p4= new Product(04,"Washing Machine",50000);
 
     p1.display();
     p2.display();
     p3.display();
     p4.display();
  
     int sum=0;

     for(int select=1;select<=5;select++)
     {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter product id to purchase and to generate bill enter 5");
     select=sc.nextInt();
     switch(select)
     {
     case 1: 
    	 p1.display();
    	 System.out.println("****Added to cart successfully******"+"\n");
    	 System.out.println("Enter quantity of mobile");
    	 int n1=sc.nextInt();
    	 int v1=n1*10000;
    	 sum=sum+v1;
    	 break;
     case 2: 
    	 p2.display();
    	 System.out.println("****Added to cart successfully******"+"\n");
    	 System.out.println("Enter quantity of Laptop");
    	 int n2=sc.nextInt();
    	 int v2=n2*40000;
    	 sum=sum+v2;
    	 break;
     case 3: 
    	 p3.display();
    	 System.out.println("****Added to cart successfully******"+"\n");
    	 System.out.println("Enter quantity of T.V");
    	 int n3=sc.nextInt();
    	 int v3=n3*20000;
    	 sum=sum+v3;
    	 break;
     case 4:
    	 p4.display();
    	 System.out.println("****Added to cart successfully******"+"\n");
    	 System.out.println("Enter quantity of Washing Machine");
    	int n4=sc.nextInt();
    	 int v4=n4*50000;
    	 sum=sum+v4;
    	 break;
     case 5:
    	 System.out.println("Final bill of products = "+sum);
    	 break;
     default :
    	 System.out.println("Invalid choice");
     }

     }

}
}