class Runner{
	public static void main(String[] args){
		Display display=new Display();
		Shop shop=new Shop();
		shop.ads(display);
		
		Poster poster=new Poster();
		Theater theater=new Theater();
		theater.show(poster);
		
		Team team=new Team();
		RCB rcb=new RCB();
		rcb.playMatch(team);
		
		Galaxy galaxy=new Galaxy();
		Space space=new Space();
		space.explore(galaxy);
		
		Fuel fuel=new Fuel();
		Rocket rocket=new Rocket();
		rocket.launch(fuel);
		
		Medicine medicine=new Medicine();
		Dolo650 dolo650=new Dolo650();
		dolo650.take(medicine);
		
		Customer customer=new Customer();
		Barber barber=new Barber();
		barber.cutHair(customer);
		
		Photo photo=new Photo();
		Camera camera=new Camera();
		camera.capture(photo);
		
		Person person=new Person();
		Mango mango=new Mango();
		mango.eat(person);
		
		Human human=new Human();
		Pillow pillow=new Pillow();
		pillow.sleep(human);
	}
}