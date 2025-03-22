class Home{
	public static void size(){
		short width = 30;
		short height = 40;
			System.out.println("Size of house");
			System.out.println("width::"+width+"\nheight:"+height);
	}
	
	public static void rooms(){
		byte rooms = 2;
		byte kitchen  = 1;
		byte bathroom = 2 ;
			System.out.println ("no of rooms");
			System.out.println ("Bedrooms:"+rooms+ "\nKitchen"+kitchen+"\nbathroom"+bathroom);
	}
	
	public static void specification(){
		String free = "water";
		String current = "paid";
			System.out.println ("Specification");
			System.out.println ("free"+free+"\ncurrent"+current);
	}
	
	public static void items() {
		String preeinstalled = "fan";
		String other = "water heater";
			System.out.println("free of cost on");
			System.out.println("preeinstalled:"+preeinstalled+"\nother:"+other);
		}
		
	public static void rules(){
		String clean = "maintain cleen home";
		String scratch = "Do not make mark on paint";
			System.out.println("rules");
			System.out.println("clean:"+clean+"\nscratch:"+scratch);
	}
	public static void Bike (){
		Bike.specifications();
		Car.specifications();
	}
	
		
}
	