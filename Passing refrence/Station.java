class Station{
	public static void send(String item){
		System.out.println("Delivery reached station"+item);
		DeliveryGuy.accept(item);
	}
}