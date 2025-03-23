class Egg{
	String eggType;
	String size;
	double weight;
	String color;
	boolean isOriginal;
	double price;
	boolean isFertilized;
	
	Egg(){
		super();
		System.out.println("no-argument constructor");
	}
	Egg(String eggType){
		this();
		this.eggType=eggType;
		System.out.println("String in egg");
	}
	Egg(String eggType,String size){
		this(eggType);
		this.size=size;
		System.out.println("String,String in egg");
	}
	Egg(String eggType,String size,double weight){
		this(eggType,size);
		this.weight=weight;
		System.out.println("String,String,double in egg");
	}
	Egg(String eggType,String size,double weight,String color){
		this(eggType,size,weight);
		this.color=color;
		System.out.println("String,String,double,String in egg");
	}
	Egg(String eggType,String size,double weight,String color,boolean isOriginal){
		this(eggType,size,weight,color);
		this.isOriginal=isOriginal;
		System.out.println("String,String,double,String,boolean in egg");
	}
	Egg(String eggType,String size,double weight,String color,boolean isOriginal,double price){
		this(eggType,size,weight,color,isOriginal);
		this.price=price;
		System.out.println("String,String,double,String,boolean,double in egg");
	}
	Egg(String eggType,String size,double weight,String color,boolean isOriginal,double price,boolean isFertilized){
		this(eggType,size,weight,color,isOriginal,price);
		this.isFertilized=isFertilized;
		System.out.println("String,String,double,String,boolean,double,boolean in egg");
	}
	String display(){
		System.out.println("End of egg");
		return "end";
	}
}