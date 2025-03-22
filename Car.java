class Car {
    public static void specifications() {
        String brand = "Toyota";
        String model = "Camry";
        System.out.println("Car Specifications");
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

    public static void engine() {
        int horsepower = 200;
        float capacity = 2.5f;
        System.out.println("Engine Details");
        System.out.println("Horsepower: " + horsepower + "\nCapacity: " + capacity + "L");
    }

    public static void features() {
        String safety = "ABS, Airbags";
        String comfort = "AC, Sunroof";
        System.out.println("Features");
        System.out.println("Safety: " + safety + "\nComfort: " + comfort);
    }

    public static void fuelType() {
        String fuel = "Petrol";
        System.out.println("Fuel Type: " + fuel);
    }

    public static void warranty() {
        int years = 5;
        System.out.println("Warranty: " + years + " years");
    }

    public static void main(String[] args) {
        specifications();
        engine();
        features();
        fuelType();
        warranty();
    }
}
