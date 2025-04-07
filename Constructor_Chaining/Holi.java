class Holi{
	String name;
	String date;
	int days;
	boolean isReligious;
	String region;
	String celebrationType;
	String saftyGuidelines;
	
	Holi(){
		super();
		System.out.println("no-arg constructor");
	}
	Holi(String name){
		this();
		this.name=name;
		System.out.println("String in holi");
	}
	Holi(String name,String date){
		this(name);
		this.date=date;
		System.out.println("String,String in holi");
	}
	Holi(String name,String date,int days){
		this(name,date);
		this.days=days;
		System.out.println("String,String,int in holi");
	}
	Holi(String name,String date,int days,boolean isReligious){
		this(name,date,days);
		this.isReligious=isReligious;
		System.out.println("String,String,int,boolean in holi");
	}
	Holi(String name,String date,int days,boolean isReligious,String region){
		this(name,date,days,isReligious);
		this.region=region;
		System.out.println("String,String,int,boolean,String in holi");
	}
	Holi(String name,String date,int days,boolean isReligious,String region,String celebrationType){
		this(name,date,days,isReligious,region);
		this.celebrationType=celebrationType;
		System.out.println("String,String,int,boolean,String,String in holi");
	}
	Holi(String name,String date,int days,boolean isReligious,String region,String celebrationType,String saftyGuidelines){
		this(name,date,days,isReligious,region,celebrationType);
		this.saftyGuidelines=saftyGuidelines;
        System.out.println("String,String,int,boolean,String,String,String in holi");	}
	String display(){
		System.out.println("End of holi");
		return "end";
	}
}