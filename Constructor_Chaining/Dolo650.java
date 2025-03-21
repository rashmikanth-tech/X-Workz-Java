class Dolo650{
	void take(Medicine medicine){
		if(medicine!= null){
			medicine.medicineInfo();
		}else{
			System.out.println("Medicine is null,cannot run..");
		}
	}
}