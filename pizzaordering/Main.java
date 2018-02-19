package pizzaordering;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
DecimalFormat df = new DecimalFormat("#.##");		
Scanner keyboard = new Scanner (System.in);	

// Variables
	String name;
	char crustType;
	String crust="";
	int inch;
	double cost = 0.0;
	final double taxRate;
	double tax;
	double total;
	double finalTotal;
	int numberOfToppings =0;
	int numberOfToppings2 =0;
	int numberOfToppings3 =0;
	int numberOfToppings4 =0;
	int numberOfToppingsTotal;
	
	String toppings = "Cheese";
	
	
	
	System.out.println("What is your name?");
	name = keyboard.nextLine();
	boolean delivery = false;
	int deliveryFee=0;
	
	System.out.println("Do you require delivery?");
	
	
	delivery = keyboard.nextBoolean();
	if(delivery == true){ 
	deliveryFee=4;
	System.out.println("Your delivery charge is %4 (not including tip)");
	}
	System.out.println("What size of pizza do you need? 10, 12, 14, or 16  1000 (inches)");
	inch = keyboard.nextInt();
	if (inch == 10){
	cost = 12.99;}
	else if  (inch == 12){
cost = 13.99;}	
else if (inch == 14){	
	cost = 13.99;
}  else if (inch == 16){
cost = 15.34;
	
	}else if (inch == 1000){ 
 cost = 10000;	
} else if(inch != 10 && inch != 12 && inch != 14 && inch != 16 && inch != 1000){
System.out.println("Error, defaulted to 10");
cost = 9.99;
}
keyboard.nextLine();
System.out.println("What type of crust do you want?(H)and-tossed, (T)hin crust, (D)eep-dish enter H, T, or D");
crustType = keyboard.nextLine().charAt(0);

if(crustType == 'H' || crustType == 'h'){
crust = "Hand Tossed";
}else if (crustType == 'T' || crustType == 't')	{
crust = "Thin Crust";
	} else if (crustType == 'D' || crustType == 'd'){
	crust = "Deep-dish";
	
	//Additional toppings
	System.out.println("All pizzas come with cheese");
	System.out.println("Additional topping are $1.25");
	
	//Pepperonni
	System.out.println("Do you want Pepperroni?(Y/N)");
	numberOfToppings = keyboard.nextLine().charAt(0);
	if(numberOfToppings=='Y' || numberOfToppings == 'y'){
	numberOfToppings++;
	toppings += "and Pepperoni";
	}
	
	
	System.out.println("Do you want onion? (Y/N)");
	numberOfToppings2 = keyboard.nextLine().charAt(0);
	if( numberOfToppings2 == 'Y' || numberOfToppings2 == 'y'){
		numberOfToppings2++;
		toppings += "and onion";
	}
	System.out.println("Do you want tomato? (Y/N)");
	numberOfToppings3 = keyboard.nextLine().charAt(0);
	if( numberOfToppings3 == 'Y' || numberOfToppings3 == 'y'){
		numberOfToppings3++;
		toppings += "and tomato";

	
	}
	System.out.println("Do you want chicken? (Y/N)");
	numberOfToppings4 = keyboard.nextLine().charAt(0);
	if( numberOfToppings4 == 'Y' || numberOfToppings4 == 'y'){
		numberOfToppings4++;
		toppings += "and chicken";
	
	}
	}

	
	numberOfToppingsTotal = (numberOfToppings) + (numberOfToppings2) + (numberOfToppings3) + (numberOfToppings4);
	//Calculate
	total = (cost) + (numberOfToppingsTotal * 1.25) + (deliveryFee);
	tax= total * taxRate;
	finalTotal = total * ( 1 + taxRate);
	
	// Payment
	System.out.println(name + "your order is ready:");
	System.out.println(inch + " inch pizza");
	System.out.println(crust + ", " + toppings);
	System.out.println("Your ");{
	System.out.println("Order Cost: $" + df.format(total) );
	System.out.println("Tax: $" + df.format(tax));
	System.out.println("Total Due: $" + df.format(finalTotal));
	}
	}
}
	