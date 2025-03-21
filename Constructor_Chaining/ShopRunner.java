class Runner{
	public static void main(String[] args){
		Display display=new Display();
		Shop shop=new Shop();
		shop.ads(display);
		
		Poster poster=new Poster();
		Theater theater=new Theater();
		theater.show(poster);
	}
}