class All{
	public static void main(String [] args){
		String Name=Returntypes.name(6700000000l);
		System.out.println(Name);
		
		String Owner=Returntypes.ownerName("Fi");
		System.out.println("owner : "+Owner);
		
		int Food=Returntypes.Price("Biryani");
		System.out.println("Price of food is : "+Food); 
		
		int Bankbalance=Returntypes.balance(1234567818);
		System.out.println("Total Balance Is :"+Bankbalance);
		
		int price=Returntypes.getPrice(102);
		System.out.println("Price of the Source is : "+price); 
	}
}