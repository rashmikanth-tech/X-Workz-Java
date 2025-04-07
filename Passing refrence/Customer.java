class Customer{
public static void buy(String vegitable,int quantity){
	System.out.println("Customer puchased "+quantity+" kg of "+vegitable);
	Shop.sell(vegitable,quantity);
}
}
