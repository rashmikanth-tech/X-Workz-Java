class Broker{
public static void brokerage(String vegitable,int quantity){
	System.out.println("Broker manage brokerraage of "+quantity+ "kg of " +vegitable);
	Farmer.farm(vegitable,quantity);
}
}