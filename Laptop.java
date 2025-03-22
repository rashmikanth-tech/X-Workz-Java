class Laptop {
    public static void specifications() {
        String brand = "Dell";
        String processor = "Intel i7";
        System.out.println("Laptop Specifications");
        System.out.println("Brand: " + brand + "\nProcessor: " + processor);
    }

    public static void memory() {
        int ram = 16;
        int storage = 512;
        System.out.println("Memory Details");
        System.out.println("RAM: " + ram + "GB\nStorage: " + storage + "GB SSD");
    }

    public static void features() {
        String display = "15.6-inch Full HD";
        String os = "Windows 11";
        System.out.println("Features");
        System.out.println("Display: " + display + "\nOperating System: " + os);
    }

    public static void battery() {
        int backup = 8;
        System.out.println("Battery Backup: " + backup + " hours");
    }

    public static void warranty() {
        int years = 3;
        System.out.println("Warranty: " + years + " years");
    }

    public static void main(String[] args) {
        specifications();
        memory();
        features();
        battery();
        warranty();
    }
}
