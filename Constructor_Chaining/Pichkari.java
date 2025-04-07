class Pichkari{
	String brand;
	String material;
	String color;
	double capacity;
	double length;
	boolean isReusable;
	double weight;
	
	Pichkari(){
		super();
		System.out.println("no-arg constructor");
	}
	Pichkari(String brand){
		this();
		this.brand=brand;
		System.out.println("String in pichkari");
	}
	Pichkari(String brand,String material){
		this(brand);
		this.material=material;
		System.out.println("String,String in pichkari");
	}
	Pichkari(String brand,String material,String color){
		this(brand,material);
		this.color=color;
		System.out.println("String,String,String in pichkari");
	}
	Pichkari(String brand,String material,String color,double capacity){
		this(brand,material,color);
		this.capacity=capacity;
		System.out.println("String,String,String,double in pichkari");
	}
	Pichkari(String brand,String material,String color,double capacity,double length){
		this(brand,material,color,capacity);
		this.length=length;
		System.out.println("String,String,String,double,double in pichkari");
	}
	Pichkari(String brand,String material,String color,double capacity,double length,boolean isReusable){
		this(brand,material,color,capacity,length);
		this.isReusable=isReusable;
		System.out.println("String,String,String,double,double,boolean in pichkari");
	}
	Pichkari(String brand,String material,String color,double capacity,double length,boolean isReusable,double weight){
		this(brand,material,color,capacity,length,isReusable);
		this.weight=weight;
		System.out.println("String,String,String,double,double,boolean,double in pichkari");
	}
	String display(){
		System.out.println("End of pichkari");
		return "end";
	}
}