public class House {
    private String Color;
    String Address;
    double number;
    public House() {
        super();
        System.out.println("emty");

    }
    public House(String Color){
        this();
        this.Color= Color;

        System.out.println();
    }

    public House(String Color,double number){
        this(Color);
        this.Address=Address;
        this.Color= Color;
        System.out.println();

    }

    public static void main(String[] args) {
        House house = new House();
        House house1 = new House("Red");
        House house2 = new House("Green",6467);
    }
}