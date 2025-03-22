class Fridge{
	public static void Reqirement(){
		int current = 250;
		double space = 25*30;
			System.out.println("Reqirement");
			System.out.println("Current Reqirement:"+current+"vlots"+"\nSpcace Reqirement:"+space);
	}
	
	public static void Doors(){
		String upperDoor = "is for small items";
		String BelowDoor = "For Medium Items";
			System.out.println ("Doors");
			System.out.println ("upperDoor:"+upperDoor+ "\nBelowDoor"+BelowDoor);
	}
	
	public static void Specification(){
		String longtime = "Stroe item Fresh";
		String goodFor = "Cool Items";
			System.out.println ("Specification");
			System.out.println ("longtime:"+longtime+"\ngoodFor"+goodFor);
	}
	
	public static void items() {
		int MinimumCost = 30000;
		int MaximumCost = 200000;
			System.out.println("Fridge Cost");
			System.out.println("MinimumCost:"+MinimumCost+"\nMaximumCost:"+MaximumCost);
		}
		
	public static void warning(){
		String validity = "Do not store more than validity";
		String bestbefore = "6 moths after manufacture";
			System.out.println("Warning");
			System.out.println("validity:"+validity+"\nbestbefore:"+bestbefore);
	}
	public static void main (String[]args){
		Reqirement();
		Doors();
		Specification();
		items();
		warning();
	}
	
		
}
	