class Water{
	String source;
	double pHLevel;
	double temp;
	boolean isPurified;
	double hardness;
	String color;
	String taste;
	
	Water(){
		super();
		System.out.println("no-argument constructor");
	}
	Water(String source){
		this();
		this.source=source;
		System.out.println("String in water");
	}
	Water(String source,double pHLevel){
		this(source);
		this.pHLevel=pHLevel;
		System.out.println("String,double in water");
	}
	Water(String source,double pHLevel,double temp){
		this(source,pHLevel);
		this.temp=temp;
		System.out.println("String,double,double in water");
	}
	Water(String source,double pHLevel,double temp,boolean isPurified){
		this(source,pHLevel,temp);
		this.isPurified=isPurified;
		System.out.println("String,double,double,boolean in water");
	}
	Water(String source,double pHLevel,double temp,boolean isPurified,double hardness){
		this(source,pHLevel,temp,isPurified);
		this.hardness=hardness;
		System.out.println("String,double,double,boolean,double in water");
	}
	Water(String source,double pHLevel,double temp,boolean isPurified,double hardness,String color){
		this(source,pHLevel,temp,isPurified,hardness);
		this.color=color;
		System.out.println("String,double,double,boolean,double,String in water");
	}
	Water(String source,double pHLevel,double temp,boolean isPurified,double hardness,String color,String taste){
		this(source,pHLevel,temp,isPurified,hardness,color);
		this.taste=taste;
		System.out.println("String,double,double,boolean,double,String,String in water");
	}
	String display(){
		System.out.println("End of water");
		return "end";
	}
}