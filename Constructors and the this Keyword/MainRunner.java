class MainRunner{
	public static void main(String [] args){
		Festival ganapathi = new Festival("Ganesha Chathurthi",6,true);
		System.out.println("Festname : "+ganapathi.festName);
		System.out.println("Fest Month : "+ganapathi.month);
		System.out.println("There is a Holiday : "+ganapathi.holiday);
		System.out.println("----------Festival is Over----------");
		
		Festival mahaShivarathri = new Festival("Maha Shivarathri",2,true);
		System.out.println("Festname : "+mahaShivarathri.festName);
		System.out.println("Fest Month : "+mahaShivarathri.month);
		System.out.println("There is a Holiday : "+mahaShivarathri.holiday);
		System.out.println("----------Festival is Over----------");
		
		Festival ugadi = new Festival("Ugadi",3,true);
		System.out.println("Festname : "+ugadi.festName);
		System.out.println("Fest Month : "+ugadi.month);
		System.out.println("There is a Holiday : "+ugadi.holiday);
		System.out.println("----------Festival is Over----------");
		
		Festival independent = new Festival("Independent Day",8,true);
		System.out.println("Festname : "+independent.festName);
		System.out.println("Fest Month : "+independent.month);
		System.out.println("There is a Holiday : "+independent.holiday);
		System.out.println("----------Festival is Over----------");
		
		Festival holi = new Festival("Holi",3,true);
		System.out.println("Festname : "+holi.festName);
		System.out.println("Fest Month : "+holi.month);
		System.out.println("There is a Holiday : "+holi.holiday);
		System.out.println("----------Festival is Over----------");
		
		Chat yogesh = new Chat("Yogesh","WhatsApp",10);
		System.out.println("Chat With : "+yogesh.chatWith);
		System.out.println("Chat Through : "+yogesh.chatThrouh);
		System.out.println("Total Text : "+yogesh.totalText);
		System.out.println("----------Chat is Over----------");
		
		System.out.println("-----------------------------Lets chat with people------------------------------");
		

		
		Chat shashi = new Chat("Shashi","Instagram",10);
		System.out.println("Chat With : "+shashi.chatWith);
		System.out.println("Chat Through : "+shashi.chatThrouh);
		System.out.println("Total Text : "+shashi.totalText);
		System.out.println("----------Chat is Over----------");
		
		Chat kirthi = new Chat("Kirthi","Instagram",10);
		System.out.println("Chat With : "+kirthi.chatWith);
		System.out.println("Chat Through : "+kirthi.chatThrouh);
		System.out.println("Total Text : "+kirthi.totalText);
		System.out.println("----------Chat is Over----------");
		
		Chat kavi = new Chat("kavi","Instagram",15);
		System.out.println("Chat With : "+kavi.chatWith);
		System.out.println("Chat Through : "+kavi.chatThrouh);
		System.out.println("Total Text : "+kavi.totalText);
		System.out.println("----------Chat is Over----------");
		
		Chat rashmi = new Chat("Rashmi","Instagram",10000);
		System.out.println("Chat With : "+rashmi.chatWith);
		System.out.println("Chat Through : "+rashmi.chatThrouh);
		System.out.println("Total Text : "+rashmi.totalText);
		System.out.println("----------Chat is Over----------");
		
		Chat prakruthi = new Chat("Prakruthi","Instagram",200000);
		System.out.println("Chat With : "+prakruthi.chatWith);
		System.out.println("Chat Through : "+prakruthi.chatThrouh);
		System.out.println("Total Text : "+prakruthi.totalText);
		System.out.println("----------Chat is Over----------");
		
		
		Charger samsungCharger = new Charger("Samsung", 25, true);
		System.out.println("Charger Brand: " + samsungCharger.brand + ", Power: " + samsungCharger.power + "W, FastCharge: " + samsungCharger.fastCharge);

		Harpic floorCleaner = new Harpic("Liquid", 500, true);
		System.out.println("Harpic Type: " + floorCleaner.type + ", Quantity: " + floorCleaner.quantity + "ml, Is Liquid: " + floorCleaner.isLiquid);

		WhatsApp latestVersion = new WhatsApp("2.23.10", 2000000000, true);
        System.out.println("WhatsApp Version: " + latestVersion.version + ", Encryption: " + latestVersion.encrypted + ", Users: " + latestVersion.users);
		
		RatPoison killIt = new RatPoison("Kill-It",250,true);
		System.out.println("RatPoison Brand: " + killIt.brand + ", Toxic: " + killIt.isEffective + ", Weight: " + killIt.weight + "g");

		Anklet silverAnklet = new Anklet("Silver", 10, true);
		System.out.println("Anklet Material: " + silverAnklet.material + ", Length: " + silverAnklet.length + "cm, Adjustable: " + silverAnklet.adjustable);

		Magnet strongMagnet = new Magnet("Neodymium", 50, true);
		System.out.println("Magnet Type: " + strongMagnet.type + ", Strength: " + strongMagnet.strength + ", Permanent: " + strongMagnet.permanent);

		Chain goldChain = new Chain("Gold", 60, true);
		System.out.println("Chain Material: " + goldChain.material + ", Length: " + goldChain.length + "cm, RustProof: " + goldChain.rustProof);

		Bar localBar = new Bar("The Hub",100,true);
		System.out.println("Bar Name: " + localBar.name + ", Open Late: " + localBar.openLate + ", Capacity: " + localBar.capacity);

		Sagar myCity = new Sagar("Karnataka", 100000, true);
		System.out.println("Sagar Location: " + myCity.location + ", Population: " + myCity.population + ", Tourist Spot: " + myCity.isTouristPlace);

		Face myFace = new Face("Fair",22,true );
		System.out.println("Face Complexion: " + myFace.shape + ", Has Beard: " + myFace.hasBeard + ", Age: " + myFace.age);
	
	
	}
}