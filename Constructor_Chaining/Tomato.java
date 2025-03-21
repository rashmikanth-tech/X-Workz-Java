class Tomato{
	String variety;
	String color;
	double weight;
	double diameter;
	boolean isOriginal;
	double price;
	boolean isEdible;
	
	Tomato(){
		super();
		System.out.println("no-argument constructor");
	}
	
	Tomato(String variety){
		this();
		this.variety=variety;
		Syste.out.println("String in tomato");
	}
	Tomato(String variety,String color){
		this(variety);
		this.color=color;
		Syste.out.println("String,String in tomato");
	}
	Tomato(String variety,String color,double weight){
		this(variety,color);
		this.weight=weight;
		Syste.out.println("String,String,double in tomato");
	}
	Tomato(String variety,String color,double weight,double diameter){
		this(variety,color,weight);
		this.diameter=diameter;
		Syste.out.println("String,String,double,double in tomato");
	}
	Tomato(String variety,String color,double weight,double diameter,boolean isOriginal){
		this(variety,color,weight,diameter);
		this.isOriginal=isOriginal;
		Syste.out.println("String,String,double,double,boolean in tomato");
	}
	Tomato(String variety,String color,double weight,double diameter,boolean isOriginal,double price){
		this(variety,color,weight,diameter,isOriginal);
		this.price=price;
		Syste.out.println("String,String,double,double,boolean,double in tomato");
	}
	Tomato(String variety,String color,double weight,double diameter,boolean isOriginal,double price,boolean isEdible){
		this(variety,color,weight,diameter,isOriginal,isEdible);
		this.isEdible=isEdible;
		Syste.out.println("String,String,double,double,boolean,double,boolean in tomato");
	}
	String display(){
		System.out.println("End of tomato");
		return "end";
	}
}