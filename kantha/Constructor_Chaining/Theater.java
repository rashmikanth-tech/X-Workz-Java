class Theater{
	public void show(Poster poster){
		if(poster!=null){
			poster.showInfo();
		}else{
			System.out.println("Poster is null,cannot run..");
		}
	}
}