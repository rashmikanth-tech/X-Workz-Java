class AreaPostOffice{
	public static void deliver(String customername, String address){
	System.out.println("AreaPostOffice delivered Post into "+customername+" Adress "+address);
	SubRegionalPostOffice.deliver(customername,address);
	}
}