package casting;

public class TripuraParentRunner {
    public static void main(String[] args) {

        TripuraParent obj1 = new TripuraParent();
        obj1.countryInfo();
        obj1.stateAnimal();
        obj1.stateBird();
        obj1.stateSport();
        obj1.stateFlower();
        System.out.println("----------------------");

        TripuraParent obj2 = new TripuraParentDetails();
        obj2.countryInfo();
        obj2.stateAnimal();
        obj2.stateBird();
        obj2.stateSport();
        obj2.stateFlower();
        System.out.println("----------------------");

        TripuraParentDetails obj3 = new TripuraParentDetails();
        obj3.countryInfo();
        obj3.stateAnimal();
        obj3.stateBird();
        obj3.stateSport();
        obj3.stateFlower();
        obj3.extraMethod();
        System.out.println("----------------------");

        TripuraParentCast caster = new TripuraParentCast();
        caster.cast(obj2);
    }
}
