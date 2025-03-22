class School {
    public static void details() {
        String name = "Greenwood High";
        int established = 1995;
        System.out.println("School Details");
        System.out.println("Name: " + name + "\nEstablished: " + established);
    }

    public static void facilities() {
        String library = "5000 books";
        String sports = "Football, Basketball, Cricket";
        System.out.println("Facilities");
        System.out.println("Library: " + library + "\nSports: " + sports);
    }

    public static void rules() {
        String uniform = "Mandatory";
        String attendance = "80% required";
        System.out.println("Rules");
        System.out.println("Uniform: " + uniform + "\nAttendance: " + attendance);
    }

    public static void staff() {
        int teachers = 50;
        System.out.println("Total Staff: " + teachers);
    }

    public static void students() {
        int count = 1200;
        System.out.println("Total Students: " + count);
    }

    public static void main(String[] args) {
        details();
        facilities();
        rules();
        staff();
        students();
    }
}
