class BangaloreTraffic {
    public static void trafficStatus() {
        String peakHours = "8 AM - 11 AM & 5 PM - 9 PM";
        String congestion = "Very High";
        System.out.println("Traffic Status in Bangalore");
        System.out.println("Peak Hours: " + peakHours + "\nCongestion Level: " + congestion);
    }

    public static void majorAreas() {
        String areas = "Silk Board, KR Puram, Marathahalli, Hebbal, Electronic City";
        System.out.println("Major Traffic Congestion Areas");
        System.out.println("Areas: " + areas);
    }

    public static void causes() {
        String reasons = "High vehicle density, Poor road infrastructure, Metro construction, Bad driving habits";
        System.out.println("Main Causes of Traffic");
        System.out.println("Reasons: " + reasons);
    }

    public static void solutions() {
        String suggestions = "Carpooling, Using Metro, Avoid peak hours, Work from home if possible";
        System.out.println("Possible Solutions");
        System.out.println("Suggestions: " + suggestions);
    }

    public static void alternativeRoutes() {
        String routes = "ORR (Outer Ring Road), NICE Road, Metro Rail";
        System.out.println("Alternative Routes");
        System.out.println("Recommended Routes: " + routes);
    }

    public static void main(String[] args) {
        trafficStatus();
        majorAreas();
        causes();
        solutions();
        alternativeRoutes();
    }
}
