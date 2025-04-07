class PostHeadMaster{
	public static void deliver(String customername, String address){
	System.out.println("PostHeadMaster Start delivering Post into "+customername+" Adress "+address);
	PostMaster.deliver(customername,address);
	}
}