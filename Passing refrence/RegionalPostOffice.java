class RegionalPostOffice{
	public static void deliver(String customername, String address){
	System.out.println("RegionalPostOffice Start delivering Post into "+customername+" Adress "+address);
	PostHeadMaster.deliver(customername,address);
	}
}