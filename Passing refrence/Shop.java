class Shop{
	public static void sell(String vegitable,int quantity){
		System.out.println("Shop sell "+quantity+" KG of "+vegitable);
		Agent.purchase(vegitable,quantity);
	}
}