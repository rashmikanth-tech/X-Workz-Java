class Space{
	void explore(Galaxy galaxy){
		if(galaxy!=null){
			galaxy.galaxyInfo();
		}else{
			System.out.println("Galaxy is null,cannot run..");
		}
	}
}