class Mango{
	void eat(Person person){
		if(person!=null){
			person.personInfo();
		}else{
			System.out.println("Person is null,cannot run..");
		}
	}
}