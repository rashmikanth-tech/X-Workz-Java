class Rocket{
	void launch(Fuel fuel){
		if(fuel!=null){
			fuel.fuelInfo();
		}else{
			System.out.println("Fuel is null,cannot run..");
		}
	}
}