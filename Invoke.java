class Invoke {
    public static void main(String[] args) {
        System.out.println("Details of All Items");

        
		// Fridge Details
        Fridge.Reqirement();
        Fridge.Doors();
        Fridge.Specification();
        Fridge.items();
        Fridge.warning();

       

        // Forest Details
        System.out.println("\nForest Details");
        Forest.nature();
		Forest.animals();
		Forest.birds();
		Forest.lake();
		Forest.TypesofFruit();
		Forest.homedetails();

        // Car Details
        System.out.println("\nCar Details");
         Car.specifications();
        Car.engine();
        Car.features();
        Car.fuelType();
        Car.warranty();

        // Laptop Details
        System.out.println("\nLaptop Details");
        Laptop.specifications();
        Laptop.memory();
        Laptop.features();
        Laptop.battery();
        Laptop.warranty();

        // Bangalore Traffic Details
        System.out.println("\nBangalore Traffic Details");
        BangaloreTraffic.trafficStatus();
        BangaloreTraffic.majorAreas();
        BangaloreTraffic.causes();
        BangaloreTraffic.solutions();
        BangaloreTraffic.alternativeRoutes();

        // Hotel Details
        System.out.println("\nHotel Details");
        Restaurant.details();
        Restaurant.menu();
        Restaurant.timings();
        Restaurant.seatingCapacity();
        Restaurant.hygieneRating();

        // School Details
        System.out.println("\nSchool Details");
        School.details();
        School.facilities();
        School.rules();
        School.staff();
        School.students();

        // Mobile Details
        System.out.println("\nMobile Details");
        MobilePhone.specifications();
        MobilePhone.battery();
        MobilePhone.features();
        MobilePhone.connectivity();
        MobilePhone.warranty();

        // Bike Details
        System.out.println("\nBike Details");
		Bike.specifications();
        Bike.engine();
        Bike.features();
        Bike.weight();
		Bike.warranty();
	}
}