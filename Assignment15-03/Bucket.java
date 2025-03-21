class Bucket{
	String material;
	String color;
	double capacity;
	double height;
	double weight;
	boolean isHandle;
	double price;
	
	Bucket(){
		super();
		System.out.println("no-argument constructor");
	}
	Bucket(String material){
		this();
		this.material=material;
		System.out.println("String in bucket");
	}
	Bucket(String material,String color){
		this(material);
		this.color=color;
		System.out.println("String,String in bucket");
	}
	Bucket(String material,String color,double capacity){
		this(material,color);
		this.capacity=capacity;
		System.out.println("String,String,double in bucket");
	}
	Bucket(String material,String color,double capacity,double height){
		this(material,color,capacity);
		this.height=height;
		System.out.println("String,String,double,double in bucket");
	}
	Bucket(String material,String color,double capacity,double height,double weight){
		this(material,color,capacity,height);
		this.weight=weight;
		System.out.println("String,String,double,double,double in bucket");
	}
	Bucket(String material,String color,double capacity,double height,double weight,boolean isHandle){
		this(material,color,capacity,height,weight);
		this.isHandle=isHandle;
		System.out.println("String,String,double,double,double,boolean in bucket");
	}
	Bucket(String material,String color,double capacity,double height,double weight,boolean isHandle,double price){
		this(material,color,capacity,height,weight,isHandle);
		this.price=price;
		System.out.println("String,String,double,double,double,boolean,double in bucket");
	}
	String display(){
		System.out.println("End of bucket");
		return "end";
	}
}