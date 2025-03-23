class Mydetails{
	public static void main(String []args){
		//type 1 Directly Initialize
		Rashmikanth.myAge(23);
		Rashmikanth.myHeight(5.11);
		Rashmikanth.bloodGroup("b+");
		//type 2 use any varialbe that should match type and same variable in inside 
		String ca ="Indian";
		short sze =10;
		Rashmikanth.color(ca,sze);
		String wo = "X workz";
		int miles = 10;
		Rashmikanth.work(wo,miles);
		//type 3 we can use same varible names
		String place = "Malnad";
		int pincode = 577436;
		long mobileNo = 6361948042l;
		Rashmikanth.myAddress(place,pincode,mobileNo);
		
		// i prefer
		Rashmikanth.letExperiment((byte)1,(short)6,10,5.5f,200,6361948042l,"Rashmikanth",true);
	}
}