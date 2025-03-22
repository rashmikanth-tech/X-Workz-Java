class Bike {
    public static void specifications() {
		System.out.println("House have bike that"); 
        String brand = "Honda";
        String model = "CBR 150R";
        System.out.println("Bike Specifications");
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

    public static void engine() {
        int cc = 150;
        String fuel = "Petrol";
        System.out.println("Engine Details");
        System.out.println("CC: " + cc + "\nFuel Type: " + fuel);
    }

    public static void features() {
        String brakes = "Disc Brakes";
        String mileage = "40 kmpl";
        System.out.println("Features");
        System.out.println("Brakes: " + brakes + "\nMileage: " + mileage);
    }

    public static void weight() {
        int kg = 140;
        System.out.println("Weight: " + kg + " kg");
    }

    public static void warranty() {
        int years = 5;
        System.out.println("Warranty: " + years + " years");
    }

    public static void main(String[] args) {
        specifications();
        engine();
        features();
        weight();
        warranty();
    }
}
