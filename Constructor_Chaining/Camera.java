class Camera{
	void capture(Photo photo){
		if(photo!=null){
			photo.photoInfo();
		}else{
			System.out.println("Photo is  null,cannot run..");
		}
	}
}