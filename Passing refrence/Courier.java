class Courier{
	public static void pickup( String item){
		System.out.println("Delivery pickuped"+item);
		
	Station.send(item);
	}
}