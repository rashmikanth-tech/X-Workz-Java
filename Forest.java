class Forest{
	public static void nature(){
		int noOfTree = 10000;
		String nameOfTree = "Sandle";
		System.out.println("Tree Details");
		System.out.println("noOfTree"+noOfTree+"\nnameOfTree"+nameOfTree);
	}
	public static void animals(){
		int noOfAnimals = 1000;
		System.out.println("noOfAnimals:"+noOfAnimals);
	}
	
	public static void birds(){
		short apprxNoOfBirds= 2000;
		System.out.println("apprxNoOfBirds:"+apprxNoOfBirds);
	}
	
	public static void lake(){
		byte TotalLakes = 4;
		System.out.println("TotalLakes"+TotalLakes);
	}
	
	public static void TypesofFruit(){
		int NoofTypeFruit = 60;
		System.out.println("NoofTypeFruit"+NoofTypeFruit);
	}
	
	public static void main (String [] args){
		Forest.nature();
		Forest.animals();
		Forest.birds();
		Forest.lake();
		Forest.TypesofFruit();
	}
	
	public static void homedetails(){
		Home.size();
		Home.rooms();
		Home.specification();
		Home.items();
		Home.rules();
}
}