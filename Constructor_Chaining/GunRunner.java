class GunRunner{
	public static void main(String[] args){
		Gun gun=new Gun("Glock17", "9mm", 900.0,4.5,false,17,"Polymer");
		System.out.println(gun.display());
	}
}