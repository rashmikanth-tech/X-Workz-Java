class Gun{
	String model;
	String caliber;
	double weight;
	double barrelLength;
	boolean isAutomatic;
	int capacity;
	String material;
	
	Gun(){
		super();
		System.out.println("no-argument constructor");
	}
	Gun(String model){
		this();
		this.model=model;
		System.out.println("String in gun");
	}
	Gun(String model,String caliber){
		this(model);
		this.caliber=caliber;
		System.out.println("String,String in gun");
	}
	Gun(String model,String caliber,double weight){
		this(model,caliber);
		this.weight=weight;
		System.out.println("String,String,double in gun");
	}
	Gun(String model,String caliber,double weight,double barrelLength){
		this(model,caliber,weight);
		this.barrelLength=barrelLength;
		System.out.println("String,String,double,double in gun");
	}
	Gun(String model,String caliber,double weight,double barrelLength,boolean isAutomatic){
		this(model,caliber,weight,barrelLength);
		this.isAutomatic=isAutomatic;
		System.out.println("String,String,double,double,boolean in gun");
	}
	Gun(String model,String caliber,double weight,double barrelLength,boolean isAutomatic,int capacity){
		this(model,caliber,weight,barrelLength,isAutomatic);
		this.capacity=capacity;
		System.out.println("String,String,double,double,boolean,int in gun");
	}
	Gun(String model,String caliber,double weight,double barrelLength,boolean isAutomatic,int capacity,String material){
		this(model,caliber,weight,barrelLength,isAutomatic,capacity);
		this.material=material;
		System.out.println("String,String,double,double,boolean,int,String in gun");
	}
	String display(){
		System.out.println("End of gun");
		return "end";
	}
}