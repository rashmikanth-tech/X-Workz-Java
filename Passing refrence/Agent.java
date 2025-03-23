class Agent{
	public static void purchase(String vegitable,int quantity){
		System.out.println("Agent Purchased "+quantity+" Kg of" +vegitable);
		Broker.brokerage(vegitable,quantity);
	}
}