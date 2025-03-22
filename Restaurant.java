class Restaurant {
    public static void details() {
        String name = "The Spice Hub";
        String location = "MG Road, Bangalore";
        System.out.println("Restaurant Details");
        System.out.println("Name: " + name + "\nLocation: " + location);
    }

    public static void menu() {
        String specialDish = "Butter Chicken";
        String drinks = "Mojito, Cold Coffee";
        System.out.println("Menu");
        System.out.println("Special Dish: " + specialDish + "\nDrinks: " + drinks);
    }

    public static void timings() {
        String opening = "10:00 AM";
        String closing = "11:00 PM";
        System.out.println("Timings");
        System.out.println("Opening Time: " + opening + "\nClosing Time: " + closing);
    }

    public static void seatingCapacity() {
        int capacity = 100;
        System.out.println("Seating Capacity: " + capacity);
    }

    public static void hygieneRating() {
        float rating = 4.5f;
        System.out.println("Hygiene Rating: " + rating + " stars");
    }

    public static void main(String[] args) {
        details();
        menu();
        timings();
        seatingCapacity();
        hygieneRating();
    }
}
