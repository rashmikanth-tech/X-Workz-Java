class WaterBall{
	String material;
	String color;
	double diameter;
	double weight;
	double capacity;
	boolean isReusable;
	double price;
	
	WaterBall(){
		super();
		System.out.println("no-argument constructor");
	}
	WaterBall(String material){
		this();
		this.material=material;
		System.out.println("String in waterball");
	}
	WaterBall(String material,String color){
		this(material);
		this.color=color;
		System.out.println("String,String in waterball");
	}
	WaterBall(String material,String color,double diameter){
		this(material,color);
		this.diameter=diameter;
		System.out.println("String,String,double in waterball");
	}
	WaterBall(String material,String color,double diameter,double weight){
		this(material,color,diameter);
		this.weight=weight;
		System.out.println("String,String,double,double in waterball");
	}
	WaterBall(String material,String color,double diameter,double weight,double capacity){
		this(material,color,diameter,weight);
		this.capacity=capacity;
		System.out.println("String,String,double,double,double in waterball");
	}
	WaterBall(String material,String color,double diameter,double weight,double capacity,boolean isReusable){
		this(material,color,diameter,weight,capacity);
		this.isReusable=isReusable;
		System.out.println("String,String,double,double,double,boolean in waterball");
	}
	WaterBall(String material,String color,double diameter,double weight,double capacity,boolean isReusable,double price){
		this(material,color,diameter,weight,capacity,isReusable);
		this.price=price;
		System.out.println("String,String,double,double,double,boolean,double in waterball");
	}
	String display(){
		System.out.println("End of waterball");
		return "end";
	}
}