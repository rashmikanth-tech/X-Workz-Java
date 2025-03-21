class Baloon{
	String color;
	double size;
	String shape;
	String material;
	boolean isInflated;
	String gasType;
	double weight;
	
	Baloon(){
		super();
		System.out.println("no-arg constructor");
	}
	Baloon(String color){
		this();
		this.color=color;
		System.out.println("String in baloon");
	}
	Baloon(String color,double size){
		this(color);
		this.size=size;
		System.out.println("String,double in baloon");
	}
	Baloon(String color,double size,String shape){
		this(color,size);
		this.shape=shape;
		System.out.println("String,double,String in baloon");
	}
	Baloon(String color,double size,String shape,String material){
		this(color,size,shape);
		this.material=material;
		System.out.println("String,double,String,String in baloon");
	}
	Baloon(String color,double size,String shape,String material,boolean isInflated){
		this(color,size,shape,material);
		this.isInflated=isInflated;
		System.out.println("String,double,String,String,String in baloon");
	}
	Baloon(String color,double size,String shape,String material,boolean isInflated,String gasType){
		this(color,size,shape,material,isInflated);
		this.gasType=gasType;
		System.out.println("String,double,String,String,String,String in baloon");
	}
	Baloon(String color,double size,String shape,String material,boolean isInflated,String gasType,double weight){
		this(color,size,shape,material,isInflated,gasType);
		this.weight=weight;
		System.out.println("String,double,String,String,String,String,double in baloon");
	}
	String display(){
		//this(color,size,shape,material,isInflated,gasType,weight);
		System.out.println("End of baloon");
		return "end";
	}
}