class NailPolish{
	String brand;
	String color;
	double volume;
	boolean isMatteFinish;
	double price;
	boolean isQuickDry;
	String expiryDate;
	
	NailPolish(){
		super();
		System.out.println("no-argument constructor");
	}
	NailPolish(String brand){
		this();
		this.brand=brand;
		System.out.println("String in nailpolish");
	}
	NailPolish(String brand,String color){
		this(brand);
		this.color=color;
		System.out.println("String,String in nailpolish");
	}
	NailPolish(String brand,String color,double volume){
		this(brand,color);
		this.volume=volume;
		System.out.println("String,String,double in nailpolish");
	}
	NailPolish(String brand,String color,double volume,boolean isMatteFinish){
		this(brand,color,volume);
		this.isMatteFinish=isMatteFinish;
		System.out.println("String,String,double,boolean in nailpolish");
	}
	NailPolish(String brand,String color,double volume,boolean isMatteFinish,double price){
		this(brand,color,volume,isMatteFinish);
		this.price=price;
		System.out.println("String,String,double,boolean,double in nailpolish");
	}
	NailPolish(String brand,String color,double volume,boolean isMatteFinish,double price,boolean isQuickDry){
		this(brand,color,volume,isMatteFinish,price);
		this.isQuickDry=isQuickDry;
		System.out.println("String,String,double,boolean,double,boolean in nailpolish");
	}
	NailPolish(String brand,String color,double volume,boolean isMatteFinish,double price,boolean isQuickDry,String expiryDate){
		this(brand,color,volume,isMatteFinish,price,isQuickDry);
		this.expiryDate=expiryDate;
		System.out.println("String,String,double,boolean,double,boolean,String in nailpolish");
	}
	String display(){
		System.out.println("End of nailpolish");
		return "end";
	}
}