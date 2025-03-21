class Color{
	String name;
	String code;
	boolean isOriginal;
	boolean isEdible;
	double weight;
	double price;
	String fragrance;
	
	Color(){
		super();
		System.out.println("no-argument constructor");
	}
	Color(String name){
		this();
		this.name=name;
		System.out.println("String in color");
	}
	Color(String name,String code){
		this(name);
		this.code=code;
		System.out.println("String,String in color");
	}
	Color(String name,String code,boolean isOriginal){
		this(name,code);
		this.isOriginal=isOriginal;
		System.out.println("String,String,boolean in color");
	}
	Color(String name,String code,boolean isOriginal,boolean isEdible){
		this(name,code,isOriginal);
		this.isEdible=isEdible;
		System.out.println("String,String,boolean,boolean in color");
	}
	Color(String name,String code,boolean isOriginal,boolean isEdible,double weight){
		this(name,code,isOriginal,isEdible);
		this.weight=weight;
		System.out.println("String,String,boolean,boolean,double in color");
	}
	Color(String name,String code,boolean isOriginal,boolean isEdible,double weight,double price){
		this(name,code,isOriginal,isEdible,weight);
		this.price=price;
		System.out.println("String,String,boolean,boolean,double,double in color");
	}
	Color(String name,String code,boolean isOriginal,boolean isEdible,double weight,double price,String fragrance){
		this(name,code,isOriginal,isEdible,weight,price);
		this.fragrance=fragrance;
		System.out.println("String,String,boolean,boolean,double,double,String in color");
	}
	String display(){
		System.out.println("End of Color:");
		return "end";
	}
}