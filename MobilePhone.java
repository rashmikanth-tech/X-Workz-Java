class MobilePhone {
    public static void specifications() {
        String brand = "Samsung";
        String model = "Galaxy S23";
        System.out.println("Phone Specifications");
        System.out.println("Brand: " + brand + "\nModel: " + model);
    }

    public static void battery() {
        int capacity = 5000;
        String type = "Li-ion";
        System.out.println("Battery Details");
        System.out.println("Capacity: " + capacity + "mAh\nType: " + type);
    }

    public static void features() {
        String camera = "108MP";
        String security = "Face Unlock, Fingerprint";
        System.out.println("Features");
        System.out.println("Camera: " + camera + "\nSecurity: " + security);
    }

    public static void connectivity() {
        String network = "5G, Wi-Fi 6";
        System.out.println("Connectivity: " + network);
    }

    public static void warranty() {
        int years = 2;
        System.out.println("Warranty: " + years + " years");
    }

    public static void main(String[] args) {
        specifications();
        battery();
        features();
        connectivity();
        warranty();
    }
}
