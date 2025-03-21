class Barber{
	void cutHair(Customer customer){
		if(customer!=null){
			customer.customerInfo();
		}else{
			System.out.println("Customer is null,cannot run..");
		}
	}
}